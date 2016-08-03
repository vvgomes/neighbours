(ns neighbours.core)

(defn neighbours [xs]
  (cond
    (empty? (rest xs)) '()
    (= (first xs) (second xs)) (neighbours (rest xs))
    :else
      (cons (list (first xs) (second xs)) (neighbours (rest xs)))))
