(ns transitions.core-test
  (:use midje.sweet)
  (:use [transitions.core]))

(facts "about transitions recursive"
  (transitionsr '()) => '()
  (transitionsr '(1)) => '()
  (transitionsr '(1 1)) => '()
  (transitionsr '(1 1 1)) => '()
  (transitionsr '(1 2)) => '((1 2))
  (transitionsr '(1 1 2)) => '((1 2))
  (transitionsr '(1 1 1 2 2 2 3 3 3 1 1 1)) => '((1 2) (2 3) (3 1)))

(facts "about transitions iterative"
  (transitionsi '()) => '()
  (transitionsi '(1)) => '()
  (transitionsi '(1 1)) => '()
  (transitionsi '(1 1 1)) => '()
  (transitionsi '(1 2)) => '((1 2))
  (transitionsi '(1 1 2)) => '((1 2))
  (transitionsi '(1 1 1 2 2 2 3 3 3 1 1 1)) => '((1 2) (2 3) (3 1)))

