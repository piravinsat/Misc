condog [] = []
condog (x:xs) = x ++ concat xs

replicatee n x
	| n < 0 = []
	| n <= 0 = []
	| otherwise = x:replicatee (n-1) x

elemm a [] = False
elemm a (x:xs) = if a == x then True else a `elemm` xs

merge x [] = x
merge [] y = y
merge (x:xs) (y:ys) = if x <= y
						then [x] ++ merge xs (y:ys)
						else [y] ++ merge (x:xs) ys


halve :: [a] -> ([a], [a])
halve xs = splitAt (length xs `div` 2) xs

msort :: [Int] -> [Int] 

msort [] = []
msort if(length xs) <= 1
		then xs 
		else 


