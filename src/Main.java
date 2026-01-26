import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Задание 1 и 2

        System.out.println("Задание 1 и 2");

        int one [] = new int [3];
        one [0] = 1;
        one [1] = 2;
        one [2] = 3;
        System.out.println(one[0]);
        System.out.println(one[1]);
        System.out.println(one[2]);

        double [] two = {1.57, 7.654, 9.986};
        two [0] = 1.57;
        for (int i = 0; i < 3; i++) {
            System.out.println(two[i]);
        }

        int [] three = {12, 15, 8, 466, 45 };
        for (int index = 0; index < three.length; index++) {
            if (index == three.length - 1) {
                System.out.println(three[index]);
                break;
            }
            System.out.println(three[index]);
        }

        // Задание 3

        System.out.println("Задание 3");

        int [] four = {12, 15, 8, 466, 45};
        for (int i = four.length - 1; i >= 0; i--) {
            System.out.println(four[i]);
            if (i > 0) {
                System.out.println(", ");
            }
        }

        // я не понимаю что за проблема, делаю всё по урокам и материалу из интернета, меняю только название, а ниичего не работает

        // Задание 4

        System.out.println("Задание 4");
        int [] five = {1, 2, 3};

        for (int index = 0; index < five.length; index++) {
            if (index == five.length - 1) {
                System.out.println(four[index]);
                break;
            }
            System.out.println(Arrays.toString(five));
        }
    }
}