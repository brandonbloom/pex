(ns com.champbacon.impl.vm
  (:refer-clojure :exclude [pop]))

(definterface Stack
  (push [_ o])
  (pop [_]))

#_(deftype MutableStack [v ^:unsynchronized-mutable lwm]
  clojure.lang.IReduceInit
  (reduce [_ f init])
  Stack
;  (add! [_ o])
  (remove [_]))

(defn reduce-captures
  [stack f]
  (reduce f (f) stack))

(defn callback
  "Mutable stack, parser, and arbitrary context (final)"
  [parser stack context])




'[[:call 16]
  [:jump 168]
  [:char 116]
  [:char 114]
  [:char 117]
  [:char 101]
  [:call 45]
  [:return]
  [:char 117]
  [:begin-capture]
  [:range hexdigit]
  [:range hexdigit]
  [:range hexdigit]
  [:range hexdigit]
  [:end-capture]
  [:apply]
  [:return]
  [:call 35]
  [:call 70]
  [:end-of-input]
  [:return]
  [:char 123]
  [:call 30]
  [:call 60]
  [:choice 4]
  [:char 44]
  [:call 57]
  [:partial-commit -2]
  [:char 125]
  [:call 23]
  [:return]
  [:char 46]
  [:call 84]
  [:return]
  [:char 34]
  [:char 92]
  [:return]
  [:choice 5]
  [:choice 3]
  [:call 106]
  [:partial-commit -1]
  [:commit 3]
  [:char 92]
  [:call 107]
  [:return]
  [:char 102]
  [:char 97]
  [:char 108]
  [:char 115]
  [:char 101]
  [:call 2]
  [:return]
  [:choice 15]
  [:choice 3]
  [:char 32]
  [:commit 11]
  [:choice 3]
  [:char 10]
  [:commit 8]
  [:choice 3]
  [:char 13]
  [:commit 5]
  [:choice 3]
  [:char 9]
  [:commit 2]
  [:char 12]
  [:partial-commit -13]
  [:return]
  [:begin-capture]
  [:call 68]
  [:choice 2]
  [:call -40]
  [:choice 2]
  [:call 35]
  [:end-capture]
  [:call -23]
  [:return]
  [:char 110]
  [:char 117]
  [:char 108]
  [:char 108]
  [:call -29]
  [:return]
  [:call 49]
  [:char 58]
  [:call -33]
  [:call 2]
  [:return]
  [:choice 3]
  [:call 43]
  [:commit 17]
  [:choice 3]
  [:call -24]
  [:commit 14]
  [:choice 3]
  [:call -74]
  [:commit 11]
  [:choice 3]
  [:call 23]
  [:commit 8]
  [:choice 3]
  [:call -98]
  [:commit 5]
  [:choice 3]
  [:call -59]
  [:commit 2]
  [:call -29]
  [:return]
  [:char 101]
  [:choice 5]
  [:choice 3]
  [:char 43]
  [:commit 2]
  [:char 45]
  [:call 2]
  [:return]
  [:range digit]
  [:choice 3]
  [:range digit]
  [:partial-commit -1]
  [:return]
  [:char 91]
  [:call -70]
  [:call -35]
  [:choice 5]
  [:char 44]
  [:call -74]
  [:call -39]
  [:partial-commit -3]
  [:char 93]
  [:call -78]
  [:return]
  [:char 34]
  [:call -96]
  [:char 34]
  [:call -83]
  [:return]
  [:choice 2]
  [:char 45]
  [:choice 4]
  [:range digit19]
  [:call -25]
  [:commit 2]
  [:range digit]
  [:return]
  [:choice 3]
  [:call -112]
  [:fail-twice]
  [:any]
  [:return]
  [:choice 3]
  [:call -117]
  [:commit 17]
  [:choice 3]
  [:char 98]
  [:commit 14]
  [:choice 3]
  [:char 102]
  [:commit 11]
  [:choice 3]
  [:char 110]
  [:commit 8]
  [:choice 3]
  [:char 114]
  [:commit 5]
  [:choice 3]
  [:char 116]
  [:commit 2]
  [:call -159]
  [:return]
  [:end]]