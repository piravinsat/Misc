
route_from(A,B) :- flight(A,B).
route_from(A,B) :- flight(A,C), flight(C,B).

flight(london, paris).
flight(paris, amsterdam).
flight(amsterdam, rome).
flight(rome, paris).
flight(rome, rio).