/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula1;

import modelos.Aluno;

/**
 *
 * @author faller
 */
public class ExercicioAluno {

    public static void main(String[] args) {

        Aluno objAluno1 = new Aluno();
        objAluno1.setIdade(36);
        objAluno1.setNome("Bruno Dutra");
        objAluno1.setAltura(182);
        objAluno1.setPeso(75);
        objAluno1.setSexo('m');

        Aluno objAluno2 = new Aluno();
        objAluno2.setIdade(23);
        objAluno2.setNome("Mariana");
        objAluno2.setAltura(160);
        objAluno2.setPeso(55);
        objAluno2.setSexo('f');

        Aluno objAluno3 = new Aluno();
        objAluno3.setIdade(30);
        objAluno3.setNome("Bruno Faller");
        objAluno3.setAltura(182);
        objAluno3.setPeso(105);
        objAluno3.setSexo('m');

        Aluno objAluno4 = new Aluno();
        objAluno4.setIdade(23);
        objAluno4.setNome("Yuri");
        objAluno4.setAltura(170);
        objAluno4.setPeso(70);
        objAluno4.setSexo('m');

      
        objAluno1.imprimir();
        objAluno2.imprimir();
        objAluno3.imprimir();
        objAluno4.imprimir();
        

        objAluno2.fazAniversario();
        objAluno2.imprimir();
    }
}
