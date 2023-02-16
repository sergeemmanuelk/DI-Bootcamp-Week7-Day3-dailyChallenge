public class Main {
    public static void main(String[] args) {
        double[] array = {30, 4, 6.6, 4.5, 3, 12.8, 13.4, 4, 18, -6, -2.3, -0.9, 100, 8};
        System.out.println("Max Value : " + ArrayProcessor.max.apply(array));
        System.out.println("Min Value : " + ArrayProcessor.min.apply(array));
        System.out.println("Sum : " + ArrayProcessor.sum.apply(array));
        System.out.println("Average: " + ArrayProcessor.average.apply(array));
        System.out.println("Count of 4 : " + (int) ArrayProcessor.counter(4).apply(array));
    }
}