(ns main.lambda)

;; our main export
(defn handler [event context callback]
  (do (println event);; somethign for the logs
      (callback nil
        (clj->js {:statusCode 200
                  :body       "Hello from CLJS Lambda!"
                  :headers    {}}))))
