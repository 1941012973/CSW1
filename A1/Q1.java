import java.util.Scanner;
import java.lang.Math;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {
        int num_payments;
        int Principle;

        float InterestRate;
        float i, n;

        double p;
        double PaymentAmount;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount of load > ");
        Principle = sc.nextInt();
        System.out.println("");

        System.out.print("Enter the anual interest > ");
        InterestRate = sc.nextInt();
        System.out.println("");

        System.out.print("Enter the number of payments > ");
        num_payments = sc.nextInt();
        System.out.println("");

        i = InterestRate / 12;
        n = num_payments;
        p = Principle;

        FileWriter fw = new FileWriter("output.txt");
        while (num_payments > 0) {
            PaymentAmount = (i * p) / (1 - Math.pow((1 + i), -n));
            p = (p - PaymentAmount + ((i / 100) * p));
            n = n - 1;
            fw.write("Number of Payments: " + num_payments + "\n");
            fw.write("Amount per payment: " + PaymentAmount + "\n\n");
            num_payments = num_payments - 1;
        }
        fw.close();
        sc.close();
    }
}
