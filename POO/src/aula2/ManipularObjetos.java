package aula2;

import modelos.Carro;
import modelos.Modelo;

/**
 *
 * @author faller
 */
public class ManipularObjetos {

    public static void main(String[] args) {
        //ctrl espaco
        
        Modelo modelo = new Modelo("Ford", "Ka");
        
        Carro objCarro1 = new Carro("xxxxxxxxxx", "Vermelho","Ford", modelo, 2020, 2021);
        
        
        Carro objCarro2 = new Carro();
        
        objCarro2.setModelo(new Modelo("Fiat", "Palio"));
        objCarro2.setNumero_chassi("XXXXXXXXXXXXX");
        objCarro2.setCor("Verde");
        objCarro2.setAno_fabricacao(2015);
        objCarro2.setAno_modelo(2016);
        
        if (objCarro1.getAno_fabricacao() > objCarro1.getAno_fabricacao()) {
            System.out.println("O mais novo é: \n\n" + objCarro2);
        } else if (objCarro1.getAno_fabricacao() == objCarro1.getAno_fabricacao()) {
            System.out.println("São do mesmo ano\n\n" + objCarro1 + "\n\n" + objCarro2);
        } else {
            System.out.println("O mais novo é: \n\n" + objCarro1);
        }
    }
}
