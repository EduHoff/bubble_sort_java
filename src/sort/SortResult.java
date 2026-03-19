package sort;

import java.util.Arrays;

public class SortResult {
    
    private Integer[] array;
    private long comparisons;
    private long swaps;
    private long start_time_ns;
    private long end_time_ns;
    
    public SortResult(Integer[] array, long comparisons, long swaps, long start_time_ns, long end_time_ns) {
        this.array = array;
        this.comparisons = comparisons;
        this.swaps = swaps;
        this.start_time_ns = start_time_ns;
        this.end_time_ns = end_time_ns;
    }

    @Override
    public String toString() {
        return String.format(
            "Vetor ordenado: %s%n" +
            "Número de comparações: %d%n" +
            "Número de trocas: %d%n" +
            "Tempo de execução: %.6f ms",
            Arrays.toString(array),
            comparisons,
            swaps,
            getDuration() / 1_000_000.0
        );
    }

    public Integer[] getArray() {
        return array;
    }

    public long getComparisons() {
        return comparisons;
    }

    public void setComparisons(long comparisons) {
        this.comparisons = comparisons;
    }

    public long getSwaps() {
        return swaps;
    }

    public void setSwaps(long swaps) {
        this.swaps = swaps;
    }

    public long getDuration() {
        return end_time_ns - start_time_ns;
    }
}
