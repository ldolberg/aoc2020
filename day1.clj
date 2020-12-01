(def items (sort (map #(Integer/parseInt %) (clojure.string/split-lines (slurp "input/day1")))))
(defn first_part[arg] (filter #(some #{%} (map (fn [x] (- arg x)) items)) items))
(println (reduce * (first_part 2020)))
; Second Part
(map first_part (map (fn [x] (- 2020 x)) items))