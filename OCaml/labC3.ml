let rec print_intlist (l: int list) = match l with
[] -> ()
| h :: t -> (print_int h); (print_intlist t) 

type tree =
Leaf | Node of tree * int * tree

let rec print_inttree (t: tree) = match t with
Leaf -> ()
| Node(left, pload , right) -> (print_inttree left); 
                               (print_inttree right); 
                               (print_int pload);

let rec search_aux l s i =
match l with
[] -> raise Not_found
| h :: t -> if s = h then print_int i
            else (search_aux t s (i+1));

let search l s =
 search_aux l s i