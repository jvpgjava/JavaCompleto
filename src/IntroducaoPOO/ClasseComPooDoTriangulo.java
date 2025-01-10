package IntroducaoPOO;

public class ClasseComPooDoTriangulo {

    /*
 Discussão
 Triângulo é uma entidade com três
atributos: a, b, c.
 Estamos usando três variáveis distintas
para representar cada triângulo: Discussão
 Memória:
 3.00
 double aX, bX, cX, aY, bY, cY;
 Triângulo é uma entidade com três
atributos: a, b, c.
 Estamos usando três variáveis distintas
para representar cada triângulo:
 aX 3.00
 bX 4.00
 cX 5.00
 aY 7.50
 bY 4.50
 cY 4.02
 Para melhorar isso, vamos usar uma
CLASSE para representar um triângulo.

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y;

        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();


        double p = (x.a + x.b + x.c) / 2.0;
        double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));

        p = (y.a + y.b+ y.c) / 2.0;
        double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));

        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Larger area: X");
        } else {
            System.out.println("Larger area: Y");
        }

        sc.close();

         Instanciação:
         (alocação dinâmica de memória)

         double areaX, areaY, p;
         Triangle x, y;
         x = newTriangle();



package course;

 public class Triangle { //classe: é a definição do tipo

 //objetos: instancias da classe
 public double a;
 public double b;
 public double c;
 }
    }
}



     */
}
