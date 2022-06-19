package aula2;

/**
 *
 * @author faller
 */
public class CompararString {

    public static void main(String[] args) {

        String nome1 = ("Bruno Faller");
        String nome2 = ("BRUNO FALLER");
        
        
        if (nome1.equals(nome2)) {
            System.out.println("Nomes são Iguais");
        } else if (nome1.equalsIgnoreCase(nome2)) {
            System.out.println("Iguais com capitalizacao difente");
        } else {
            System.out.println("Diferentes");
        }

    }

}
