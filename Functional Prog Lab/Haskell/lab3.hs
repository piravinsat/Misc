
isEven x = x `mod` 2 == 0

allEven [] = True
allEven (x:xs) = if isEven x then allEven xs else False

addp xs = [x+y | (x,y) <- xs]

addpp xs = [x+y | (x,y) <- xs, x < y]

pyths x = [ (a,b,c) | c <- [1..x], b <- [1..x], a <- [1..x], a^2 + b^2 == c^2]


factors n = [ x | x <- [1..n], n `mod` x == 0]

perfects n = [x | x <- [1..n], x == sum (init (factors x)) ]

