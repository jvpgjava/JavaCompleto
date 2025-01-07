package Mais_topicos_basicos;

public class Funcoes_FormatacaoDeString {

    /*
Checklist:
•Formatar: toLowerCase(), toUpperCase(), trim()
•Recortar: substring(inicio), substring(inicio, fim)
•Substituir: Replace(char, char), Replace(string, string)
•Buscar: IndexOf, LastIndexOf
•str.Split(" ")

// Formatar
toLowerCase() // Converte todos os caracteres da string para letras minúsculas.
toUpperCase() // Converte todos os caracteres da string para letras maiúsculas.
trim()        // Remove espaços em branco no início e no final da string.

// Recortar
substring(inicio) // Retorna uma nova string a partir da posição 'inicio' até o final.
substring(inicio, fim) // Retorna uma nova string do índice 'inicio' até 'fim' (exclusivo).

// Substituir
replace(char, char) // Substitui todas as ocorrências de um caractere por outro.
replace(string, string) // Substitui todas as ocorrências de uma substring por outra substring.

// Buscar
indexOf(char ou string) // Retorna o índice da primeira ocorrência do caractere ou substring.
lastIndexOf(char ou string) // Retorna o índice da última ocorrência do caractere ou substring.

// Dividir
split(" ") // Divide a string em partes com base em um delimitador (no caso, espaço) e retorna um array de strings.


String original = "abcde FGHIJ ABC abc DEFG   "; // Declara a string original com espaços e caracteres mistos.
String s01 = original.toLowerCase(); // Converte toda a string para letras minúsculas.
String s02 = original.toUpperCase(); // Converte toda a string para letras maiúsculas.
String s03 = original.trim(); // Remove espaços em branco no início e no final da string.
String s04 = original.substring(2); // Retorna a substring a partir do índice 2 até o final.
String s05 = original.substring(2, 9); // Retorna a substring entre os índices 2 (inclusivo) e 9 (exclusivo).
String s06 = original.replace('a', 'x'); // Substitui todas as ocorrências do caractere 'a' pelo caractere 'x'.
String s07 = original.replace("abc", "xy"); // Substitui todas as ocorrências da substring "abc" por "xy".
int i = original.indexOf("bc"); // Retorna o índice da primeira ocorrência da substring "bc".
int j = original.lastIndexOf("bc"); // Retorna o índice da última ocorrência da substring "bc".

// Exibe os resultados de cada operação
System.out.println("Original: -" + original + "-"); // Imprime a string original.
System.out.println("toLowerCase: -" + s01 + "-"); // Imprime a string em minúsculas.
System.out.println("toUpperCase: -" + s02 + "-"); // Imprime a string em maiúsculas.
System.out.println("trim: -" + s03 + "-"); // Imprime a string sem espaços no início e no final.
System.out.println("substring(2): -" + s04 + "-"); // Imprime a substring a partir do índice 2.
System.out.println("substring(2, 9): -" + s05 + "-"); // Imprime a substring entre os índices 2 e 9.
System.out.println("replace('a', 'x'): -" + s06 + "-"); // Imprime a string após substituir 'a' por 'x'.
System.out.println("replace('abc', 'xy'): -" + s07 + "-"); // Imprime a string após substituir "abc" por "xy".
System.out.println("Index of 'bc': " + i); // Imprime o índice da primeira ocorrência de "bc".
System.out.println("Last index of 'bc': " + j); // Imprime o índice da última ocorrência de "bc".

Tela:
Original: -abcde FGHIJ ABC abc DEFG   -
toLowerCase: -abcde fghij abc abc defg   -
toUpperCase: -ABCDE FGHIJ ABC ABC DEFG   -
trim: -abcde FGHIJ ABC abc DEFG-
substring(2): -cde FGHIJ ABC abc DEFG   -
substring(2, 9): -cde FGH-
replace('a', 'x'): -xbcde FGHIJ ABC xbc DEFG   -
replace('abc', 'xy'): -xyde FGHIJ ABC xy DEFG   -
Index of 'bc': 1
Last index of 'bc': 17


-----------------------------------

Operação split: serve para recortar o string

String s = "potato apple lemon"; // Declara uma string contendo três palavras separadas por espaços.

String[] vect = s.split(" "); // Divide a string 's' em um array de substrings, usando o espaço (" ") como delimitador.

// Imprime cada palavra armazenada no array 'vect' usando os índices apropriados.
System.out.println(vect[0]); // Imprime a primeira palavra do array: "potato".
System.out.println(vect[1]); // Imprime a segunda palavra do array: "apple".
System.out.println(vect[2]); // Imprime a terceira palavra do array: "lemon".

Tela:
potato
apple
lemon



     */
}
