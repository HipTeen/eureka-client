(defproject eureka-client "0.1.0-SNAPSHOT"
  :description "A client for Netflix Eureka service discovery"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [clj-http "1.0.0"]]
  :profiles {:dev {:dependencies [[org.clojure/data.json "0.2.5"]]
                   :plugins [[lein-midje "3.1.3"]]}})