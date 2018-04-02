(ns foo.baz
  (:require left-pad))

(defn -main [& args]
  (let [s (first args)
        n (-> args second js/parseInt)]
    (prn (left-pad s n))))
