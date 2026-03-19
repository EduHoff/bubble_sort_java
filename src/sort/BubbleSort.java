package sort;

public class BubbleSort {

    public static Integer[] bubbleSort(Integer[] array){

        for(int i=0;i<array.length; i++){
            boolean swapped=false; 
            
            for(int j=0; j<array.length - (1 + i); j++){
                if(array[j] > array[j+1]){
                    int aux = array[j];
                    array[j] = array[j+1];
                    array[j+1] = aux;
                    swapped=true;
                }
                System.out.println("Vetor Debug: " + java.util.Arrays.toString(array));
            }

            if(!swapped) break;
        }

        return array;
    }
}
