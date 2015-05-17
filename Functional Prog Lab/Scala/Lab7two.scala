
def merge (xs : List[Int], ys : List[Int]) : List[Int] =
	(xs, ys) match {
		case (x,Nil) => x
		case (Nil, y) => y
		case (x::xss,y::yss) =>	
		if (x <= y) {
			List(x) ::: merge(xss, ys)
			} else {
			List(y) ::: merge(xs, yss)
			}
		}
		