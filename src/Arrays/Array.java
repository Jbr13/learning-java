package Arrays;

import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        double[] notasAlunoA = new double[3];
        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 7.9;
        notasAlunoA[2] = 7.9;

        double[] notasAlunoB = {10, 10, 10};

        System.out.println(Arrays.toString(notasAlunoA));
        System.out.println(Arrays.toString(notasAlunoB));
    }

}
