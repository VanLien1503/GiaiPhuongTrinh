import java.util.Scanner;

public class GiaiPhuongTrinh {
    public static void main(String[] args) {
        System.out.println("giải phương trình bậc 1");
        System.out.println("a*x+b=0");
        Scanner scanner=new Scanner(System.in);
        System.out.println("a = ");
        double a=scanner.nextDouble();
        System.out.println("b = ");
        double b= scanner.nextDouble();
        System.out.println("c = ");
        double c = scanner.nextDouble();
        // tìm nghiệm của phương trình khi a!=0
        if (a!=0){
            double solution = -b/a;
            System.out.println("phương trình có nghiệm là : "+solution);
        }else {
            if (b==0){
                System.out.println("The solution is all x!");
            }else {
                System.out.println("No solution");
            }
        }
    }
}
