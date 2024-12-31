import java.util.Locale; //importado Locale

public class SaidaDeDados {

    /*
    Escrever na tela algo qualquer:

    Sem quebra de linha no final - System.out.print("mensagem");

    Com quebra de linha no final - System.out.println("mensagem");

    Exibir de forma formatada - System.out.printf("%.2f%n", x); //delimitando 2 casas decimais
     */

/*
    Exemplo:
    int y = 32;
    double x = 10.35784;

    System.out.println(y);
    System.out.println(x);
    System.out.printf(y);
 */

    Locale.setDefault(Locale.US); //configurar localização do aplicativo

    /*
    Concatenar vários elementos do mesmo comando
    Regra geral para print e println:
elemento1 + elemento2 + elemento3 + ... + elementoN

    System.out.println("RESULTADO = " + x + " METROS");

    Regra geral para printf:
"TEXTO1 %f TEXTO2 %f TEXTO3", variavel1, variavel2
%f = ponto flutuante
%d = inteiro
%s = texto
%n = quebra de linha

Exemplo:
System.out.printf("RESULTADO = %.2f metros%n", x);

Exemplo:
String nome = "Maria";
int idade = 31;
double renda = 4000.0;

System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);

     */

}
