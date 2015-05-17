let rec replicate = function
[] -> []
| h :: t -> h :: h :: replicate t

let rec reverse = function
[] -> []
| h :: t -> (reverse t) @ [h]

let rec ordered = function
 -> true
| -> false

let left x = match x with
| N -> W
| W -> N
| S -> E
| E -> S 

let value x =  match x with
| Card (_ (_,Ace))) -> 14
| Card (_ (_,King))) -> 13
| Card (_ (_,Queen))) -> 12
| Card (_ (_,Jack))) -> 11
| Card (_ (_,Joker))) -> 0
| Card (_ (_,Simple_of_int))) -> Simple_of_int