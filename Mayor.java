/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayor;

import javax.swing.JOptionPane;

/**
 *
 * @author Jose
 */
public class Mayor {

  public static void main(String[] args) {
        int num, i, may100;
        String may100cad = "";
        may100 = 0;
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el tamaño del arreglo"));

        int[] x = new int[num];

        for (i = 0; i < x.length; i++) {
            x[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingresa el valor[" + i + "]"));
        }
        for (i = 0; i < x.length; i++) {
            if (x[i] >= 100) {
                may100++;
                may100cad = may100cad + x[i] + " ";
            }
        }
        JOptionPane.showMessageDialog(null, "los cantidad de numeros mayores o iguaes que 100 son: " + may100 + " y son: " + may100cad);
    }

}