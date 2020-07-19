(ns trello-clone.repository.board-repository
    (:require [next.jdbc :as jdbc]
        [trello-clone.db-utils :as db-utils]))

(def select-query "SELECT BOARD.ID, BOARD.NAME FROM BOARD WHERE BOARD.ID = ?")

(defn get-board [id] 
    (jdbc/execute-one! (db-utils/get-datasource) [select-query id]))