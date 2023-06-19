import java.util.Scanner;

public class Ex_Divisao_da_Nlogonia{
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args){

        int i = 0;
        int k = 0;
        int n = 0;
        int m = 0;
        int x = 0;
        int y = 0;
        String territorio = null;

        while (true) {
            k = lerK(k);
            if (k == 0) {
                break;
            }

            n = lerN(n);
            m = lerM(m);

            for (i = 0; i < k; i++) {
                if (k == 0) {
                    break;
                }

                x = lerX(x);
                y = lerY(y);

                territorio = verificarTerritorio(x, y, n, m);
                imprimirDivisao(territorio);
            }
        }
    }

    public static int lerK(int k){
        do {
            k = LER.nextInt();
        } while (k < 0 || k >= 1000);

        return k;
    }

    public static int lerN(int n){
        do {
            n = LER.nextInt();
        } while (n <= -10000 || n >= 10000);

        return n;
    }

    public static int lerM(int m){
        do {
            m = LER.nextInt();
        } while (m <= -10000 || m >= 10000);

        return m;
    }

    public static int lerX(int x){
        do {
            x = LER.nextInt();
        } while (x <= -10000 || x >= 10000);

        return x;
    }

    public static int lerY(int y){
        do {
            y = LER.nextInt();
        } while (y <= -10000 || y >= 10000);

        return y;
    }

    public static String verificarTerritorio(int x, int y, int n, int m){
        
        String territorio = null;

        if (x == n || y == m) {
            territorio = "divisa";
        } else if (x > n && y > m) {
            territorio = "NE";
        } else if (x > n && y < m) {
            territorio = "SE";
        } else if (x < n && y > m) {
            territorio = "NO";
        } else {
            territorio = "SO";
        }

        return territorio;
    }

    public static void imprimirDivisao(String territorio){
        System.out.println(territorio);
    }
}
