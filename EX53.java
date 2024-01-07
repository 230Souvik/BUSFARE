
package ex53;
import java.util.Scanner;
public class EX53 {

    public static void main(String[] args) {
           Scanner scanner = new Scanner(System.in);

        String s = scanner.next();
        String d = scanner.next();

        s = s.toUpperCase();
        d = d.toUpperCase();

        String[] arrs = {"TH", "GA", "IC", "HA", "TE", "LU", "NI", "CA"};
        float[] arr = {800, 600, 750, 900, 1400, 1200, 1100, 1500};
        float res = 0;
        int st = 0, ed = 0;

        for (int i = 0; i < 8; i++) {
            if (s.equals(arrs[i]))
                st = i;

            if (d.equals(arrs[i]))
                ed = i;
        }

        if (st == ed) {
            System.out.println("INVALID INPUT");
            return;
        } else {
            int i = st + 1;
            System.out.print(i);

            while (i != ed + 1) {
                res += arr[i % 8];
                i = (i + 1) % 8;
            }

            System.out.println("FARE IS"+(int) Math.ceil(res * 0.005));
        }
    }
    
}
