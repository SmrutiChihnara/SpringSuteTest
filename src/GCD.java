public class GCD {
    public static void gcd(int a, int b) {
        int small, big, sum = 1;
        int i = 1;
        if (a < b) {
            big = b;
            small = a;
        } else big = a;
        small = b;
        while (i < small) {
            if (a % i == 0 && b % i == 0) {
                a = a / i;
                b = b / i;
                sum = sum * i;
                i=1;


            }
            i++;
        }
        sum =sum* a * b;
        System.out.println(sum);

    }

    public static void main(String[] args) {
gcd(36,21);
    }
}
