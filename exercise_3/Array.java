
package min.idea;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 5-ть элементов массива");
        int myarray[] = new int[5]; //массив на 5-ть элементов
        for (int i = 0; i < myarray.length; i++) {
            myarray[i] = in.nextInt();// заполняем массив
        }
        System.out.println("Значения в массиве:");
        for (int i=0;i < myarray.length; i++){
            System.out.print(myarray[i]+ " ");// Выводим массив на экран
        }
        int num = 0;
        for (int i=0 ; i< myarray.length; i++){
            if(myarray[i]%3==0){  // находим нечетные элементы
                num++;
            }
        }
        System.out.println("\nКоличество элементов кратных 3 составляет:"+num);
    }
}


