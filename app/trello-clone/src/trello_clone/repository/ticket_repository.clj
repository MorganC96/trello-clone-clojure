(ns trello-clone.repository.ticket-repository
    (:require [next.jdbc :as jdbc]
        [trello-clone.db-utils :as db-utils]))

(def select-query "SELECT TICKET.ID, TICKET.NAME, TICKET.DESCRIPTION, TICKET.BOARD_ID FROM TICKET WHERE TICKET.ID = ?")

(defn get-ticket [id] 
    (jdbc/execute-one! (db-utils/get-datasource) [select-query id]))