/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio_314;

/**
 *
 * @author Lucas
 */
public class TesteEmployee {

    public static void main(String[] args) {
        Employee empregado1 = new Employee("Roberto", "Carlos", 100.0);
        Employee empregado2 = new Employee("Carlos", "Roberto", 150.0);
        double anual1, anual2;
        anual1 = empregado1.getSalario() * 12;
        anual2 = empregado2.getSalario() * 12;

        System.out.println("O salário de " + empregado1.getNome() + " " + empregado1.getSobreNome() + " é " + anual1);
        System.out.println("O salário de " + empregado2.getNome() + " " + empregado2.getSobreNome() + " é " + anual2);
        System.out.println();

        //Configurando os aumentos dos empregados 1 e 2
        double aumento1, aumento2;
        aumento1 = empregado1.getSalario() * 0.1;
        aumento2 = empregado2.getSalario() * 0.1;
        empregado1.setSalario(empregado1.getSalario() + aumento1);
        empregado2.setSalario(empregado2.getSalario() + aumento2);
        anual1 = empregado1.getSalario() * 12;
        anual2 = empregado2.getSalario() * 12;

        System.out.println("O salário de " + empregado1.getNome() + " " + empregado1.getSobreNome() + " depois do aumento é R$ " + anual1);
        System.out.println("O salário de " + empregado2.getNome() + " " + empregado2.getSobreNome() + " depois do aumento é R$" + anual2);

    }
}
