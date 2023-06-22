//exercício "feedback" da prova, comentadinho.
import java.util.Scanner;

public class Ex_Feedback {
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {

        //declaração das variáveis.
        int i = 0;
        int j = 0;
        int diasDeTrabalho = 0;
        int numFeedbacks = 0;
        int feedback = 0;
        String empregado = null;

        //chamada do método que lê o número de dias que foram recebidos feedbacks.
        diasDeTrabalho = lerDiasDeTrabalho(diasDeTrabalho);

        //toda vez que "i" for menor doq os dias de trabalho, vai entrar no laço de repetição.
        for (i = 0; i < diasDeTrabalho; i++) {

            //método q lê o número de feedbacks que foram recebidos no dia.
            numFeedbacks = lerNumFeedbacks(numFeedbacks);

            //toda vez que "j" for menor doq o número de feedbacks, vai entrar no laço de repetição.
            for (j = 0; j < numFeedbacks; j++) {

                //método q lê os feedbacks que foram recebidos no dia.
                feedback = lerFeedback(feedback);
                
                //método que verifica qual empregado responde determinado feedback por meio de if's e else if's. Se o feedback for igual a 1 o empregado q irá atender é o Rolien e assim por diante.
                empregado = verificarEmpregado(feedback);

                //método q imprime o nome dos empregados responsáveis por responder cada feedback.
                imprimirFeedback(empregado);
            }
        }
    }

    //método que lê o número de dias que foram recebidos feedbacks, mas permitindo somente a entrada de valores maiores que 1 e menores que 100.
    public static int lerDiasDeTrabalho(int diasDeTrabalho) {

        do {
            diasDeTrabalho = LER.nextInt();
        } while (diasDeTrabalho < 1 || diasDeTrabalho > 100);

        return diasDeTrabalho;
    }

    //método q lê o número de feedbacks que foram recebidos no dia, mas permitindo somente a entrada de valores maiores que 1 e menores que 50.
    public static int lerNumFeedbacks(int numFeedbacks) {

        do {
            numFeedbacks = LER.nextInt();
        } while (numFeedbacks < 1 || numFeedbacks > 50);

        return numFeedbacks;
    }

    //método q lê os feedbacks que foram recebidos no dia.
    public static int lerFeedback(int feedback) {
        feedback = LER.nextInt();
        
        return feedback;
    }

    //método que verifica qual empregado responde determinado feedback por meio de if's e else if's, como explicado acima.
    public static String verificarEmpregado(int feedback) {
        String empregado = null;

        if (feedback == 1) {
            empregado = "Rolien";
        } else if (feedback == 2) {
            empregado = "Naej";
        } else if (feedback == 3) {
            empregado = "Elehcim";
        } else if (feedback == 4) {
            empregado = "Odranoel";
        }

        return empregado;
    }

    //método q imprime o nome dos empregados responsáveis por responder cada feedback.
    public static void imprimirFeedback(String empregado) {
        System.out.println(empregado);
    }
}
