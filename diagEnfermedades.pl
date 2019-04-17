%%%% prolog enfermedades------------
duTempe(fiebreAlt,48).
duTempe(fiebreBaj,47).


/* sintomas gripe*/

sintomas(gripe,fiebreBaj).
sintomas(gripe,dolorCb).
sintomas(gripe,tos).

sintomas(paludismo,fiebreAlt).
sintomas(paludismo,dolorCb).
sintomas(paludismo,tos).

sintomas(dengue,fiebreAlt).
sintomas(dengue,dolorCb).
sintomas(dengue,tos).
sintomas(dengue,manchasrojas).

sintomas(zika,fiebreAlt).
sintomas(zika,dolorCb).
sintomas(zika,tos).
sintomas(zika,manchasrojas).
sintomas(zika,diarrea).
sintomas(zika,vomito).



fiebre1(X,T):-((duTempe(X,H),T>=H),(duTempe(_,I),H>I));((duTempe(X,H),T=<H),(duTempe(_,I),H<I)).

/*REGLAS*/

/*ENFERMO DE GRIPE */
enfermoDe(X,TMP,S2,S3):-
    (sintomas(X,Y),fiebre1(Y,TMP)),
    (sintomas(X,A),A=S2),
    (sintomas(X,B),B=S3),!.

/*ENFERMO DE PALUDISMO*/

enfermoDe(X,TMP,S2,S3):-
    (sintomas(X,Y),fiebre1(Y,TMP)),
    (sintomas(X,A),A=S2),
    (sintomas(X,B),B=S3),!.



/*ENFERMO DE DENGUE */
enfermoDe(X,TMP,S2,S3,S4):-
    (sintomas(X,Y),fiebre1(Y,TMP)),
    (sintomas(X,A),A=S2),
    (sintomas(X,B),B=S3),
    (sintomas(X,C),C=S4),!.

/*ENFERMO DE ZIKA*/

enfermoDe(X,TMP,S2,S3,S4,S5,S6):-
    (sintomas(X,Y),fiebre1(Y,TMP)),
    (sintomas(X,A),A=S2),
    (sintomas(X,B),B=S3),
    (sintomas(X,C),C=S4),
    (sintomas(X,D),D=S5),
    (sintomas(X,F),F=S6),!.












