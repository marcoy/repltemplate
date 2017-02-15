(ns {{name}}.components
  (:require [clojure.tools.logging :as log]
            [com.stuartsierra.component :as component]))

;; An example of a component
; (defrecord HttpKitServer [port threads influxdb]
;   component/Lifecycle
;   (start [hkit]
;     (do
;       (log/info "Starting up HTTP server")
;       (assoc hkit :server (run-server (mapi-routes influxdb)
;                                       {:port   port
;                                        :thread threads}))))
;   (stop [hkit]
;     (do
;       (log/info "Stopping HTTP server")
;       (when-let [stop-http-server (:server hkit)]
;         (stop-http-server :timeout 100)
;         (assoc hkit :server nil)))))
