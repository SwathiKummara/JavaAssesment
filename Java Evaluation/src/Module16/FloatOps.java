package Module16;

public class FloatOps {
    public static void main(String[] args) {
        float n1 = 10.89f;
        float n2 = 7.43f;
        float n3;

        n3 = n1*n2;

        System.out.println(n3);

        double[] Array = {1.8,2.543,3.098,4.9087,6.7896};
        double sum = 0;
        for (int i=0; i< Array.length;i++) {
            sum += Array[i];
        }
        double avg = sum/ Array.length;
        System.out.format("%.2f", avg);
    }
}
