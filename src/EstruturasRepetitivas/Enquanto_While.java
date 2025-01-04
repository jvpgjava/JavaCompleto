package EstruturasRepetitivas;

public class Enquanto_While {

    /*
    Estrutura repetitiva "enquanto":
estrutura de controle que repete um bloco de comandos enquanto uma condição for
verdadeira.
Quando usar: quando não se sabe previamente a quantidade de repetições que será realizada.


Sintaxe / regra:

 while(condição) {
 comando 1
 comando 2
 }

  Regra:
 Se condição for verdadeira, executa e volta
 Se não, pula fora

 //Enquanto o valor de x for diferente de 0,
 vai continuar executando até ser digitado o 0:

 Scanner sc = new Scanner(System.in);

 int x = sc.nextInt();

 while (x != 0) {
   x = sc.nextInt();
 }

 sc.close();


 Fazer um programa que lê um valor
 inteiro N e depois N números inteiros.
 Ao final, mostra a soma dos N números
 lidos
 Entrada:
 5
 2
 4
 Saída:
 11

Resolução:

Scanner sc = new Scanner(System.in);

 int x = sc.nextInt();
 soma = 0;

 while (x != 0) {
   soma = soma + x;
   x = sc.nextInt();
 }

 System.out.println(soma);

 sc.close();


Exemplos:

x = 0;
y = 4;

while (x < 3) {
   y = y + 2;
   x = x + 1;
   System.out.println(x + "-" + y);

   Tela: 3-10

}

     */
}
