/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4b;

/**
 *
 * @author slagogonzalez
 */
public class Consumo {
    private float km;
    private float litros;
    private float vMed;
    private float pGas;
    //constructores
    public Consumo(){
        
    }
    public Consumo (float km, float litros,float vMed,float pGas){
        this.km=km;
        this.litros=litros;
        this.vMed=vMed;
        this.pGas=pGas;
    }
    //metodos
    public float getTempo(){
        return vMed/km;
    }
    public float comsumoMedio(){
        return 100*litros/km;
    }
    public float consumoEuros(){
        return 100*(pGas*litros)/km;
    }
    public void setKms (float km){
        this.km=km;
    }
    public void setLitros(float litros){
        this.litros=litros;
    }
    public void setVmed (float vMed){
        this.vMed=vMed;
    }
    public void setPgas (float pGas){
        this.pGas=pGas;    
    }
    public float getVmed (){
        return vMed;
    }
            
}