//exercício "leilão" da prova, comentadinho.
import java.util.Scanner;

public class Ex_Leilao {
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {

        //declaração das variáveis.
        int i = 0;
        int numlances = 0;
        String nomeVencedor = null;
        int valorVencedor = 0;
        String nome = null;
        int valor = 0;

        //chamada do método que lê o número de lances.
        numlances = lerNumlances(numlances);

        //enquanto "i" for menor que o número de lances, vão ser chamados os métodos que leêm o nome de quem deu o lance e o valor do lance. Ex: Se o número de lances for 2, na primeira repeticao "i" vai ser 0 e na segunda "i" vai ser 1, quando for passar pela terceira, o laço se encerra, pois "i" vai ser 2, (que não é menor que 2) no final, perguntando ao usuario o nome e o valor do lance 2 vezes.
        while (i < numlances) {
            nome = lerNome(nome);
            valor = lerValor(valor);

            //chamada do método que verifica o nome do vencedor, verificando se o valor inserido é maior q o valorVencedor, se sim, o nome de quem inseriu esse valor será o nome do vencedor.
            nomeVencedor = verificarNomeVencedor(valor, nome, valorVencedor, nomeVencedor);

            //chamada do método que verifica o valorVencedor, verificando se o valor inserido é maior q o valorVencedor, se sim, o valor inserido é o valorVencedor.
            valorVencedor = verificarValorVencedor(valor, valorVencedor);

            i++;
        }

        //chamada do método que imprime o nome do vencedor e o valor.
        imprimir(nomeVencedor, valorVencedor);
    }

    //método que lê o número de lances.
    public static int lerNumlances(int numLances){

        numLances = LER.nextInt();

        return numLances;
    }

    //método que lê o nome do indivíduo.
    public static String lerNome(String nome){

        nome = LER.next();

        return nome;
    }

    //método que lê o valor que um indivíduo lançou.
    public static int lerValor(int valor){

        valor = LER.nextInt();

        return valor;
    }

    //método que verifica o nomeVencedor como explicado acima.
    public static String verificarNomeVencedor(int valor, String nome, int valorVencedor, String nomeVencedor){
        
        if (valor > valorVencedor) {
            nomeVencedor = nome;
        }

        return nomeVencedor;
    }

    //método que verifica o valorVencedor como explicado acima.
    public static int verificarValorVencedor(int valor, int valorVencedor){
        
        if (valor > valorVencedor) {
            valorVencedor = valor;
        }

        return valorVencedor;
    }

    //método que imprime o nome do Vencedor e o valor que o vencedor lançou.
    public static void imprimir(String nomeVencedor, int valorVencedor){
        System.out.println(nomeVencedor);
        System.out.println(valorVencedor);
    }
}
