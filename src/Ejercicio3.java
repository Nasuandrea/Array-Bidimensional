import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio3 { public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] numeros= new int[5];

    for(int i=0; i<5;i++){
        System.out.println("Dime 1 numero: ");
        numeros[i]=sc.nextInt();
    }
    System.out.println("Array base: "+Arrays.toString(numeros));
    Arrays.sort(numeros);
    System.out.println("Array ordenado: "+Arrays.toString(numeros));

}
}
