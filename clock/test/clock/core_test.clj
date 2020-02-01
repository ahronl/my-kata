(ns clock.core-test
  (:require [clojure.test :refer :all]
            [clock.core :refer :all]))

(defn print-clock [c]
 (str (:hour c) ":" (format "%02d" (:minute c))))

(deftest clock-tests
  (testing "set hour and minutes"
    (let [clk (clock 8 0)]
     (is (= "8:00" (print-clock clk))))))
