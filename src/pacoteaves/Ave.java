/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pacoteaves;


public abstract class Ave {
    private String especie;
    private String bico;
    private int sexo;
    
    public static final int MACHO = 0, FEMEA = 1;

    public Ave(String especie, String bico, int sexo) {
        this.especie = especie;
        this.bico = bico;
        this.sexo = sexo;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getBico() {
        return bico;
    }

    public void setBico(String bico) {
        this.bico = bico;
    }

    public int getSexo() {
        return sexo;
    }

    public void setSexo(int sexo) {
        this.sexo = sexo;
    }
    
    public void porOvos(){
        if(sexo == FEMEA){
            System.out.println("A ave põe ovos.");
        }else{
            System.out.println("Ave macho, não põe ovos");
        }
    }
    
}
