
package pacoteaves;

import pacoteinterfaces.AnimalNadador;
import pacoteinterfaces.AnimalVoador;

public class Pato extends Ave implements AnimalNadador, AnimalVoador {
    
    public Pato(String especie, String bico, int sexo) {
        super(especie, bico, sexo);
    }

    @Override
    public void Nadar() {
        System.out.println("Espalha oleo da glandula pelo corpo");
        System.out.println("Entra na água e bate as pernas para nadar");
    }

    @Override
    public void voar() {
        System.out.println("Bate as asas para voar");
    }

    void nadar() {
        System.out.println("Mergulha e bate as pernas para nadar");
    }

    
}
