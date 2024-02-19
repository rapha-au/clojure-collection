(ns janken.core
  (:gen-class))


(defn -main
  [& args]

  	(def l true)

	(while (= l true)
	(do
	(println "Play Game?[y/n]")
	(def input (read-line))
	(def input(clojure.string/lower-case input))

	(cond
		(= input "y")(do
		(println "[0]Rock\n[1]Paper\n[2]Scissors\n")
		(def input (read-line))
		(def input(clojure.string/lower-case input))
		(def r (rand-int 3))
		(cond
			(= input "0")(do;;Choose Rock
				
				(if (= (str r) (str 2))
					(do
					(println "You Won!");;Against Scissors
					)
					(do(println "Didn't win"))
				)
				(println "Computer played Scissors!\n")
			)
			(= input "1")(do
			
				(if (= (str r) (str 0))
					(do
					(println "You Won!");;Against Rock
					)
					(do(println "Didn't win"))
				)
				(println "Computer played Rock!\n")
			)
			(= input "2")(do
			
				(if (= (str r) (str 1))
					(do
					(println "You Won!");;Against Paper
					)
					(do(println "Didn't win"))

				)
				(println "Computer played Paper!\n")
			)
			:else(println "Not a choice.")
		)
		
		)
		(= input "n")(do
		(println "Game End.")
		(def l false)
		)
		:else(do(println "Not a choice.")
		)
	)


)
)



	
)
