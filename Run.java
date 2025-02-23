import java.util.Random;
import java.util.Scanner;

public class Run {

    public static void main(String[] args) {
        int[] numeros = new int[100000];
        Random random = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(50000);
        }
        /*System.out.print("|");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+"|");
        }
        System.out.println();*/
        bubbleSort(numeros);
        selectionSort(numeros);

        //String[] cadenas = {"hola","mundo","nombre","Nombre","Adios","Mundo"};
        //selectionStrings(cadenas);
        
        insertionSort(numeros);

    }
      
    public static void insertionSort(int[] numeros){
        long start = System.currentTimeMillis();
        for (int i = 1; i < numeros.length; i++) {
            int aux = numeros[i];
            int j = i;
            while (j>0&&aux<numeros[j-1]) {
                numeros[j] = numeros[j-1];
                j--;
            }
            numeros[j] = aux;
        }
        long end = System.currentTimeMillis();
        System.out.println("Tiempo insertion: " + (end - start));
    }

    public static void selectionStrings(String[] cadenas){
        for (int i = 0; i < cadenas.length-1; i++) {
            for (int j = cadenas.length-1; j > i; j--) {
                String aux = cadenas[i];
                if (cadenas[i].compareTo(cadenas[j])>0) {
                    cadenas[i] = cadenas[j];
                    cadenas[j] = aux;
                }
            }
        }
        System.out.print("|");
        for (int i = 0; i < cadenas.length; i++) {
            System.out.print(cadenas[i]+"|");
        }
    }

    public static void selectionSort(int[] numeros){
        long start = System.currentTimeMillis();
        for (int i = 0; i < numeros.length-1; i++) {
            for (int j = numeros.length-1; j > i; j--) {
                int aux = numeros[i];
                if (numeros[i]>numeros[j]) {
                    numeros[i] = numeros[j];
                    numeros[j] = aux;
                }
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("Tiempo selection: " + (end - start));
    }

    public static void bubbleSort(int[] numeros) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length - 1; j++) {
                if (numeros[j] < numeros[j + 1]) {
                    int bubble = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = bubble;
                }
            }
        }
        long end = System.currentTimeMillis();
        System.out.println("Tiempo bubble: " + (end - start));
    }

}