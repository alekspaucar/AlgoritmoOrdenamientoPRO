import java.util.Arrays;
public class MetodosOrdenamiento {


//pasar el parametro mostrarPasos en cada llamada a los métodos de ordenamiento


    public int[] burbujaOrdenamiento(int[] array , boolean cambio){
            /*
            *       if (mostrarPasos) {
            *           System.out.println("Iteración " + (i + 1) + ": " + Arrays.toString(arregloOrdenado));
            *        }
            */
        int[] arregloOrdenado = Arrays.copyOf(array, array.length);
        if (cambio == true){
            for(int i = 0; i < arregloOrdenado.length;i++){
                for(int j =  i + 1; j < arregloOrdenado.length;j++) {
                    if (arregloOrdenado[i] > arregloOrdenado[j]) {
                        int aux = arregloOrdenado[i];
                        arregloOrdenado[i] = arregloOrdenado[j];
                        arregloOrdenado[j] = aux;
                    }
                }   
            }
            return arregloOrdenado;    
        }else {
            for(int i = 0; i < arregloOrdenado.length;i++){
                for(int j =  i + 1; j < arregloOrdenado.length;j++) {
                    if (arregloOrdenado[i] < arregloOrdenado[j]) {
                        int aux = arregloOrdenado[i];
                        arregloOrdenado[i] = arregloOrdenado[j];
                        arregloOrdenado[j] = aux;
                    }
                }   
            }
            return arregloOrdenado;
        } 

    }
    public int[] seleccionOrdenamiento(int[] array, boolean cambio) {
        int[] arregloOrdenado = Arrays.copyOf(array, array.length);

        if (cambio == true) {  // Orden ascendente
            for (int i = 0; i < arregloOrdenado.length - 1; i++) {
                int indice = i;
                System.out.println("Iteración " + i + ":");
                
                for (int j = i + 1; j < arregloOrdenado.length; j++) {
                    System.out.println("\tComparando " + arregloOrdenado[j] + " con " + arregloOrdenado[indice]);
                    if (arregloOrdenado[j] < arregloOrdenado[indice]) {
                        indice = j;
                        System.out.println("\t\tNuevo mínimo encontrado en índice " + indice);
                    }
                }
    
                // Intercambio
                int temp = arregloOrdenado[indice];
                arregloOrdenado[indice] = arregloOrdenado[i];
                arregloOrdenado[i] = temp;
    
                System.out.println("\tArreglo después del intercambio: " + Arrays.toString(arregloOrdenado));
            }
        } else {  // Orden descendente
            for (int i = 0; i < arregloOrdenado.length - 1; i++) {
                int indice = i;
                System.out.println("Iteración " + i + ":");
    
                for (int j = i + 1; j < arregloOrdenado.length; j++) {
                    System.out.println("\tComparando " + arregloOrdenado[j] + " con " + arregloOrdenado[indice]);
                    if (arregloOrdenado[j] > arregloOrdenado[indice]) {
                        indice = j;
                        System.out.println("\t\tNuevo máximo encontrado en índice " + indice);
                    }
                }
    
                // Intercambio
                int temp = arregloOrdenado[indice];
                arregloOrdenado[indice] = arregloOrdenado[i];
                arregloOrdenado[i] = temp;
    
                System.out.println("\tArreglo después del intercambio: " + Arrays.toString(arregloOrdenado));
            }
        }
    
        return arregloOrdenado;
    }
    public int[] insercionOrdenamiento(int[] array, boolean cambio) {
         
            int[] arregloOrdenado = Arrays.copyOf(array, array.length);
            if (cambio == true){
                for (int j = 1; j < arregloOrdenado.length; j++) {
                    System.out.println("REPASO DE NUMERO " + j);
                    int key = arregloOrdenado[j];
                    int i = j - 1;
                    System.out.println("\ti=" + i + " j=" + j + " [i]=" + array[i] + " [j]=" + array[j]);
                    while (i >= 0 && arregloOrdenado[i] > key) {
                        System.out.println("\t\tComparamos " + key + " con " + array[j]);
                        arregloOrdenado[i + 1] = arregloOrdenado[i];
                        i--;
                        System.out.println("\t\t--------" + Arrays.toString(array));
                    }
                    System.out.println("\t--------" + Arrays.toString(array));
                    arregloOrdenado[i + 1] = key;
                }
                return arregloOrdenado;
            
            } else {
                for (int j = 1; j < arregloOrdenado.length; j++) {
                    int key = arregloOrdenado[j];
                    int i = j - 1;
                    while (i >= 0 && arregloOrdenado[i] <  key) {
                        arregloOrdenado[i + 1] = arregloOrdenado[i];
        
                        i--;
                    }
                    arregloOrdenado[i + 1] = key;
                }
                return arregloOrdenado;
        }
    }
    public int[] burbujaComplejaOrdenamiento(int[] array, boolean ascendente) {
            /*      if (mostrarPasos) {
             *           System.out.println("Iteración " + j + ": " + Arrays.toString(arregloOrdenado));
             *   }
             */
        int n = array.length;
        boolean intercambio;
        for (int i = 0; i < n - 1; i++) {
            intercambio = false;     
            for (int j = 0; j < n - 1 - i; j++) {
                if (ascendente ? (array[j] > array[j + 1]) : (array[j] < array[j + 1])) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    intercambio = true;
                }
            }
            if (!intercambio) {
                break;
            }
        }
        return array;
    }
    

} 
            
        


