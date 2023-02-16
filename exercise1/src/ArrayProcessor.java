import java.util.Arrays;

public class ArrayProcessor {

    public static final IArrayProcessor max = array -> Arrays.stream(array).max().getAsDouble();
    public static final IArrayProcessor min = array -> Arrays.stream(array).min().getAsDouble();
    public static final IArrayProcessor sum = array -> Arrays.stream(array).sum();
    public static final IArrayProcessor average = array -> Arrays.stream(array).average().getAsDouble();
    public static IArrayProcessor counter(double value) {
        return array -> Arrays.stream(array).filter(data -> data == value).count();
    }
}
