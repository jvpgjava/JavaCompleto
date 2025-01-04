package Estrutura_Condicional;

public class Escopo_e_inicializacao {

    /*
    Checklist
Escopo de uma variável: é a região do programa onde a variável é
válida, ou seja, onde ela pode ser referenciada.
Uma variável não pode ser usada se não for iniciada.

double price = sc.nextDouble();

if (price > 100.0) {
double discount = price * 0.1; //não consigo utilizar de forma externa a variável dentro do if/estrutura
}
System.out.println(discount);
//a variável deve ser declarada fora para poder ser utilizada:

double price = sc.nextDouble();

double discount = 0; //forma de inicializar a variável
if (price > 100.0) {
  discount = price * 0.1; //não consigo utilizar de forma externa a variável dentro do if/estrutura
}
System.out.println(discount);
//também pode ser feito com else ao invés de declarar com 0:

double price = sc.nextDouble();

double discount;
if (price > 100.0) {
  discount = price * 0.1;
} else {
  discount = 0;
}
System.out.println(discount);

     */
}
