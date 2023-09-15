import java.util.Scanner;

public class crew {
    public static void main(String[] args) {
        int n;
        int sum = 0;
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Sayı Giriniz: ");
            n = scan.nextInt();
            if (n % 4 == 0) {
                sum += n;
            }
        } while (n % 2 != 1);
        System.out.println("Toplamda:" + sum);
    }
}
