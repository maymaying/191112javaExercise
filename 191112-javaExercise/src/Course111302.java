import java.util.Scanner;

public class Course111302 {
    public static void main(String []args) {
        Scanner scan=new Scanner(System.in);
        int w,h,r;
        //System.out.println("请输入行：");
        h=scan.nextInt();
        //System.out.println("请输入列：");
        w=scan.nextInt();
        if(h%4==0||w%4==0) {
            r=(w*h)/2;
        }else {
            r=(w*h)/2+1;
        }
        System.out.println(r);
    }

}