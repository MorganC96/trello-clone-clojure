(ns trello-clone.handlers.board-handler
    (:require 
        [trello-clone.http-utils :as http-utils]
        [trello-clone.service.board-service :as board-service]))

(defn handle-get [req]
    (let [board (board-service/get-board (http-utils/get-id-param req))]
        (http-utils/ok-response board)))