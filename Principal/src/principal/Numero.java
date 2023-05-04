/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author Pichau
 */
public class Numero {

    private int binario;
    private int decimal;

    public int getBinario() {
        return binario;
    }

    public void setBinario(int binario) {
        this.binario = binario;
    }

    public int getDecimal() {
        return decimal;
    }

    public void setDecimal(int decimal) {
        this.decimal = decimal;
    }

    public String converteBinario() {
        String saida = "O número em Decimal é ";
        int decimal = 0;
        int potencia = 1;
        int digito = 0;

        while (binario > 0) {
            digito = binario % 10;
            decimal += digito * potencia;
            potencia = potencia * 2;
            binario = binario / 10;
        }
        return saida += decimal;
    }

    public String converteDecimal() {
        String binario = "";
        String binarioContrario = "O valor em binário é ";
        do {
            binario += "" + decimal % 2;
            decimal = decimal / 2;
        } while (decimal != 0);
        for (int i = binario.length() - 1; i >= 0; i--) {
            binarioContrario += binario.charAt(i);
        }
        return binarioContrario;
    }
}
