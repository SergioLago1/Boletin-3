/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin4b;

import javax.swing.JOptionPane;

/**
 *
 * @author slagogonzalez
 */
public class Boletin4B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Consumo consum= new Consumo();
      consum.setLitros(50);
      consum.setPgas(1.57f);
      String km=JOptionPane.showInputDialog("Kilómetros=");
      String pGas=JOptionPane.showInputDialog("Precio da Gasolina=");
      String vMed=JOptionPane.showInputDialog("Velocidade media=");
      String litros=JOptionPane.showInputDialog("Litros=");
      Consumo consume= new Consumo(Float.parseFloat(km),Float.parseFloat(pGas),Float.parseFloat(vMed),Float.parseFloat(litros));
      JOptionPane.showMessageDialog(null,"Consumo medio ="+ consume.comsumoMedio());
      litros=JOptionPane.showInputDialog("Litros=");
      consume.setLitros(Float.parseFloat(litros));
      JOptionPane.showMessageDialog(null,"Velocidade media="+consume.getVmed());
    }
}