/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author faller
 */
public class Aluno {
    private String nome;
    private int idade;
    private int altura;
    private double peso;
    private char sexo;
    
  //alt insert getter and set para as private
  //cuidar os nomes para os metodos e variaveis
        

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

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
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
        this.sexo = sexo;
    }
    
    
    public void fazAniversario(){
        idade++;
    }
    
    public void imprimir(){
        System.out.println("nome do aluno: " + nome + " tem " + idade + " anos ");
       
    }
}
