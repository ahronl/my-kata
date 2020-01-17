(ns roman-nums.core)

(def m-to-roman-sym {1000 "M" 900 "CM" 500 "D" 400 "CD" 100 "C" 90 "XC" 50 "L" 40 "XL" 10 "X" 9 "IX" 5 "V" 4 "IV" 1 "I"})

(defn to-roman
  ([n] (to-roman n ""))
  ([n s]
  (if (<= n 0)
    s
    (let [mx-key (reduce max (filter (fn [x] (<= x n)) (keys m-to-roman-sym))) 
          mx-val (m-to-roman-sym mx-key)
          nxt (- n mx-key)]
	(recur nxt (str s mx-val))))))
