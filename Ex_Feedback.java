import java.util.Scanner;

public class Ex_Feedback {
    final static Scanner LER = new Scanner(System.in);
    public static void main(String[] args) {
        
        int diasDeTrabalho = 0;
        int numFeedbacks = 0;
        int feedback = 0;
        String empregado = null;

        diasDeTrabalho = lerDiasDeTrabalho(diasDeTrabalho);

        for (int i = 0; i < diasDeTrabalho; i++) {

            numFeedbacks = lerNumFeedbacks(numFeedbacks);

            for (int j = 0; j < numFeedbacks; j++) {
                feedback = lerFeedback();
                
                empregado = verificarEmpregado(feedback);
                imprimirFeedback(empregado);
            }
        }
    }

    public static int lerDiasDeTrabalho(int diasDeTrabalho) {
        do {
            diasDeTrabalho = LER.nextInt();
        } while (diasDeTrabalho < 1 || diasDeTrabalho > 100);

        return diasDeTrabalho;
    }

    public static int lerNumFeedbacks(int numFeedbacks) {
        do {
            numFeedbacks = LER.nextInt();
        } while (numFeedbacks < 1 || numFeedbacks > 50);

        return numFeedbacks;
    }

    public static int lerFeedback() {
        int feedback = LER.nextInt();
        return feedback;
    }

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

    public static void imprimirFeedback(String empregado) {
        System.out.println(empregado);
    }
}
