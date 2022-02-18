public class Main {
    public static void main(String[] args) {

//        int j = 100;
//        for (int i = 1; i <= j; i += 2) {
//            System.out.printf("%d,%d,%d,%d,", i, i + 1, j - i, j - i - 1);
//        }
//        for (int i = 0; i < arr.lenght(); i++) {
//
//        }
        int x = 1;
        for (int i = 1; i <=128 ; i++) {
            x += x;
        }
        System.out.println(x);

    }

    void fizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
