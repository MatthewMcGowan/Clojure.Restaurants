(ns restaurants.da
  (:require [monger.core :as mg]
            [monger.collection :as mc]))

(defn getRestaurantById [Id]
  (let [conn (mg/connect)
        db (mg/get-db conn "test")
        coll "restaurants"]
    (mc/find-one-as-map db coll { :restaurant_id Id })))

(defn getRestaurantsByBorough [borough]
  (let [conn (mg/connect)
        db (mg/get-db conn "test")
        coll "restaurants"]
    (mc/find-maps db coll { :borough borough })))