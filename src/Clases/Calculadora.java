/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author harol
 */
public class Calculadora {
    //Aquí se implementa el bloque de código de la clase
    //atributos
    private int result_operacion;
        
    //metodos constructores
    public Calculadora() {
        this.result_operacion = 0;        
    }
    
    //metodos getter and setter
    public int getResult_operacion() {
        return result_operacion;
    }

    public void setResult_operacion(int result_operacion) {
        this.result_operacion = result_operacion;
    }
    
    //metodos de comportamiento   
    public void sumar(int p_sumando1, int p_sumando2) {
        this.result_operacion = p_sumando1 + p_sumando2;
    }
    
    public void restar(int p_minuendo, int p_sustraendo) {
        this.result_operacion = p_minuendo - p_sustraendo;
    }
    
    public void multiplicar(int p_factor1, int p_factor2) {
        this.result_operacion = p_factor1 * p_factor2;
    }
    
    public void dividir(int p_dividendo, int p_divisor) {
        this.result_operacion = p_dividendo / p_divisor;
    } 
    
}
