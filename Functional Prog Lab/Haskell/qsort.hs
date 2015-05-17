

qsort (x:xs) = removeDuplicates (quicksort xs)


quicksort [] = []
quicksort (x:xs) = 
	quicksort smaller ++ [x] ++ quicksort larger
	where
		smaller = [a | a <- xs, a <= x]
		larger = [b | b <- xs, b > x]
		
removeDuplicates [] = []
removeDuplicates (x:xs) = x : removeDuplicates (filter (\y -> not (x == y)) xs)