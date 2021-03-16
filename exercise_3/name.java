//Voskoboyny Pavel
package min.idea;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            while(true) {
                Scanner scn = new Scanner(System.in);
                System.out.println("введите имя:");
                String name = scn.nextLine();
                String name_1= ("Вячеслав");
                if (name.equals(name_1) ) {
                    System.out.println("Привет "+name);
                }
                else {
                    System.out.println("Нет такого имени");
                }
            }
        }
}


