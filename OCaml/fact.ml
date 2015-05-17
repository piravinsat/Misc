let rec fact (n: int) =
if n=1 then 1 else n * fact(n-1)

let rec even (x:int) : bool =
 if x<0 then even (abs x)
else if x=0 then true else odd(x-1)
and odd (x:int) : bool =
 if x<0 then odd (abs x)
else if (x=0) then false else even (x-1)

let rec msqrt (x: float) (n: int) =
 if n = 0 then 0.00
 else if n = 1 then (sqrt x) 
 else (msqrt (sqrt x) (n-1)) 

let rec conc (s: string) (n: int) =
 if n = 1 then s
 else s ^ conc s (n-1)