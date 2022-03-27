public class MinNumber {
    public static void minNumberPrint(int a, int b, int c){
        if (a<b && a<c){
            System.out.println("minNumber:" + a);
        }
        if (b<a && b<c){
            System.out.println("minNumber:" + b);
        }
        if (c<a && c<b){
            System.out.println("minNumber:" + c);
        }
        else{
            System.out.println("some numbers are equale");
        }
    }
}
