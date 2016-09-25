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
public class Employee {

    private String nome;
    private String sobreNome;
    private double salario;

    public Employee(String name, String lastName, double payment) {
        this.nome = name;
        this.sobreNome = lastName;
        if (payment >= 0) {
            this.salario = payment;
        }

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
