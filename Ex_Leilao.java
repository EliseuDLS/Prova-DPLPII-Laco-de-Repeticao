import java.util.Scanner;

public class Ex_Leilao {
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        int i = 0;
        int numlances = 0;
        String nomeVencedor = null;
        int valorVencedor = 0;
        String nome = null;
        int valor = 0;

        numlances = lerNumlances(numlances);

        while (i < numlances) {
            nome = lerNome(nome);
            valor = lerValor(valor);

            nomeVencedor = verificarNomeVencedor(valor, nome, valorVencedor, nomeVencedor);
            valorVencedor = verificarValorVencedor(valor, valorVencedor);

            i++;
        }

        imprimir(nomeVencedor, valorVencedor);
    }

    public static int lerNumlances(int numLances){

        numLances = LER.nextInt();

        return numLances;
    }

    public static String lerNome(String nome){

        nome = LER.next();

        return nome;
    }

    public static int lerValor(int valor){

        valor = LER.nextInt();

        return valor;
    }

    public static String verificarNomeVencedor(int valor, String nome, int valorVencedor, String nomeVencedor){
        
        if (valor > valorVencedor) {
            nomeVencedor = nome;
        }

        return nomeVencedor;
    }

    public static int verificarValorVencedor(int valor, int valorVencedor){
        
        if (valor > valorVencedor) {
            valorVencedor = valor;
        }

        return valorVencedor;
    }

    public static void imprimir(String nomeVencedor, int valorVencedor){
        System.out.println(nomeVencedor);
        System.out.println(valorVencedor);
    }
}
