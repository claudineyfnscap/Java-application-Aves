/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacoteaves;

import pacoteinterfaces.AnimalNadador;

/**
 *
 * @author fnsca
 */
public class Pinguim extends Ave implements AnimalNadador {
    
    public Pinguim(String especie, String bico, int sexo) {
        super(especie, bico, sexo);
    }

    @Override
    public void Nadar() {
        System.out.println("Mergulha na água e bate as pernas para nadar");
    }

    void nadar() {
        System.out.println("Merguolha e bate as pernas para nadar");
    }
    
}
