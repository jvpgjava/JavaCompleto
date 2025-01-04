package Introducao_E_EstruturaSequencial;

import.java.util.Scanner; //importar o scanner para utilizar o Scanner
import.java.util.Locale;

public class EntradaDeDados {

    //Locale.setDefault(Locale.US);
    /* Para fazer entrada de dados, se cria um objeto do tipo "Scanner":
    Scanner sc = new Scanner(System.in);

    String x; //variável declarada
    x = sc.next(); //para ler uma palavra (texto sem espaços)
    System.out.println("Você digitou " + x);

    Se usa sc.close(); quando não precisar mais do objeto

    int x;
    x = sc.nextInt(); //para ler número inteiro

    double x;
    x = sc.nextDouble(); //para ler número com ponto flutuante

    char x;
    x = sc.next().charAt(0); // para ler um caractere, vai puxar a primeira letra da string

    Para ler vários dados na mesma linha:
    string x;
    int y;
    double z;
    x = sc.next();
    y = sc.nextInt();
    z = sc.nextDouble();

    System.out.println("Você digitou " + x)
    System.out.println("Você digitou " + y)
    System.out.println("Você digitou " + z)

    Para ler um texto até a quebra de linha:

    Scanner sc = new Scanner(System.in);

    String s1, s2, s3;


Quando você usa um comando de
leitura diferente do nextLine() e
dá alguma quebra de linha, essa
quebra de linha fica "pendente"
na entrada padrão.
Se você então fizer um nextLine(),
aquela quebra de linha pendente
será absorvida pelo nextLine():


    x = sc.nextInt();
    sc.nextLine(); -- adicionar nextLine vazio para evitar que não faça a leitura de todos
    s1 = sc.nextLine(); //para ler o texto inteiro que digitou
    s2 = sc.nextLine();
    s3 = sc.nextLine();

    System.out.println("DADOS DIGITADOS:");
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
    sc.close();

     */
}
