(ns trello-clone.db-utils
    (:require [next.jdbc :as jdbc]))

(defn- get-db-spec [] 
    {
        :dbtype "mysql" 
        :dbname "app" 
        :user "user"
        :password "my-secret-password" 
        :host "mysql" 
        :port "3306"
    })


(defn get-datasource [] 
    (jdbc/get-datasource (get-db-spec)))