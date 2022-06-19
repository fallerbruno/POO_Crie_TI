package aula4;

import modelos.ContaBanco;
import modelos.Entrada;

/**
 *
 * @author faller
 */
public class TesteContas {

    public static void main(String[] args) {

        ContaBanco objConta1 = new ContaBanco("Bruno", "0001", "0001", 1500, 300, "51997230366");
        ContaBanco objConta2 = new ContaBanco("Yuri", "0002", "0002", 1000, 100, "5196948516");
        ContaBanco vetcontas[] = new ContaBanco[2];
        
        vetcontas[0] = objConta1;
        vetcontas[1] = objConta2;
//  
//        int op = 0;
//        int conta;
//
//        while (op != 5) {
//            op = Entrada.leiaInt("DIgite a opcão que deseja\n"
//                    + "[1] Saque\n"
//                    + "[2] Deposito\n"
//                    + "[3] Transferencia\n"
//                    + "[4] Pix\n"
//                    + "[5] Sair");
//            if (op == 1) {
//                conta = Entrada.leiaInt("DIgite numero da sua conta");
//                if (conta == 1) {
//                    objConta1.Saque(Entrada.leiaDouble("Quanto deseja Sacar"));
//                }
//                if (conta == 2) {
//                    objConta2.Saque(Entrada.leiaDouble("Quanto deseja Sacar"));
//                }
//            }
//            if (op == 2) {
//                conta = Entrada.leiaInt("DIgite numero da sua conta");
//                if (conta == 1) {
//                    objConta1.Deposito(Entrada.leiaDouble("Quanto deseja Depositar"));
//                }
//                if (conta == 2) {
//                    objConta2.Deposito(Entrada.leiaDouble("Quanto deseja Depositar"));
//                }
//            }
//
//            if (op == 3) {
//                conta = Entrada.leiaInt("DIgite numero da sua conta");
//                if (conta == 1) {
//                    objConta1.Transferir(objConta2, Entrada.leiaDouble("Digite o valor que deseja Transferir"));
//                }
//                if (conta == 2) {
//                    objConta2.Transferir(objConta1, Entrada.leiaDouble("Digite o valor que deseja Transferir"));
//                }
//            }
//
//            if (op == 4) {
//                 conta = Entrada.leiaInt("DIgite numero da sua conta");
//                 if (conta == 1) {
//                    objConta1.Pix(objConta2,Entrada.leiaString("Digite a chave Pix"));
//                    
//                }
//            }
//            if (op == 5) {
//                System.exit(0);
//            }
//
//        }
//
       
//        objConta1.setTitular("Bruno");
//        objConta1.setAgencia("0001");
//        objConta1.setConta("0001");
//        objConta1.setSaldo(1000);
//        objConta1.Transferir(objConta2, Entrada.leiaDouble("Digite o valor que deseja Transferir"));
        objConta1.Pix(vetcontas, Entrada.leiaString("Digite a chave pix"));
//        System.out.println(objConta1);
//        objConta1.Saque(Entrada.leiaDouble("Quanto deseja Sacar"));
//        objConta1.Deposito(Entrada.leiaDouble("Digite o valor que deseja Depositar"));
//        System.out.println(objConta1);
    
        System.exit(0);
       
    }

}
