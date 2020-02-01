(ns clock.core-test
  (:require [clojure.test :refer :all]
            [clock.core :refer :all]))

(deftest clock-tests
  (testing "when set hour to 8 and minute to 0 should return 8:00"
    (let [clk (clock 8 0)]
     (is (= "8:00" (to-string clk)))))
  (testing "when set hour to 10 and minute to 11 should return 10:11"
    (let [clk (clock 10 11)]
     (is (= "10:11" (to-string clk)))))
  (testing "when set hour 10 and minute to 61 should return 11:01"
    (let [clk (clock 10 61)]
     (is (= "11:01" (to-string clk))))))
