package EstruturasRepetitivas;

public class Do_while {

    /*
Estrutura repetitiva "faça-enquanto":
Menos utilizada,mas em alguns casos se encaixa melhor ao problema.
O bloco de comandos executa pelo menos uma vez,pois a condição é verificada no final.

Sintaxe / regra:

 do { //executa o bloco de comandos pelo menos uma vez
 comando 1
 comando 2
 } while(condição); //verifica se vai de novo

 Regra:
 V: volta
 F: pula fora
------------------

Problema exemplo:

Fazer um programa para ler uma temperatura em Celsius e mostrar o equivalente em
Fahrenheit. Perguntar se o usuário deseja repetir(s/n).Caso o usuário digite"s",repetir o
 programa.
 Fórmula: F = 9C/5 +32

Programa sem fazer o looping de repetir:
 Locale.setDefault(Locale.US);
     Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double C = sc.nextDouble();
        double F = 9.0 * C/ 5.0 + 32.0;
        System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);

      sc.close();

Programa com loop while:

Locale.setDefault(Locale.US);
     Scanner sc = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        double C = sc.nextDouble();
        double F = 9.0 * C/ 5.0 + 32.0;
        System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
        System.out.print("Deseja repetir (s/n)? ");
        char resp= sc.next().charAt(0);

        while (resp != 'n'){
          System.out.print("Digite a temperatura em Celsius: ");
          C = sc.nextDouble();
          F = 9.0 * C/ 5.0 + 32.0;
          System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
          System.out.print("Deseja repetir (s/n)? ");
          resp= sc.next().charAt(0);
        }
      sc.close();

Outra forma utilizando while:

Locale.setDefault(Locale.US);
     Scanner sc = new Scanner(System.in);
     char resp = 's';

        while (resp != 'n'){
          System.out.print("Digite a temperatura em Celsius: ");
          double C = sc.nextDouble();
          double F = 9.0 * C/ 5.0 + 32.0;
          System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
          System.out.print("Deseja repetir (s/n)? ");
          resp= sc.next().charAt(0);
        }
      sc.close();


Forma utilizando o do while:
    Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        char resp;
 do {
    System.out.print("Digite a temperatura em Celsius: ");
    double C = sc.nextDouble();
    double F = 9.0 * C/ 5.0 + 32.0;
    System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
    System.out.print("Deseja repetir (s/n)? ");
    resp = sc.next().charAt(0);
 } while(resp!= 'n');

 sc.close();

     */
}
