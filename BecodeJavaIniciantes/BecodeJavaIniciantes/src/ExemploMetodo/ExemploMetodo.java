/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExemploMetodo;

import javax.swing.JOptionPane;

/**
 *
 * @author luciano.t.da.silva
 */
public class ExemploMetodo {
    
    static int Num1, Num2, Soma, Subtracao;
    
    public static void main(String[] args) {
        
        Num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro Valor"));
        Num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo Valor"));
        
        SomarValores();
        SubtrairValores();
        
        JOptionPane.showMessageDialog(null, "A soma dos valores é: " + Soma);
        JOptionPane.showMessageDialog(null, "A subtracao dos valores é: " + Subtracao);
        
    }
    
    public static void SomarValores(){
            
            Soma = Num1 + Num2;
            
    }
    
    public static void SubtrairValores(){
            
            Subtracao = Num1 - Num2;
            
    }

}
