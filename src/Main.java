public class Main {
    public static void main(String[] args) {

        int j = 100;
        for (int i = 1; i <= j; i += 2) {
            System.out.printf("%d,%d,%d,%d,", i, i + 1, j - i, j - i - 1);
        }
    }
}
