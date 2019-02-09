package edu.uninorte.lfevilla;

import java.util.Scanner;

/**
 *
 * @author luis Felipe Evilla <github.com/luisFelipeEvilla> 
 *
 */
public class Calculator {
    public static Scanner scan = new Scanner(System.in);
    
    public static double[] askNumbers(String message) {
        double numbers[];
        int n;
        
        System.out.printf("%s", message);        
        n = scan.nextInt();
        
        numbers = new double[n];
        
        for(int i= 0; i < numbers.length; i++) {
            if(i == 0) {
                System.out.println("Ingrese el primer número que desea operar");
                numbers[i] = scan.nextDouble();
            } else {
                System.out.println("Ingrese el siguiente número por favor");
                numbers[i] = scan.nextDouble();
            }
        }
        return numbers;
    }
    
    public static double sum() {
        String message = "¿Cuantos dígitos deseas sumar?\n";
        double numbers[] = askNumbers(message);
        double result = 0;
        
        for(int i= 0; i < numbers.length; i++) {
            result += numbers[i];
        }
        
        return result;
    }
    
    public static double sum(double numbers[]) {
        double result = 0;
        
        for(int i = 0; i < numbers.length; i++) {
            result += numbers[i];
        }
        
        return result;
    }
    
   public static double average() {
        String message = "¿De cuantos números deseas conocer el promedio?";
        double numbers[] = askNumbers(message);
        double sum = sum(numbers);
        double result = sum/numbers.length;
        
        return result;
    }
    
    public static void main(String[] args) {
        int op = 0;
        do {            
            System.out.println("Elige la operación que deseas realizar");
            System.out.println("1.Sumar");
            System.out.println("2.Calcular promedio");
            
            op = scan.nextInt();
             switch (op) {
                case 1:
                    System.out.println("El resultado de la suma es: " + sum());                   
                    break;
                case 2: 
                    System.out.println("El Promedio de los números ingresados es: " + average());
                    break;
                default:
                ;
            }
        } while (op <= 0 && op > 2);
    }
}
    
