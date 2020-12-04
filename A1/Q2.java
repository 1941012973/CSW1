import java.util.Scanner;

class Main {
    static double squareRoot(double n, double l) {
        double x = n;
        double root;
        int count = 0;
        while (true) {
            count++;
            root = 0.5 * (x + (n / x));
            if (Math.abs(root - x) < l)
                break;
            x = root;
        }

        return root;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        double l = 0.000001;
        System.out.println(squareRoot(n, l));
        sc.close();
    }
}
