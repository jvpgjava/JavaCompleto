package Mais_topicos_basicos;

public class Restricoes_E_convencoes_Para_Nomes {

    /*
Restrições para nomes de variáveis:
•Não pode começar com dígito: use uma letra ou _
•Não usar acentos ou til
•Não pode ter espaço em branco
•Sugestão: use nomes que tenham um significado

 Errado:
 int 5minutes;
 int salário;
 int salario do funcionario;

 Correto:
 int_5minutes;
 intsalario;
 intsalarioDoFuncionario;

 ------------------

 Convenções:

 •CamelCase: lastName
 Utilizado para:
 •pacotes
 •atributos
 •métodos
 •variáveis e parâmetros

 •Pascal Case: ProductService
 Utilizado para nome de classes.

 Exemplo para perceber o padrão:

 package entities;

 public class Account {
    private String holder;
    private Double balance;

 public Account(String holder, Double balance) {
      this.holder= holder;
      this.balance= balance;
 }
 public String getHolder() {
      returnholder;
 }
 public void deposit(double amount) {
      balance+= amount;
 }
 public void withdraw(double amount) {
      balance-= amount;
 }
 }



     */
}
