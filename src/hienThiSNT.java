public class hienThiSNT {
    public static void main(String[] args) {
        int coint = 0;
        for (int i = 2; i > 0; i++) {
            boolean check = true;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                coint++;
                System.out.println(i);
            }
            if (coint == 20) {
                break;
            }
        }
    }
}
