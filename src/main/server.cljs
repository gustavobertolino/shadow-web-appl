(ns main.server
  (:require [cljs.nodejs :as nodejs]))

(def value-a 1)
(defonce value-b 2)

(defn reload! []
  (println "Code updated node.js, take a look dev!")
  (println "Trying values:" value-a value-b))

(.log js/console "Hey cljs Dev!")

(defn main! []
  (println "App loaded!"))
