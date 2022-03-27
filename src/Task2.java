public class Task2 {
    public static void main(String[] args) {
        int number = 13;
        if (number > 0) {
            if (number % 2 == 0) {
                number += 3;
            } else {
                number -= 10;
            }
        } else {
            if (number < -10) {
                number *= number;
            } else {
                number /= 2;
            }
        }
        System.out.println(number);
    }
}
