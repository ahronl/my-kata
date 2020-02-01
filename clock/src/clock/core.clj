(ns clock.core)

(defn to-string [c]
 (str (:hour c) ":" (format "%02d" (:minute c))))

(defn clock [h m]
 {:hour (+ h (quot m 60)) :minute (mod m 60)})
