package min;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
       while (true) {
            Scanner scanner = new Scanner(System.in);
            float s1;
            System.out.println("Введите любое значение");
            s1 = scanner.nextFloat();
            if (s1 > 7) {
                System.out.println("Привет\r\n");
            } else
                System.out.println(); //ну ничего страшного))
        }
    }
