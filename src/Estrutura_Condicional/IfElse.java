package Estrutura_Condicional;

public class IfElse {

    /*
    Sintaxe da estrutura condicional:

    simples:
    if ( <condição> ) {
         <comando 1>
         <comando 2>
}

Exemplo:
        int numero = 10;

        if (numero > 5) { // condição simples
            System.out.println("O número é maior que 5");
            System.out.println("Fim da verificação simples.");
        }

--------------------

    composta:
    if ( <condição> ) {
         <comando 1>
         <comando 2>
}
   else {
         <comando 3>
         <comando 4>
}

Exemplo:
        int numero = 3;

        if (numero % 2 == 0) { // verifica se é par
            System.out.println("O número é par.");
        } else { // caso contrário, é ímpar
            System.out.println("O número é ímpar.");
        }

--------------------

    Encadeamento de estruturas condicionais:

if ( condição 1 ) {
comando 1
comando 2
}
else {
}
         if ( condição 2 ) {
           comando 3
           comando 4
         }
         else {
           comando 5
           comando 6
         }

Exemplo:
        int idade = 17;

        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            if (idade >= 16) {
                System.out.println("Você pode votar, mas ainda não é maior de idade.");
            } else {
                System.out.println("Você é menor de idade e ainda não pode votar.");
            }

--------------------

if ( condição 1 ) {
comando 1
comando 2
}
else if ( condição 2 ) {
comando 3
comando 4
}
else if ( condição 3 ) {
comando 5
comando 6
}
else {
comando 7
comando 8
}

Exemplo:
        int nota = 85;

        if (nota >= 90) {
            System.out.println("Excelente! Você tirou A.");
        } else if (nota >= 80) {
            System.out.println("Muito bom! Você tirou B.");
        } else if (nota >= 70) {
            System.out.println("Bom! Você tirou C.");
        } else {
            System.out.println("Você precisa melhorar. Nota insuficiente.");
        }

     */
}
