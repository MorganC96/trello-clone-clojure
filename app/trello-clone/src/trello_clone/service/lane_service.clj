(ns trello-clone.service.lane-service
    (:require [trello-clone.repository.lane-repository :as lane-repository]))

(defn get-lane [id]
    (lane-repository/get-lane id))