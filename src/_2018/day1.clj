(ns _2018.day1
  (:require [clojure.string :as str]))

(defn readInput [path] (str/split (slurp path) #"\n"))

; Part 1
(apply + (map read-string (readInput "input/2018/day1.txt")))
(reduce + (map read-string (readInput "input/2018/day1.txt")))