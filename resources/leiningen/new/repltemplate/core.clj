(ns {{name}}.core
  (:require [clojure.tools.logging :as log]
            [com.stuartsierra.component :as component]
            [{{name}}.components :refer :all]))

;; The system map of components.
(def system nil)

(defn construct-{{name}}
  "The constructor of the whole system."
  [& {:keys []
      :or {}}]
  (component/system-map
    ; Create the system map
    ))

(defn -main [& args]
  ;; (component/start (construct-{{name}} ))
  )
