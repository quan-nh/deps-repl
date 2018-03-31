(ns foo.other-bar
  (:require [foo.bar :as bar]))

(defn -main [& args]
  (bar/hello (first args)))
