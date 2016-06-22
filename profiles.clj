{:user
  {   
   
   :dependencies [[org.clojure/tools.nrepl "0.2.12"]]
   :plugins [[cider/cider-nrepl "0.13.0-SNAPSHOT"]]}
 
 :repl
 {
  :dependencies [[org.clojure/tools.nrepl "0.2.12"]
                 [acyclic/squiggly-clojure "0.1.5"]]
  :plugins [[cider/cider-nrepl "0.13.0-SNAPSHOT"]]
  :env {:squiggly {:checkers [:eastwood :typed]
                   :eastwood-exclude-linters [:unlimited-use]}}}}
