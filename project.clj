(defproject sonian/carica "1.0.0"
  :description "A flexible configuration library"
  :dependencies [[cheshire "4.0.4"]
                 [org.clojure/tools.logging "0.2.3"]]
  :profiles {:dev
             {:resource-paths ["etc"],
              :dependencies [[org.clojure/clojure "1.4.0"]]}
             :1.5 {:dependencies [[org.clojure/clojure "1.5.0-beta1"]]}}
  :aliases {"all" ["with-profile" "dev:1.5,dev"]}
  ;; For Lein 1
  :dev-dependencies [[org.clojure/clojure "1.4.0"]]
  :dev-resources-path "etc")