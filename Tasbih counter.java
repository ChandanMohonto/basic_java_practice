import java.util.Scanner;
public class Tasbih_cunter {
    public static void main(String[] args) {
        int counter = 1;
        System.out.println("Press Enter key for count Tasbih ");
        while (true) {
            Scanner takeinput = new Scanner(System.in);
            String enterkey = takeinput.nextLine();
            if (enterkey.equals("0")) {
                break;
            } else if (enterkey.equals("")) {
                System.out.print(counter++);
            }
        }
    }
}