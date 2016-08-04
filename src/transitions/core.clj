(ns transitions.core)

(defn transitionsr [xs]
  (cond
    (empty? (rest xs)) '()
    (= (first xs) (second xs)) (transitionsr (rest xs))
    :else
      (cons (list (first xs) (second xs)) (transitionsr (rest xs)))))

(def transitionsi
  (comp
    (partial remove (partial apply =))
    (partial partition 2 1)))
