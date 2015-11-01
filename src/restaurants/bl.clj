(ns restaurants.bl
  (:use [restaurants.da]))

(defn getIsleOfCapriName []
  (get (restaurants.da/getRestaurantById "40364373") :name))

(defn getCuisineByRestaurant [restaurant] (get restaurant :cuisine))

(defn getCuisinesByBorough [borough]
  (map getCuisineByRestaurant (restaurants.da/getRestaurantsByBorough borough)))

(defn getUniqueCuisinesByBorough [borough]
  (set (getCuisinesByBorough borough)))