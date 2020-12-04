import java.util.Scanner;

class Main {
    int rev_num(int num) {
        int r, sum = 0;

        while (num > 0) {
            r = num % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        
        return r
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int rev;
        int n = sc.nextInt();
        int rev = rev_num(n);
        int sum = n + rev;
        int sum_rev = rev_num(sum);
        
        if (sum_rev == sum)
            System.out.println("palindromic number ");
        else
            System.out.println("not palindromic");
    }
}
