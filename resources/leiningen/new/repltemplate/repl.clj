(ns {{name}}.repl
  (:require [alembic.still :refer [distill lein]]
            [clojure.repl :refer :all]
            [clojure.tools.namespace.repl :refer [refresh]]
            [com.stuartsierra.component :as component]
            [slingshot.slingshot :refer :all]
            [{{name}}.core :refer :all]))

(defn init []
  (alter-var-root #'system
    (constantly (construct-{{name}} ))
                  ))

(defn start []
  (alter-var-root #'system component/start))

(defn stop []
  (alter-var-root #'system
    (fn [s] (when s (component/stop s)))))

(defn go []
  (init)
  (start))

(defn reset []
  (stop)
  (refresh :after '{{name}}.repl/go))
