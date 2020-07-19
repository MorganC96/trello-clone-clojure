(ns trello-clone.repository.lane-repository
    (:require [next.jdbc :as jdbc]
        [trello-clone.db-utils :as db-utils]))

(def select-query "SELECT LANE.ID, LANE.NAME, LANE.INDEX, LANE.BOARD_ID FROM LANE WHERE LANE.ID = ?")

(defn get-lane [id] 
    (jdbc/execute-one! (db-utils/get-datasource) [select-query id]))