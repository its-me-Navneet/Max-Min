public class App<T extends Comparable<T>> {

    public T findMaximum(T value1, T value2, T value3) {
        T max = value1;

        if (value2.compareTo(max) > 0) {
            max = value2;
        }

        if (value3.compareTo(max) > 0) {
            max = value3;
        }

        return max;
    }

    public static void main(String[] args) {
        App<Integer> integerFinder = new App<>();
        System.out.println("Maximum Integer: " + integerFinder.findMaximum(5, 8, 3));
        System.out.println("Maximum Integer: " + integerFinder.findMaximum(8, 5, 3));
        System.out.println("Maximum Integer: " + integerFinder.findMaximum(5, 3, 8));

        App<Double> doubleFinder = new App<>();
        System.out.println("Maximum Double: " + doubleFinder.findMaximum(3.14, 2.5, 5.7));
        System.out.println("Maximum Double: " + doubleFinder.findMaximum(3.14, 5.7, 3.14));
        System.out.println("Maximum Double: " + doubleFinder.findMaximum(5.7, 2.5, 3.14));

        App<String> stringFinder = new App<>();
        System.out.println("Maximum String: " + stringFinder.findMaximum("apple", "banana", "orange"));
        System.out.println("Maximum String: " + stringFinder.findMaximum("apple", "orange", "bnanana"));
        System.out.println("Maximum String: " + stringFinder.findMaximum("orange", "banana", "apple"));
    }
}
