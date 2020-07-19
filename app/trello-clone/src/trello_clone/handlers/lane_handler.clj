(ns trello-clone.handlers.lane-handler
    (:require 
        [trello-clone.http-utils :as http-utils]
        [trello-clone.service.lane-service :as lane-service]))

(defn handle-get [req]
    (let [lane (lane-service/get-lane (http-utils/get-id-param req))]
        (http-utils/ok-response lane)))