(defproject trello-clone "0.1.0-SNAPSHOT"
  :description "Backend for Trello clone in Clojure"
  :dependencies [
    [org.clojure/clojure "1.10.1"]
    [http-kit "2.3.0"]
    [compojure "1.6.1"]
    [org.clojure/data.json "1.0.0"]
  ]
  :main ^:skip-aot trello-clone.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
