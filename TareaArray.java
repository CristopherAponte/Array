
package tareaarray;

import java.util.Scanner;

public class TareaArray {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int totalsuma=0;
        
        int[] numeros = new int[2];
        
        for(int i=0; i<numeros.length; i++){
            System.out.println("Ingrese Número: ");
            numeros[i]=num.nextInt();
        }
        
        for(int i =0; i<numeros.length; i++){
            totalsuma=totalsuma+numeros[i];
        }
        System.out.println("Total de la suma es " +totalsuma);
    }
    
}
