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
     (is (= "11:01" (to-string clk)))))
  (testing "when set hour 25 and minute 1 should return 1:01"
    (let [clk (clock 25 1)]
     (is (= "1:01" (to-string clk)))))
  (testing "when set hour -25 and minute 0 should return 23:00"
    (let [clk (clock -25 0)]
     (is (= "23:00" (to-string clk)))))
  (testing "when set hour -25 and minute 60 should return 0:00"
    (let [clk (clock -25 60)]
     (is (= "0:00" (to-string clk))))))

(deftest clock-equal-tests
  (testing "when check equality between 10:00 and 10:01 should return false"
   (let [clk (clock 10 0) expt-clk (clock 10 1)]
    (is (not (= expt-clk clk)))))
  (testing "when check eauality between 10:00 and 10:10 should return true"
   (let [clk (clock 10 0) expt-clk (clock 10 0)]
    (is (= expt-clk clk)))))
