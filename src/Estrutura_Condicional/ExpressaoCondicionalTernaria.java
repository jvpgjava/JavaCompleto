package Estrutura_Condicional;

public class ExpressaoCondicionalTernaria {

    /*
Expressão condicional ternária:
Estrutura opcional ao if-else quando se deseja decidir um VALOR com base em uma
condição.

Sintaxe:
( condição ) ? valor_se_verdadeiro : valor_se_falso

Exemplos:
( 2 > 4 ) ? 50 : 80, como 2 era menor que 4, então falso, logo 80 retornado
( 10 != 3 ) ? "Maria" : "Alex", 10 diferente de 3 é V, então retorna "Maria"

Demonstração:
import java.util.scanner;

double preco = 34.5;
double desconto;
if (preco < 20.0) {
desconto = preco * 0.1;
}
else {
desconto = preco * 0.05;
}
System.out.prinln(desconto);
sc.close();

Posso trocar o caso acima para isso:
import java.util.scanner;

double preco = 34.5;
double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
System.out.prinln(desconto);
sc.close();

     */
}
