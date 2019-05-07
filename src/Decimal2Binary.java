public class Decimal2Binary {

    public static void main(String[] args){

        int N = Integer.parseInt(args[0]);
        String s = "";
        int n ;
        for(n = N; n > 0; n /= 2){
            String s1 = Integer.toString(n % 2);
            s += s1;
        }

        System.out.println("Decimal is "+ N);
        System.out.println("Binary number is " + s);
    }
}
