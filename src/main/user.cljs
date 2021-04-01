(ns main.user
  (:require
   [shadow.cljs.devtools.api :as shadow]))

(defonce change-to-cljs
  (fn [] (shadow/repl :frontend)))
