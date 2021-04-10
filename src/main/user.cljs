(ns main.user
  (:require
   [shadow.cljs.devtools.api :as shadow]))

(comment
  (defn change-to-cljs []
    (shadow/repl :frontend))

  (change-to-cljs))
