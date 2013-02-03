(ns yetibot.webapp.views.common
  (:use [hiccup.page :only [include-css include-js html5]]
        [hiccup.element]))

(def title "YetiBot – A command line in your Campfire")
(def version (System/getProperty "yetibot.version"))

(defn layout [& content]
  (html5
    [:head
      [:title title]
      (include-js "http://code.jquery.com/jquery-1.8.1.min.js" "/js/main.js")
      (include-css "/css/screen.css")]
    [:body
      [:div.content.animate
        (link-to "http://github.com/devth/yetibot"
                 (image {:class "yeti animate"} "/img/yeti.png")
                 [:h1 "yetibot"]
                 [:p version] )]]))
