(ns trello-clone.core
  (:require [org.httpkit.server :refer [run-server]]
    [compojure.core :refer :all]
    [compojure.route :as route]
    [trello-clone.handlers.board-handler :as board-handler]
    [trello-clone.http-utils :as http-utils])
  (:gen-class))

(defroutes app-routes
  (GET "/board/:id" [] board-handler/handle-get)
  (route/not-found (http-utils/not-found-response { "statusCode" "404" }))
)

(defn -main [& args]
  (let [port 8080]
    (run-server app-routes {:port port})
    (println (format "Server is running on port %d" port))
  )
)