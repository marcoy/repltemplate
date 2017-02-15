(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "FIXME: write description"

  :url "http://example.com/FIXME"

  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :repl-options { :init-ns {{name}}.repl }

  :plugins [[lein-cprint "1.2.0"]]

  :dependencies [[com.stuartsierra/component "0.3.2"]
                 [org.clojure/clojure "1.8.0"]
                 [org.clojure/core.match  "0.3.0-alpha4"]
                 [org.clojure/tools.logging "0.3.1"]
                 [org.clojure/tools.namespace "0.2.10"]
                 [slingshot "0.12.2"]]

  :profiles {:dev {:dependencies [[alembic "0.3.2"]]}})
