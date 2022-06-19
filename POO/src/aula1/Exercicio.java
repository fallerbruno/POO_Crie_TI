package aula1;

/**
 *
 * @author faller
 */
public class Exercicio {

    //  modificador de acesso.
    //public = permite que o método fique visível para outas classes / 
    //private = permite que apenas a propria classe utilize o método
    //protect = ?
    //
    //static = permite que o método seja invocada sem necessidade de criar uma nova instância
    //void = o método em questao não tem retorno
    
    public static void main(String[] args) {

        int variavel1 = 30, variavel2 = 28;

        String resultado = imprimirExemplos(variavel1, variavel2);
        
        Operacoes operacoes = new Operacoes();
        
        int result = operacoes.somar(variavel1,variavel2);
        
        System.out.println(resultado);

        System.out.println("a soma das variaveis " + result);
    }

    public static String imprimirExemplos(int var1, int var2) {

        //inicializacao do StringBuilder
        StringBuilder resultadoFinal = new StringBuilder();

        //retorna valor de var1
        resultadoFinal.append("var 1 = ");
        resultadoFinal.append(var1);
        resultadoFinal.append("\n");

        //retorna valor de var2
        resultadoFinal.append("var 2 = ");
        resultadoFinal.append(var2);
        resultadoFinal.append("\n");

        //retorna se var1 é igual a var2
        resultadoFinal.append("var 1 == var2 ");
        resultadoFinal.append(var1 == var2);
        resultadoFinal.append("\n");

        //retorna se var1 é diferente de var2
        resultadoFinal.append("var 1 !=  var 2 ");
        resultadoFinal.append(var1 != var2);
        resultadoFinal.append("\n");

        //retorna o contrario do teste usando ! na frente do teste
        resultadoFinal.append("!(var 1 !=  var 2) ");
        resultadoFinal.append(!(var1 != var2));
        resultadoFinal.append("\n");

        //retorna se var1 é menor que var2
        resultadoFinal.append("var 1 <  var 2 ");
        resultadoFinal.append(var1 < var2);
        resultadoFinal.append("\n");

        //retorna se var1 é maior que var2
        resultadoFinal.append("var 1 >  var 2 ");
        resultadoFinal.append(var1 > var2);
        resultadoFinal.append("\n");

        //retorna se var 1 é menor ou igual a var2
        resultadoFinal.append("var 1 <=  var 2 ");
        resultadoFinal.append(var1 <= var2);
        resultadoFinal.append("\n");

        //retorna se var 1 é maior ou igual a var2
        resultadoFinal.append("var 1 >=  var 2 ");
        resultadoFinal.append(var1 >= var2);
        resultadoFinal.append("\n");

        return resultadoFinal.toString();
    }

}
