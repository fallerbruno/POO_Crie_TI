package aula3;

import modelos.Entrada;

/**
 *
 * @author faller
 */
public class TestePessoa {

    public static void main(String[] args) {

        Pessoa objPessoa1 = new Pessoa();
        //Pessoa objPessoa3 = new Pessoa("Bruno", 18, 90, 'M');

        objPessoa1.setNome(Entrada.leiaString("Digite Nome da Pessoa"));
        objPessoa1.setIdade(Entrada.leiaInt("Digite a Idade da Pessoa"));
        objPessoa1.setSexo(Entrada.leiaChar("Digite Sexo da Pessoa"));
        objPessoa1.setPeso(Entrada.leiaDouble("Digite o Peso da Pessoa"));

        Pessoa objPessoa2 = new Pessoa(Entrada.leiaString("Digite um nome"), Entrada.leiaInt("Digite idade"), Entrada.leiaDouble("Digite Peso"), Entrada.leiaChar("DIgite sexo"));

        System.out.println(objPessoa1);
        System.out.println(objPessoa2);
        //System.out.println(objPessoa3);

        //testar nomes iguais
        if (objPessoa1.getNome().equalsIgnoreCase(objPessoa2.getNome())) {
            System.out.println("Nomes são iguais");
        } else {
            System.out.println("Nomes não são iguais");
        }

        // testar qual possui mais caracteres
        if (objPessoa1.getNome().length() > objPessoa2.getNome().length()) {
            System.out.println("Pessoa 1 possui mais caracteres " + objPessoa1.getNome());
        } else if (objPessoa2.getNome().length() > objPessoa1.getNome().length()) {
            System.out.println("Pessoa 2 possui mais caracteres " + objPessoa2.getNome());
        } else if (objPessoa1.getNome().length() == objPessoa2.getNome().length()) {
            System.out.println("Possuem mesmo numero de caracteres");
        }
    }

}
