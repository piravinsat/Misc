--Question 1

data Nat = Zero | Succ Nat

nat2int :: Nat -> Int
nat2int Zero = 0
nat2int (Succ n) = 1 + nat2int n

int2nat :: Int -> Nat
int2nat 0 = Zero
int2nat n = Succ (int2nat (n-1))

add :: Nat -> Nat -> Nat
add m n = int2nat (nat2int m + nat2int n)

mult :: Nat -> Nat -> Nat
mult _ Zero = Zero
mult m n = add m (mult m (int2nat((nat2int n)-1)))

-- Question 2

data Tree = Leaf Int | Node Tree Tree
			deriving (Show)
			
balanced :: Tree -> Bool
