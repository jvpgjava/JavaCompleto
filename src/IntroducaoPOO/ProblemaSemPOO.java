package IntroducaoPOO;

public class ProblemaSemPOO {

    /*
    Fazer um programa para ler as medidas dos lados de dois triângulos X e Y
    (suponha medidas válidas).Em seguida,mostrar o valor das áreas dos dois
    triângulo se dizer qual dos dois triângulos
    possui a maior área.
    A fórmula para calcular a área de um triângulo apartir das medidas de seus
    lados a,b e c é a seguinte(fórmula de Heron):
    ✓p(p-a)(p-b)(p-c) onde p = a+b+c/2
    Enter the measures of triangle X:
            3.00
            4.00
            5.00
    Enter the measures of triangle Y:
            7.50
            4.50
            4.02
    Triangle X area: 6.0000
    Triangle Y area: 7.5638
    Larger area: Y


import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US); // Define o padrão de localização para US (para uso de ponto decimal).
        Scanner sc = new Scanner(System.in); // Cria um objeto Scanner para entrada de dados.

        double xA, xB, xC, yA, yB, yC;

        System.out.println("Enter the measures of triangle X: ");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        // Calcula a área do triângulo X usando a fórmula de Heron
        double p = (xA + xB + xC) / 2.0;
        double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));

        // Calcula a área do triângulo Y usando a fórmula de Heron
        p = (yA + yB + yC) / 2.0;
        double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));

        // Exibe as áreas dos triângulos com quatro casas decimais
        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        // Verifica qual triângulo tem a maior área e exibe o resultado
        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }

        sc.close(); // Fecha o objeto Scanner.
    }
}



     */
}
