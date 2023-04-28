/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mmcmdc;

import javax.swing.JOptionPane;

/**
 *
 * @author Pichau
 */
public class MmcMdc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Numero numero = new Numero();
        int i=0;
        
      do{
          
          int opc = Integer.parseInt(JOptionPane.showInputDialog(null,"0-Sair\n1-MMC\n2-MDC","MMC E MDC",JOptionPane.QUESTION_MESSAGE));
        switch(opc)
        {
            case 0:
                System.exit(0);
                break;
                
            case 1:
               int num1 = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o primeiro número"));
               numero.setN1(num1);
               int num2=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o segundo número"));
               numero.setN2(num2);
               JOptionPane.showMessageDialog(null,numero.calculaMmc(),"MMC",JOptionPane.INFORMATION_MESSAGE);
               break;
            case 2:
               int num = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o primeiro número"));
               numero.setN1(num);
               int nu=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o segundo número"));
               numero.setN2(nu);
               JOptionPane.showMessageDialog(null,numero.calculaMdc(),"MDC",JOptionPane.INFORMATION_MESSAGE);
            default:
                i=1;
                
                break;
                
               
        }
      }while(i==1);
    }
    
}
