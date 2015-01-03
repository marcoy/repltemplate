(defproject {{name}} "0.1.0-SNAPSHOT"
  :description "FIXME: write description"

  :url "http://example.com/FIXME"

  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}

  :repl-options { :init-ns {{name}}.repl }

  :plugins [[lein-cprint "1.0.0"]]

  :dependencies [[aprint "0.1.1"]
                 [org.clojure/clojure "1.6.0"]
                 [org.clojure/tools.namespace "0.2.8"]
                 [slingshot "0.12.1"]])
