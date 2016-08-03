(ns neighbours.core-test
  (:use midje.sweet)
  (:use [neighbours.core]))

(facts "about neighbours"
  (neighbours '()) => '()
  (neighbours '(1)) => '()
  (neighbours '(1 1)) => '()
  (neighbours '(1 1 1)) => '()
  (neighbours '(1 2)) => '((1 2))
  (neighbours '(1 1 2)) => '((1 2))
  (neighbours '(1 1 1 2 2 2 3 3 3 1 1 1)) => '((1 2) (2 3) (3 1))
  )

