public class MaxNumber {
    public static void main(String[] args) {
        String gender = "male";
        int age = 18;
        if (gender.equals("male")) {
            if (age <= 14) {
                System.out.println("male puple");
            } else {
                System.out.println("male student");
            }
        } else {
            if (age < 16) {
                System.out.println("female puple");
            } else {
                System.out.println("female student");
            }
        }
    }
//        int age = 65;
//        if (age > 18) {
//            System.out.println("adult");
//        }
//        else if (age < 18) {
//            System.out.println("Child");
//        }
//        else {
//            System.out.println("Is 18");
//        }
//    }


//        if (a > b && a > c) {
//            System.out.println(a);
//        } else if (b > c) {
//            System.out.println(b);
//        } else {
//            System.out.println(c);
//        }
//        if (a>b && a>c){
//            System.out.println("maxNumber:" + a);
//        }
//        if (b>a && b>c){
//            System.out.println("maxNumber:" + b);
//        }
//        if (c>a && c>b){
//            System.out.println("maxNumber:" + c);
//        }
//        else{
//            System.out.println("some numbers are equale");
//        }
}
}
