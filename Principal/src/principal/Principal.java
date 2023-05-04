/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;

import javax.swing.JOptionPane;

/**
 *
 * @author Pichau
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Numero numero = new Numero();
        while (true) {

            int opc = Integer.parseInt(JOptionPane.showInputDialog(null, "Selecione as opções\n"
                    + "1-Converte binário para decimal\n"
                    + "2-Converte de decimal para binário\n"
                    + "3-Sair"));
            if (opc == 1) {
                numero.setBinario(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor em binário", "Conversor de binário para decimal",3)));
                JOptionPane.showMessageDialog(null, numero.converteBinario(), "Conversor binário para decimal", 1);
            }else if(opc==2){
                numero.setDecimal(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite o valor em decimal","Conversor de decimal para binário",3)));
                 JOptionPane.showMessageDialog(null, numero.converteDecimal(), "Conversor binário para decimal", 1);
            }else if(opc==3){
                break;
            }else{
                JOptionPane.showMessageDialog(null, "Erro","CONVERSOR", 0)  ;
            }
        }
    }

}
