package serious;

/**
 * Created by Andrei on 26/01/2016.
 */
public class Exam2 {

    public static void main(String[] args) {
        Exam2 ex = new Exam2();
        System.out.println("resultado: " + ex.solution(12, 34));

    }

    public int solution(int M, int N) {
        int first_bitwise_product = 0;
        int final_bitwise = 0;

        if (M <= N){
            while (M < N){
                first_bitwise_product = bitand(M, ++M);
            }
            final_bitwise = bitand(first_bitwise_product, N);
        }

        return final_bitwise;

    }

    public int bitand (int n1, int n2){
        String bin1 = String.valueOf(checkBinary(n1));
        String bin2 = String.valueOf(checkBinary(n2));
        StringBuilder stringBuilder = new StringBuilder();
        int base = 2;

        char[] value1 = bin1.toCharArray();
        char[] value2 = bin2.toCharArray();

        for (int i = 0, k = 0; i < value1.length; i++, k++){
            stringBuilder.append(verifyAND(value1[i], value2[k]));
        }

        return Integer.parseInt(String.valueOf(stringBuilder), base);

    }

    public int verifyAND(int first, int second) {
        if (first == '1' && second == '1') {
            return 1;
        }
        return 0;
    }

    public String checkBinary(int n){
        return Integer.toBinaryString(n);
    }
}
