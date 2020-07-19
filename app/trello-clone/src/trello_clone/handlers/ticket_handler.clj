(ns trello-clone.handlers.ticket-handler
    (:require 
        [trello-clone.http-utils :as http-utils]
        [trello-clone.service.ticket-service :as ticket-service]))

(defn handle-get [req]
    (let [ticket (ticket-service/get-ticket (http-utils/get-id-param req))]
        (http-utils/ok-response ticket)))