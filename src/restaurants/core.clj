(ns restaurants.core
  (:use [restaurants.bl])
  (:gen-class))

;;(require restaurants.da.clj)
;;(refer restaurants.da.clj)

(defn restaurantName [] (restaurants.bl/getIsleOfCapriName))

(defn getManhattanCuisines [] (restaurants.bl/getUniqueCuisinesByBorough "Manhattan"))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (restaurantName)))