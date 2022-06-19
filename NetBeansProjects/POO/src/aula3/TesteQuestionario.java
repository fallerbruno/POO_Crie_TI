package aula3;

import modelos.Entrada;

/**
 *
 * @author faller
 */
public class TesteQuestionario {

    public static void main(String[] args) {

        Questionario objPergunta1 = new Questionario();
        Questionario objPergunta2 = new Questionario();
        Questionario objPergunta3 = new Questionario();

        objPergunta1.setPergunta("O Luciano gosta de beber?\n");
        objPergunta1.setRespostaA(" a) Sim");
        objPergunta1.setRespostaB(" b) Não");
        objPergunta1.setRespostaC(" c) Só Finais de semana");
        objPergunta1.setRespostaCorreta('a');

        objPergunta2.setPergunta("A Gabi Vai namorar com o Bruno?\n");
        objPergunta2.setRespostaA(" a) Sim");
        objPergunta2.setRespostaB(" b) Não");
        objPergunta2.setRespostaC(" c) Vão so ficar na enrolando");
        objPergunta2.setRespostaCorreta('c');

        objPergunta3.setPergunta("A Mariana vai pagar o 1k de sushi?\n");
        objPergunta3.setRespostaA(" a) Sim");
        objPergunta3.setRespostaB(" b) Não");
        objPergunta3.setRespostaC(" c) Talvez");
        objPergunta3.setRespostaCorreta('a');
        
        Questionario[] vetorPerguntas = new Questionario[3];
        
        vetorPerguntas[0] = objPergunta1;
        vetorPerguntas[1] = objPergunta2;
        vetorPerguntas[2] = objPergunta3;
       
        
//        if (Entrada.leiaChar(objPergunta1.toString()) == objPergunta1.getRespostaCorreta()) {
//            System.out.println("Resposta Correta");
//        } else {
//            System.out.println("Resposta Incorreta");
//        }
//
//        if (Entrada.leiaChar(objPergunta2.toString()) == objPergunta2.getRespostaCorreta()) {
//            System.out.println("Resposta Correta");
//        } else {
//            System.out.println("Resposta Incorreta");
//        }
//        if (Entrada.leiaChar(objPergunta3.toString()) == objPergunta3.getRespostaCorreta()) {
//            System.out.println("Resposta Correta");
//        } else {
//            System.out.println("Resposta Incorreta");
//        }
        int correto = 0;
        
        for (int i = 0; i <vetorPerguntas.length; i++) {
             correto += vetorPerguntas[i].validaResposta(Entrada.leiaChar(objPergunta1.toString()));
        }
//        correto += vetorPerguntas[0].validaResposta(Entrada.leiaChar(objPergunta1.toString()));
//        correto += vetorPerguntas[1].validaResposta(Entrada.leiaChar(objPergunta2.toString()));
//        correto += vetorPerguntas[2].validaResposta(Entrada.leiaChar(objPergunta3.toString()));
//        
        System.out.println("Você acertou: " + correto);
    }
}
