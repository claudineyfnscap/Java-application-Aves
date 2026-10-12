
package pacoteaves;

import java.util.ArrayList;


public class TestaAves {
    
    public static void main (String[] args) {
        ArrayList <Ave> aves = new ArrayList<>();
        aves.add(new Pato("Pato real","Filtrador", Ave.FEMEA));
        aves.add(new Pinguim("Pinguim-Imperador","Forte e fino", Ave.MACHO));
        aves.add(new Pinguim("Pinguim Imperador","Curto", Ave.FEMEA));
        aves.add(new Pato("Pato-bravo","Filtrador", Ave.FEMEA));
        
        for(Ave aveAtual : aves){
            System.out.println("Especie:" + aveAtual.getEspecie());
            if (aveAtual instanceof Pato){
                System.out.println("Voar: ");
                ((Pato)aveAtual).voar();
                System.out.println("Nadar: ");
                ((Pato)aveAtual).nadar();
            }else if(aveAtual instanceof Pinguim){
                System.out.println("Nadar: ");
                ((Pinguim)aveAtual).nadar();
            }
            
            System.out.println("Bico: " + aveAtual.getBico());
            System.out.println("Por ovos");
            aveAtual.porOvos();
            System.out.println();
        }
    }
}
