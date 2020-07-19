(ns trello-clone.core
  (:require [org.httpkit.server :refer [run-server]]
    [compojure.core :refer :all]
    [compojure.route :as route]
    [trello-clone.handlers.board-handler :as board-handler]
    [trello-clone.handlers.ticket-handler :as ticket-handler]
    [trello-clone.handlers.lane-handler :as lane-handler]
    [trello-clone.http-utils :as http-utils])
  (:gen-class))

(defroutes app-routes
  (GET "/board/:id" [] board-handler/handle-get)
  (GET "/ticket/:id" [] ticket-handler/handle-get)
  (GET "/lane/:id" [] lane-handler/handle-get)
  (route/not-found (http-utils/not-found-response { "statusCode" "404" }))
)

(defn parse-int [number-string]
  (try (Integer/parseInt number-string)
    (catch Exception e nil)))

(def port-env-var (parse-int (System/getenv "PORT")))

(defn -main [& args]
  (let [port (if port-env-var port-env-var 8080 )]
    (run-server app-routes {:port port})
    (println (format "Server is running on port %d" port))
  )
)