(ns trello-clone.handlers.board-handler
    (:require 
        [trello-clone.http-utils :as http-utils]
        [trello-clone.service.board-service :as board-service]))

(defn get-id [req]
    (get-in req [:params :id]))

(defn handle-get [req]
    (let [board (board-service/get-board (get-id req))]
        (http-utils/ok-response board)))