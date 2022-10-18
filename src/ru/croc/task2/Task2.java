import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        long v;
        Scanner in = new Scanner(System.in);
        v = in.nextLong();
        System.out.println(printBytes(v));

    }

    public static String printBytes(long inBytes) {
        int unitNumber = 0;
        float res = inBytes;
        String[] units = new String[] {"B","KB","MB","GB","TB","PB","EB"};
        while (res >= 1024) {
            res /= 1024;
            unitNumber++;
        }
        return inBytes + " B -> " + String.format("%.1f",res) + " " + units[unitNumber];
    }
}
