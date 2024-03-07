
public class ex02 {
    public static void main(String[] args) {
        int numeroVerificar = 21; 

        
        System.out.println("Sequência de Fibonacci até o valor " + numeroVerificar + ":");
        exibirSequenciaFibonacci(numeroVerificar);

        
        if (verificarPertencimentoFibonacci(numeroVerificar)) {
            System.out.println(numeroVerificar + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numeroVerificar + " não pertence à sequência de Fibonacci.");
        }
    }

   
    public static void exibirSequenciaFibonacci(int limite) {
        int anterior = 0, atual = 1;

        while (atual <= limite) {
            System.out.print(anterior + " ");
            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;
        }

        System.out.println(); 
    }

    public static boolean verificarPertencimentoFibonacci(int numero) {
        int anterior = 0, atual = 1;

        while (atual < numero) {
            int proximo = anterior + atual;
            anterior = atual;
            atual = proximo;

            if (atual == numero) {
                return true;
            }
        }

        return false;
    }
}

