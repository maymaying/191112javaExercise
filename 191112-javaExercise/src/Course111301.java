import java.util.Scanner;

public class Course111301 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            System.out.println((n*m)/result(n,m));
        }
    }

    private static int result(int a, int b) {
        int t;
        while(b!=0) {
            t=b;
            b=a%b;
            a=t;
        }
        return a;
    }
}