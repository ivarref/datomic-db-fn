(ns com.github.ivarref.generated
  (:require [clojure.edn :as edn]
            [datomic.api]))

; Generated code below, do not edit:
(def generated {:my-add "{:db/ident :my-add :db/fn #db/fn {:lang \"clojure\", :requires [[datomic.api :as d]], :imports [], :params [db e a v], :code (let [] (letfn [(curr-val [db e a] (do (d/q (quote [:find ?v . :in $ ?e ?a :where [?e ?a ?v]]) db e a)))] (let [genfn-coerce-arg (clojure.core/fn [x] (clojure.walk/prewalk (clojure.core/fn [e] (clojure.core/when (clojure.core/instance? clojure.lang.PersistentTreeMap e) (throw (clojure.core/ex-info \"Using sorted-map will cause different types in transactor for in-mem and remote\" {:val e}))) (clojure.core/when (clojure.core/or (clojure.core/= clojure.lang.PersistentList$EmptyList (.getClass e)) (clojure.core/instance? clojure.lang.PersistentList e)) (throw (clojure.core/ex-info \"Using list will cause indistinguishable types in transactor for in-mem and remote\" {:val e}))) (clojure.core/when (clojure.core/instance? clojure.lang.PersistentQueue e) (throw (clojure.core/ex-info \"Using clojure.lang.PersistentQueue does not work for remote transactor\" {:val e}))) (clojure.core/cond (clojure.core/instance? java.util.HashSet e) (clojure.core/into #{} e) (clojure.core/and (clojure.core/instance? java.util.List e) (clojure.core/not (clojure.core/vector? e))) (clojure.core/vec e) :else e)) x))] (let [e (genfn-coerce-arg e) a (genfn-coerce-arg a) v (genfn-coerce-arg v)] (do [[:db/add e a (+ (curr-val db e a) v)]])))))}}" 
                :my-add-2 "{:db/ident :my-add-2 :db/fn #db/fn {:lang \"clojure\", :requires [[datomic.api :as d]], :imports [], :params [db e a v], :code (let [] (letfn [(curr-val [db e a] (do (d/q (quote [:find ?v . :in $ ?e ?a :where [?e ?a ?v]]) db e a)))] (let [genfn-coerce-arg (clojure.core/fn [x] (clojure.walk/prewalk (clojure.core/fn [e] (clojure.core/when (clojure.core/instance? clojure.lang.PersistentTreeMap e) (throw (clojure.core/ex-info \"Using sorted-map will cause different types in transactor for in-mem and remote\" {:val e}))) (clojure.core/when (clojure.core/or (clojure.core/= clojure.lang.PersistentList$EmptyList (.getClass e)) (clojure.core/instance? clojure.lang.PersistentList e)) (throw (clojure.core/ex-info \"Using list will cause indistinguishable types in transactor for in-mem and remote\" {:val e}))) (clojure.core/when (clojure.core/instance? clojure.lang.PersistentQueue e) (throw (clojure.core/ex-info \"Using clojure.lang.PersistentQueue does not work for remote transactor\" {:val e}))) (clojure.core/cond (clojure.core/instance? java.util.HashSet e) (clojure.core/into #{} e) (clojure.core/and (clojure.core/instance? java.util.List e) (clojure.core/not (clojure.core/vector? e))) (clojure.core/vec e) :else e)) x))] (let [e (genfn-coerce-arg e) a (genfn-coerce-arg a) v (genfn-coerce-arg v)] (do [[:db/add e a (+ (curr-val db e a) v)]])))))}}"})
; End of generated code

(def schema
  (mapv (fn [s]
          (edn/read-string
            {:readers {'db/id  datomic.db/id-literal
                       'db/fn  datomic.function/construct}}
            s))
        (vals generated)))
