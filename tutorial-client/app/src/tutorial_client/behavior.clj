(ns ^:shared tutorial-client.behavior
    (:require [clojure.string :as string]
              [io.pedestal.app.messages :as msg]))

;(defn set-value-transform [old-value message]
  ;(:value message))

;(def example-app
  ;{:version 2
   ;:transform [[:set-value [:greeting] set-value-transform]]})

(def example-app
  {:version 2
   :transform [[:inc [:my-counter] inc-transform]]})

(defn inc-transform [old-value _]
  ((fnil inc 0) old-value))
