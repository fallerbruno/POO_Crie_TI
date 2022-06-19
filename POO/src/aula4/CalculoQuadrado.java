package aula4;

import modelos.CalculoArea;
import modelos.Entrada;

/**
 *
 * @author faller
 */
public class CalculoQuadrado {

    public static void main(String[] args) {

        double lado = Entrada.leiaDouble("Digite o tamanho do lado");
        double lado1 = Entrada.leiaDouble("Digit o tamanho do outro lado");
        
        System.out.println("A Area do Quadrado é: " + CalculoArea.CalculoArea(lado, lado1));
        System.exit(0);
    }


}
