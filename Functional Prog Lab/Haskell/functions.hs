second xs = head (tail xs)

swap (x,y) = (y,x)

pair x y = (x,y)

double x = x*2

palindrome xs = reverse xs == xs

twice f x = f (f x)

threetimes f x = f (f (f x))

doubleAll [] = []
doubleAll (x:xs) = x*2 : doubleAll xs

isEven x = x `mod` 2 == 0

halve :: [a] -> ([a],[a])
halve xs
	| isEven (toInteger n) = (take (n `div` 2) xs, drop (n `div` 2) xs)
	| otherwise = ([],[])
	where n = (length xs)
	
safetail :: [a] -> [a]
safetail xs = if (null xs) then [] else drop 1 xs

safetail1 xs | (null xs) = []
			| otherwise = drop 1 xs

safetail2 :: [a] -> [a]
safetail2 [] = []
safetail2 xs = drop 1 xs

last xs = head (reverse xs)
