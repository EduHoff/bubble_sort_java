package sort;

public class BubbleSort {

    public static SortResult bubbleSort(Integer[] array){

        long comparisons=0;
        long swaps=0;
        long start_time_ns = System.nanoTime();

        for(int i=0;i<array.length; i++){
            boolean swapped=false; 
            
            for(int j=0; j<array.length - (1 + i); j++){
                comparisons++;

                if(array[j] > array[j+1]){
                    int aux = array[j];
                    array[j] = array[j+1];
                    array[j+1] = aux;

                    swaps++;
                    swapped=true;
                }
                //System.out.println("Vetor Debug: " + java.util.Arrays.toString(array)); //apenas para visualizar as comparações
            }

            if(!swapped) break;
        }
        long end_time_ns = System.nanoTime();

        SortResult result = new SortResult(array, comparisons, swaps, start_time_ns, end_time_ns);

        return result;
    }
}
