/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package console;

import Clases.Calculadora;
import java.util.Scanner;

/**
 *
 * @author harol
 * Podir al usuario dos valores enteros cualesquiera y mostrar el resultado de la suma, resta, multiplicacion
 * y division de ambos números.
 */
public class Main {
    private static Scanner input;//declaracion del objeto

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        input = new Scanner(System.in);//asignarle memoria la objeto input
        Calculadora objCalc;//declarar el objeto de la clase
        objCalc = new Calculadora();
        
        //Esquema General de Ejecucion de un Algoritmo
        //1. Declaracion de las variables
        //datos de entrada
        int num1, num2;
        //datos de salida
        int suma, resta, multiplicacion, division;
        //datos auxiliares        
        //2. Entrada de los datos
        System.out.print("Digite el primer número entero: ");
        num1 = input.nextInt();
        System.out.print("Digite el segundo número entero: ");
        num2 = input.nextInt();        
        //3. Procesamiento de los datos
        objCalc.sumar(num1, num2);
        suma = objCalc.getResult_operacion();
        objCalc.restar(num1, num2);
        resta = objCalc.getResult_operacion();
        objCalc.multiplicar(num1, num2);
        multiplicacion = objCalc.getResult_operacion();
        objCalc.dividir(num1, num2);
        division = objCalc.getResult_operacion();        
        //4. Salida de los resultados
        System.out.println(num1 + " + " + num2 + " = " + suma);
        System.out.println(num1 + " - " + num2 + " = " + resta);
        System.out.println(num1 + " * " + num2 + " = " + multiplicacion);
        System.out.println(num1 + " / " + num2 + " = " + division);
        
    }
    
}
