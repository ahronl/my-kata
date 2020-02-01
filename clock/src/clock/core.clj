(ns clock.core)

(defn to-string [c]
 (str (:hour c) ":" (format "%02d" (:minute c))))

(defn clock [h m]
 {:hour (mod (+ h (quot m 60)) 24) :minute (mod m 60)})

(defn add [c m]
 (clock (:hour c) (+ (:minute c) m)))
 
