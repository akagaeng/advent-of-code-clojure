(ns _2018.day1
  (:require [clojure.string :as str]))


; read-string
(str/split
  (slurp "input/2018/day1.txt")
  #"\n")
