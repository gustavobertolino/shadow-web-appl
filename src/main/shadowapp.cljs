(ns main.shadowapp
  (:require [reagent.dom :as d]
            [reagent.core :as r]))

;;(.alert js/window "Am I connected to Shadow-Cljs? Yes")
;;(shadow.cljs.devtools.api/repl :frontend)
(comment
 (.alert js/window "I'm connected to shadow-cljs!")
 (.log js/console "Hey cljs Dev!"))

(def my_log (.log js/console "Hey! I'm here!"))

(def my_name "Gustavo")
(def my_last_name "Bertolino")

(range 1 30 2)

(def my-map
  {:name "gustavo"
   :products {:type "car" :amount "$1000"}})

(def car1 (get-in my-map [:products :type]))

(tap> car1)

(defn other-div [] [:div [:h2 "Hello World!"]])

(defn atom-input [value]
  [:input {:type "text"
           :value @value
           :on-change #(reset! value (-> % .-target .-value))}])

(defn home-page []
  [:div [:h2 "Hello cljs-devs!"]
        [:h3 "Repl is awesome!"]
   [:h4 "Clojure is a great tool for frontend!!"]
   other-div])

(defn mount-root []
  (d/render [home-page]
            (.getElementById js/document "root")))

(defn after-load []
  (mount-root))
