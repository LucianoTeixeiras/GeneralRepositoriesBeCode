/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CadastroPessoa;

/**
 *
 * @author luciano.t.da.silva
 */
public class Pessoa {
    
    private String strNome;
    private int intIdade;
    private double douPeso;
    
    //GET
    
    public void DefineNome(String Nome){
        this.strNome = Nome;
    }
    
    public void DefineIdade(int Idade){
        this.intIdade = Idade;
    }
    
    public void DefinePeso(double Peso){
        this.douPeso = Peso;
    }
    
    //SET
    
    public String ObterNome(){
        return this.strNome;
    }
    
    public int ObterIdade(){
        return this.intIdade;
    }
    
    public double ObterPeso(){
        return this.douPeso;
    }
    
    
}
