package EstruturasRepetitivas;

public class Enquanto_For {

    /*
 Estrutura repetitiva for(para):
 É uma estrutura de controle que repete um bloco de comandos para um certo intervalo de
 valores. Quando usar: quando se sabe previamente a quantidade de
 repetições, ou o intervalo de valores.

Sintaxe/Regra:

 for ( início ; condição ; incremento) {
 comando 1
 comando 2
 }

 Legenda - início executa somente na primeira vez, condição se V: executa e volta, se
 F: pula fora, e executa toda vez depois de voltar

Exemplo:
 Fazer um programa que lê um valor inteiro N e depois N números inteiros.
 Ao final, mostra a soma dos N números lidos:
 Entrada
 3
 5
 2
 4
 Saída
 11

 Scanner sc = new Scanner(System.in);

 int N = sc.NextInt();

 int soma = 0;
 for (i = 0; i < N; i++) {
   int x = sc.NextInt();
   soma = soma + x;

 }
 System.out.println(soma);

 sc.close();

 ------------------

 Importante: Estrutura "para" é ótima para se fazer uma repetição
 baseada em uma CONTAGEM:

 for (int i=0;i<5; i++) {
    System.out.println("Valor de i: " + i);
 }

Contagem regressiva:

for (inti=4;i>=0;i--) {
 System.out.println("Valor de i: " + i);
 }





     */
}
