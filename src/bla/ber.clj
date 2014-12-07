(ns bla.ber
  (:require [hiccup.def :refer [defhtml]]
  	        [hiccup.page :refer [include-js]]
  	        [hiccup.element :refer [javascript-tag]]
  	        [hiccup.util :refer [to-uri]]
  	        [clojure.java.io :as io]))

(defhtml olark [id]
  [:script {:data-cfasync "false"
            :type "text/javascript"
            :src (to-uri "/js/olark.js")}]

  (javascript-tag (str "olark.identify('" id "');"))

  [:noscript
    [:a {:href (str "https://www.olark.com/site/" id "/contact")
         :title "Contact us"
         :target "_blank"}
      "Questions? Feedback?"]

    "powered by "
    
    [:a {:href "http://www.olark.com?welcome"
         :title "Olark live chat software"}
      "Olark live chat software"]])