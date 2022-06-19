/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula3;

/**
 *
 * @author faller
 */
public class Pessoa {

    private String nome;
    private int idade;
    private double peso;
    private char sexo;

    public Pessoa(String nome, int idade, double peso, char sexo) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.sexo = sexo;
    }

    public Pessoa() {

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        if (sexo == 'f') {
            sexo = 'F';
        } else if (sexo == 'm') {
            sexo = 'M';
        }
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("-----------------\n");
        retorno.append("Nome:");
        retorno.append(nome);
        retorno.append("\n");
        retorno.append("Idade:");
        retorno.append(idade);
        retorno.append("\n");
        retorno.append("Sexo: ");
        retorno.append(sexo);
        retorno.append("\n");
        retorno.append("Peso:");
        retorno.append(peso);
        retorno.append("\n");
        retorno.append("-----------------");

        return retorno.toString();

    }

}
