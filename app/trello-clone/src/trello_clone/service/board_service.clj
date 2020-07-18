(ns trello-clone.service.board-service
    (:require [trello-clone.repository.board-repository :as board-repository]))

(defn get-board [id]
    (board-repository/get-board id))