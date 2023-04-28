/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mmcmdc;

/**
 *
 * @author Pichau
 */
public class Numero {
    private int n1,n2,soma,aux,operaçao,resto;

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }

    public int getSoma() {
        return soma;
    }

    public void setSoma(int soma) {
        this.soma = soma;
    }

    public int getAux() {
        return aux;
    }

    public void setAux(int aux) {
        this.aux = aux;
    }

    public int getOperaçao() {
        return operaçao;
    }

    public void setOperaçao(int operaçao) {
        this.operaçao = operaçao;
    }
    
    public int calculaMmc()
    {
        if ( n1 < n2 ) {
                aux = n1;
                n1 = n2;
                n2 = aux;
                }

                 soma = n1;

                 while ( soma % n2 != 0 ) {
                 soma += n1;
                } 
                 
      return soma;
    }
   public int calculaMdc()
   {
       if ( n1 < n2 ) {
                 aux = n1;
                 n1 = n2;
                 n2 = aux;
                }

                resto = n1 % n2;

                while ( resto != 0 ) {
                 n1 = n2;
                 n2 = resto;
                 resto = n1 % n2;
                }
       return n2;         
   }
}
