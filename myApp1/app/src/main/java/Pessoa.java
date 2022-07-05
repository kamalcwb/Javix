/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kamal
 */
public class Pessoa {
    private String nome;
    private int idade;
    private float peso;
    private float altura;
    
    public float calcIMC() {
        float IMC = peso / (altura * altura);
        return IMC;
    }
    
    //Metodos acessores
    
    public void setPeso(float peso){
        this.peso = peso;
    }
    
    public float getPeso(){
        return peso;
    }
    
    public void setAltura(float altura){
        this.altura = altura;
    }
    public float getAltura(){
        return altura;
    }
}
