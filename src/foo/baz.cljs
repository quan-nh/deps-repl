(ns foo.baz
  (:require left-pad))

(defn -main []
  (prn (left-pad "foo" 5)))
