import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("================================");
        int i = 0;
        while (i < 3){
            String line = scanner.nextLine();
            String[] arrLine = line.split(" ");
            String space = "               ";
            String alpha = arrLine[0];
            String num = arrLine[1];
            int numInt = Integer.parseInt(num);
            String result = null;
            if (alpha.length() < 11 && numInt < 1000) {
                if (num.length() == 1) {
                    num = "00" + num;
                }
                if (num.length() == 2) {
                    num = "0" + num;
                }
                space = space.replace(space, alpha + space.substring(alpha.length()));
                result = String.format(space + num);
            }
            System.out.println(result);
            i++;
        }
        System.out.println("================================");
        scanner.close();
    }
}
