(ns roman-nums.core-test
  (:require [clojure.test :refer :all]
            [roman-nums.core :refer :all]))

(deftest one-is-I
  (testing "one is converted to I"
   (is (= "I" (to-roman 1)))))

(deftest two-is-II
  (testing "two is converted to II"
   (is (= "II" (to-roman 2)))))

(deftest three-is-III
  (testing "three is converted to III"
   (is (= "III" (to-roman 3)))))

(deftest four-is-IV
  (testing "four is converted to IV"
   (is (= "IV" (to-roman 4)))))

(deftest five-is-V
  (testing "five is converted to V"
   (is (= "V" (to-roman 5)))))

(deftest six-is-VI
  (testing "six is converted to VI"
   (is (= "VI" (to-roman 6)))))

(deftest nine-is-IV
 (testing "nine is converted to IX"
  (is (= "IX" (to-roman 9)))))

(deftest ten-is-X
  (testing "ten is converted to X"
   (is (= "X" (to-roman 10)))))

(deftest complex-example 
 (testing "complex examples"
  (is (= "MCMXLIX" (to-roman 1949)))
  (is (= "MMXIII" (to-roman 2013)))
  (is (= "MMMCMXCIX" (to-roman 3999)))))

