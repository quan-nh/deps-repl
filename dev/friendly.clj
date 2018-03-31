(ns friendly
  (:require [rebel-readline.main]
            [expound.alpha :as expound]
            [clojure.spec.alpha :as s]
            [clojure.spec.test.alpha :as st]))

(defn -main []
  (set! s/*explain-out* (expound/custom-printer {:print-specs? false :show-valid-values? true}))
  (st/instrument)
  (rebel-readline.main/-main))
