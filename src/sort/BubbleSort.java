package sort;

public class BubbleSort {

    public static <T extends Number> T[] bubbleSort(T[] array){

        for(int i=0;i<array.length; i++){
            for(int j=i+1; j<array.length; j++){
                if(array[i].doubleValue() > array[j].doubleValue()){
                    T aux = array[i];
                    array[i] = array[j];
                    array[j] = aux;
                }
            }
        }

        return array;
    }
}
