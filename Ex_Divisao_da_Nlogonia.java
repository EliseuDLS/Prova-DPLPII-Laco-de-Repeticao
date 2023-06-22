//exercício "divisao de nlogonia" da prova, comentadinho.
import java.util.Scanner;

public class Ex_Divisao_da_Nlogonia {
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {

        //declaração das variáveis.
        int i = 0;
        int k = 0;
        int n = 0;
        int m = 0;
        int x = 0;
        int y = 0;
        String territorio = "";


        //laço de repetição que continua executando indefinidamente até que a condição de saída seja atendida. No início de cada repetição, é chamado um método para ler "k". Se "k" for igual a zero, o loop é quebrado.
        while (true) {
            k = lerK(k);
            if (k == 0) {
                break;
            }

            //os valores de n e m são lidos por meio dos métodos que os leêm.
            n = lerN(n);
            m = lerM(m);

            //um loop for é executado toda vez que "i" é menor que "k". A cada repetição, os valores de x e y são lidos por meio dos métodos que os leêm.
            for (i = 0; i < k; i++) {
                x = lerX(x);
                y = lerY(y);

                //método verificarTerritorio é chamado para determinar o território correspondente com base nos valores de x, y, n e m.
                territorio = verificarTerritorio(x, y, n, m);

                //método imprimirDivisao é chamado para mostrar o território destinado a cada valor inserido.
                imprimirDivisao(territorio);
            }
        }
    }

    //método que lê o valor "k", mas permitindo somente a entrada de valores maiores que 0 e menores ou iguais a 1000.
    public static int lerK(int k) {
        do {
            k = LER.nextInt();
        } while (k < 0 || k >= 1000);

        return k;
    }

    //método que lê o valor "n", mas permitindo somente a entrada de valores maiores que -10000 e menores a 10000.
    public static int lerN(int n) {
        do {
            n = LER.nextInt();
        } while (n < -10000 || n > 10000);

        return n;
    }

    //método que lê o valor "m", mas permitindo somente a entrada de valores maiores que -10000 e menores a 10000.
    public static int lerM(int m) {
        do {
            m = LER.nextInt();
        } while (m < -10000 || m > 10000);

        return m;
    }

    //método que lê o valor "x", mas permitindo somente a entrada de valores maiores que -10000 e menores a 10000.
    public static int lerX(int x) {
        do {
            x = LER.nextInt();
        } while (x < -10000 || x > 10000);

        return x;
    }

    //método que lê o valor "y", mas permitindo somente a entrada de valores maiores que -10000 e menores a 10000.
    public static int lerY(int y) {
        do {
            y = LER.nextInt();
        } while (y < -10000 || y > 10000);

        return y;
    }

    //método verificarTerritorio que determina o território correspondente com base nos valores de x, y, n e m. Se "x" for igual a "n" ou "y" for igual a "m" o território é a divisa e assim por diante.
    public static String verificarTerritorio(int x, int y, int n, int m) {
        String territorio = "";

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

    //método que imprime o território destinado a cada valor inserido.
    public static void imprimirDivisao(String territorio) {
        System.out.println(territorio);
    }
}
