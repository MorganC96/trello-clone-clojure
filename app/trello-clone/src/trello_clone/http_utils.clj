(ns trello-clone.http-utils
    (:require [clojure.data.json :as json]))

(defn- json-content-type [map] 
    (merge map { "Content-Type" "application/json" } ))

(defn ok-response [body] 
{
    :status 200
    :body (json/write-str body)
    :headers (json-content-type {})
})

(defn not-found-response [body]
{
    :status 404
    :body (json/write-str body)
    :headers (json-content-type {})
})