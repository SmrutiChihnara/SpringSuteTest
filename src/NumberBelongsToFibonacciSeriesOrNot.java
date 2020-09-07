public class NumberBelongsToFibonacciSeriesOrNot {
    public static void getData(int a) {
        int firstN = 0;
        int secondN = 1;
        int thread = 0;
        while (thread < a) {
            thread = firstN + secondN;
            firstN = secondN;
            secondN = thread;
        }
        if (thread == a) {
            System.out.println("Number Belongs To Fibonacci Series");

        } else System.out.println("Number Belongs To Fibonacci Series  Not");

    }

    public static void main(String[] args) {
        getData(50);
    }
}
