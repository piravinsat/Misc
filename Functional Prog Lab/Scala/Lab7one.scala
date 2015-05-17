def sum (xs: List[Int]): Int = 
	xs match {
		case Nil => 0
		case x :: ys => x + sum(ys)
		}
		
def length [T] (xs: List[T]) : Int = 
	xs match { 
		case Nil => 0 
		case x :: ys => length(ys) + 1 
 } 

def reverse [T] (xs : List[T]) : List[T] = 
	xs match { 
		case Nil => Nil 
		case x::ys => reverse(ys) ::: List(x) 
 }

