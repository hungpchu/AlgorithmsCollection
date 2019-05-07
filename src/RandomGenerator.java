import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

import java.util.Random;

public class RandomGenerator {

    public static void main(String[] args) {
        int N = 5;
        Random random = new Random();
        double lo  = 5.0;
        double hi = 10.0;

        for (int i = 0; i < 10; i++){
            double rand_Double_Num = random.nextDouble();
            int rand_Int_Num = random.nextInt(N);
            double rand_Double_from_Prince = StdRandom.uniform(lo,hi);
            StdOut.printf("Random number from princeton cs is %.2f\n", rand_Double_from_Prince);
            StdOut.printf("Random double number is %.2f\n",rand_Double_Num);
            System.out.println("Random integer is " + rand_Int_Num);
        }



    }
}
