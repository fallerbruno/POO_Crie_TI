/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula3;

import modelos.Entrada;

/**
 *
 * @author faller
 */
public class Questionario {

    private String pergunta;
    private String respostaA;
    private String respostaB;
    private String respostaC;
    private char respostaCorreta;

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public String getRespostaA() {
        return respostaA;
    }

    public void setRespostaA(String respostaA) {
        this.respostaA = respostaA;
    }

    public String getRespostaB() {
        return respostaB;
    }

    public void setRespostaB(String respostaB) {
        this.respostaB = respostaB;
    }

    public String getRespostaC() {
        return respostaC;
    }

    public void setRespostaC(String respostaC) {
        this.respostaC = respostaC;
    }

    public char getRespostaCorreta() {
        return respostaCorreta;
    }

    public void setRespostaCorreta(char respostaCorreta) {
        this.respostaCorreta = respostaCorreta;
    }

    public int validaResposta(char resposta) {
        if (resposta == respostaCorreta) {
            System.out.println("Resposta Correta");
            return 1;
        } else {
            System.out.println("Resposta Incorreta");
            return 0;
        }
    }

    @Override
    public String toString() {
        StringBuilder retorno = new StringBuilder();
        retorno.append("-----------------");
        retorno.append("\n");
        retorno.append(pergunta);
        retorno.append("\n");
        retorno.append(respostaA);
        retorno.append("\n");
        retorno.append(respostaB);
        retorno.append("\n");
        retorno.append(respostaC);
        retorno.append("\n");
        retorno.append("-----------------");
        return retorno.toString();

    }
}
