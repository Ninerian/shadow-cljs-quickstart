(ns starter.browser
  (:require [hx.react :as hx :refer [defnc]]
            [hx.hooks :as hooks]
            ["react-dom" :as react-om]))

;; start is called by init and after code reloading finishes
(defn ^:dev/after-load start []
  (js/console.log "start"))

(defn ^:export init []
  ;; init is called ONCE when the page loads
  ;; this is called in the index.html and must be exported
  ;; so it is available even in :advanced release builds
  (js/console.log "init2")
  (start))

;; this is called before any code is reloaded
(defn ^:dev/before-load stop []
  (js/console.log "stop"))


(defnc MyComponent [{:keys [initial-name]}]
  (let [[name update-name] (hooks/useState initial-name)]))
