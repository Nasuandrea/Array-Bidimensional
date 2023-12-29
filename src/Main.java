public class Main {
    public static void main(String[] args) {
       int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int ultimo =numeros[9];
       for (int i=9;i>0;i-- ){
           numeros[i]=numeros[i-1];
       }
        numeros[0]=ultimo;
       for (int j=0; j<=9;j++){
           System.out.println(numeros[j]);
       }

    }
}