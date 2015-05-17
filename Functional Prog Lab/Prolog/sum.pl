
sum([],0). %BaseCase
sum([H | T], X) :-
	sum(T, X1), %Recursive
	X is X1 + H.
	
g(0,1).
g(N,X) :-
	N1 is N - 1,
	g(N1,X1),
	X is 2*X1 + 1.
	
gcd(A,0,A).
gcd(0,B,B).
gcd(A,B,X) :-
	A >= B,
	A1 is A-B,
	gcd(A1,B,X).
gcd(A,B,X) :-
	A < B,
	B1 is B-A,
	gcd(A,B1,X).
	
gg(0,1).
gg(1,-1).
gg(N,X) :-
	N1 is N - 1,
	N2 is N - 2,
	gg(N1,X1),
	gg(N2,X2),
	X is X1 + 2*X2 + 2.


	
	