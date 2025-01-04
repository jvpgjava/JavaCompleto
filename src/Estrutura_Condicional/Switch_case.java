package Estrutura_Condicional;

public class Switch_case {

    /*
Estrutura switch-case: quando tem várias opções de fluxo a serem tratadas com base no
valor de uma variável, ao invés de várias estruturas if-else encadeadas,
alguns preferem utilizar a estrutura switch-case.

Sintaxe do Switch case:
switch ( expressão ) {
case valor1:
  comando1
  comando2
break;
case valor2:
  comando3
  comando4
break;
default:
  comando5
  comando6
break;
}

Problema exemplo:
Fazer um programa para ler um valor inteiro de 1 a 7 representando um
dia da semana (sendo 1=domingo, 2=segunda, e assim por diante).
Escrever na tela o dia da semana correspondente, conforme exemplos.

Entrada | Saída
   1    | Dia da semana: domingo
Entrada | Saída
   4    | Dia da semana: quarta
Entrada | Saída
   9    | Dia da semana: valor inválido


Resolução do problema envolvendo if else encadeado:

Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
String dia;
if (x == 1) {
dia = "domingo";
}
else if (x == 2) {
dia = "segunda";
}
else if (x == 3) {
dia = "terca";
}
else if (x == 4) {
dia = "quarta";
}
else if (x == 5) {
dia = "quinta";
}
else if (x == 6) {
dia = "sexta";
}
else if (x == 7) {
dia = "sabado";
}
else {
dia = "valor invalido";
}
System.out.println("Dia da semana: " + dia);
sc.close();


Resolução utilizando switch case:

Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
String dia;
switch (x) {
case 1:
dia = "domingo";
break;
case 2:
dia = "segunda";
break;
case 3:
dia = "terca";
break;
case 4:
dia = "quarta";
break;
case 5:
dia = "quinta";
break;
case 6:
dia = "sexta";
break;
case 7:
dia = "sabado";
break;
default:
dia = "valor invalido";
break;
}
System.out.println("Dia da semana: " + dia);
sc.close();


     */
}
