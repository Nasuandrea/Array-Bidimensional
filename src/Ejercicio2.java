import java.util.Arrays;
import java.util.Random;

public class Ejercicio2 { public static void main(String[] args) {
        int contadorPares = 0;
        int contadorImpares = 0;

        int[] numerosAleatorios =new int[20];
        Random random = new Random();
        for (int i=0; i<numerosAleatorios.length ;i++){
        numerosAleatorios[i]= random.nextInt(100);
        }
        for(int j=0;j<numerosAleatorios.length;j++)
        {
            if (numerosAleatorios[j]%2==0){
                contadorPares++;
            }
            else {
                contadorImpares++;
            }
        }
    int [] numerosPares= new int[contadorPares];
    int [] numerosImpares = new int[contadorImpares];
    int j=0;
    for (int i=0;i<numerosAleatorios.length; i++){
       if (numerosAleatorios[i]%2==0){
           numerosPares[j]=numerosAleatorios[i];
           j++;
            }
        }
 j=0;
        for (int k=0;k<numerosAleatorios.length; k++){
           if(numerosAleatorios[k]%2!=0) {
               numerosImpares[j]=numerosAleatorios[k];
               j++;
        }
        }
        System.out.println("Array de Pares: " +Arrays.toString(numerosPares));
        System.out.println("Array de Impares: " +Arrays.toString(numerosImpares));


    }
}