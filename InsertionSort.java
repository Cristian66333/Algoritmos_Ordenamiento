public class InsertionSort {
    public static void main(String[] args) {
        String[] cadenas = {"-HOLA","hola","CARRO","carro"};
        
        selectionStrings(cadenas);
    }
    public static void selectionStrings(String[] cadenas){
       for (int i = 1; i < cadenas.length; i++) {
            String aux = cadenas[i];
            int j = i;
            int res = aux.compareTo(cadenas[j-1]);
            while (j>0&&aux.compareTo(cadenas[j-1])<0) {
                cadenas[j] = cadenas[j-1];
                j--;
            }
            cadenas[j] = aux;
        }
        System.out.print("|");
        for (int i = 0; i < cadenas.length; i++) {
            System.out.print(cadenas[i]+"|");
        }
    }
}
