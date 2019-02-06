package com.usac.compi2.analizadores;
import java_cup.runtime.Symbol; 

%% 
%class Lexico
%public 
%line 
%char 
%cup 
%unicode
%ignorecase

%{
    private Symbol symbol(int type) {
        return new Symbol(type, yyline, yychar, yytext());
    }
    private Symbol symbol(int type, Object value) {
        return new Symbol(type, yyline, yychar, value);
    }
%}

 
ESPACIOS=[ \r\t]+
NUM=[0-9]+
%%


"+" {return new Symbol(sym.SUMA,yyline,yychar, yytext());} 
"*" {return new Symbol(sym.MULTIPLICACION,yyline,yychar, yytext());} 

\n {yychar=1;}

{ESPACIOS} {} 
{NUM} {return new Symbol(sym.NUM,yyline,yychar, yytext());}

. {
    System.err.println("Este es un error lexico: "+yytext()+", en la linea: "+yyline+", en la columna: "+yychar);
}