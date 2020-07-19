(ns trello-clone.service.ticket-service
    (:require [trello-clone.repository.ticket-repository :as ticket-repository]))

(defn get-ticket [id]
    (ticket-repository/get-ticket id))