package EstruturasRepetitivas;

public class For_exercicios {

    /*
Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1 até X, um valor por linha, inclusive o
X, se for o caso. Exemplo:
Entrada:
8
Saída:
1
3
5
7

Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();

		for (int i=1; i<=x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

		sc.close();

-----------------


Leia um valor inteiro N. Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
Exemplo:
Entrada:
5
14
123
10
-25
32

Saída:
2 in
3 out

Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int in = 0;
		int out = 0;

		for (int i=0; i<n; i++) {
			int x = sc.nextInt();
			if (x >= 10 && x <= 20) {
				in = in + 1;
			}
			else {
				out = out + 1;
			}
		}

		System.out.println(in + " in");
		System.out.println(out + " out");

		sc.close();

------------------------
Leia 1 valor inteiro N, que representa o número de casos de teste que vem a seguir. Cada caso de teste consiste
de 3 valores reais, cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso 3 e o terceiro valor tem
peso 5.
Exemplo:
Entrada:
3
6.5 4.3 6.2
5.1 4.2 8.1
8.0 9.0 10.0

Saída:
5.7
6.3
9.3

Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i=0; i<n; i++) {

			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double c = sc.nextDouble();

			double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

			System.out.printf("%.1f%n", media);
		}

		sc.close();

-------------------

Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
Exemplo:
Entrada:
3
3 -2
-8 0
0 8

Saída:
-1.5
divisao impossivel
0.0

Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i=0; i<n; i++) {

			int x = sc.nextInt();
			int y = sc.nextInt();

			if (y == 0) {
				System.out.println("divisao impossivel");
			}
			else {
				double div = (double) x / y;
				System.out.printf("%.1f%n", div);
			}
		}

		sc.close();
-----------------------------

Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por definição, fatorial de 0 é 1.
Exemplos:
Entrada: Saída:
4          24
Entrada: Saída:
1          1
Entrada: Saída:
5         120
Entrada: Saída:
0          1


Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int fat = 1;
		for (int i=1; i<=n; i++) {
			fat = fat * i;
		}

		System.out.println(fat);

		sc.close();

----------------------------------


Ler um número inteiro N e calcular todos os seus divisores. Exemplo:

 Entrada: Saída:
 6          1
            2
            3
            6

 Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i=1; i<=n; i++) {
			if (n % i == 0) {
				System.out.println(i);
			}
		}

		sc.close();

---------------------

Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
exemplo. Exemplo:

Entrada:   Saída:
 5         1 1 1
           2 4 8
           3 9 27
           4 16 64
           5 25 125

Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i=1; i<=n; i++) {

			int primeiro = i;
			int segundo = i * i;
			int terceiro = i * i * i;
			System.out.printf("%d %d %d%n", primeiro, segundo, terceiro);
		}

		sc.close();




     */
}
