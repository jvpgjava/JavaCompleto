package Estrutura_Condicional;

public class Exercicios {

    /*
    import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        if (numero < 0) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("NAO NEGATIVO");
        }

        sc.close();
    }
}

------------

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        if (numero % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }

        sc.close();
    }
}

------------------

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }

        sc.close();
    }
}

-------------------

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();

        int duracao;
        if (horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
        } else {
            duracao = 24 - horaInicial + horaFinal;
        }

        System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        sc.close();
    }
}

--------------------

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigo = sc.nextInt();
        int quantidade = sc.nextInt();

        double total;
        switch (codigo) {
            case 1:
                total = quantidade * 4.00;
                break;
            case 2:
                total = quantidade * 4.50;
                break;
            case 3:
                total = quantidade * 5.00;
                break;
            case 4:
                total = quantidade * 2.00;
                break;
            case 5:
                total = quantidade * 1.50;
                break;
            default:
                total = 0.0;
                break;
        }

        System.out.printf("Total: R$ %.2f%n", total);
        sc.close();
    }
}

--------------------------

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valor = sc.nextDouble();

        if (valor >= 0 && valor <= 25) {
            System.out.println("Intervalo [0,25]");
        } else if (valor > 25 && valor <= 50) {
            System.out.println("Intervalo (25,50]");
        } else if (valor > 50 && valor <= 75) {
            System.out.println("Intervalo (50,75]");
        } else if (valor > 75 && valor <= 100) {
            System.out.println("Intervalo (75,100]");
        } else {
            System.out.println("Fora de intervalo");
        }

        sc.close();
    }
}

--------------------------

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if (x == 0 && y == 0) {
            System.out.println("Origem");
        } else if (x == 0) {
            System.out.println("Eixo Y");
        } else if (y == 0) {
            System.out.println("Eixo X");
        } else if (x > 0 && y > 0) {
            System.out.println("Q1");
        } else if (x < 0 && y > 0) {
            System.out.println("Q2");
        } else if (x < 0 && y < 0) {
            System.out.println("Q3");
        } else {
            System.out.println("Q4");
        }

        sc.close();
    }
}

-----------------------

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double salario = sc.nextDouble();

        double imposto;
        if (salario <= 2000.0) {
            imposto = 0.0;
        } else if (salario <= 3000.0) {
            imposto = (salario - 2000.0) * 0.08;
        } else if (salario <= 4500.0) {
            imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
        } else {
            imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }

        if (imposto == 0.0) {
            System.out.println("Isento");
        } else {
            System.out.printf("R$ %.2f%n", imposto);
        }

        sc.close();
    }
}


---------------------


     */
}
