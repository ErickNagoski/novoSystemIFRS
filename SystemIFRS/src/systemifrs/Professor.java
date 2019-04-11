/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package systemifrs;

/**
 *
 * @author erick
 */
public class Professor {
    
    private String nome;
    private String areas[];
    private long siape;

    void alterarNome(String newNome){
        this.nome = newNome;
    }
    
    boolean novaArea(String newArea){
        for (int i = 0; i < areas.length; i++) {
            if (areas[i] == null){
                areas[i] = newArea;
                return true;
            }
        }
        return false;
    }
    
    boolean removeArea(String area){
        for (int i = 0; i < areas.length; i++) {
            if(areas[i].equalsIgnoreCase(area)){
                areas[i] = null;
                return true;
            }
            
        }
        return false;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String[] getAreas() {
        return areas;
    }

    public void setAreas(String[] areas) {
        this.areas = areas;
    }

    public long getSiape() {
        return siape;
    }

    public void setSiape(long siape) {
        this.siape = siape;
    }

    public Professor(String nome,long siape, String[] areas) {
        this.nome = nome;
        this.areas = areas;
        this.siape = siape;
    }
    
}