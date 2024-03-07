import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite uma string: ");
        String inputString = scanner.nextLine();

       
        String reversedString = inverterString(inputString);

   
        System.out.println("String invertida: " + reversedString);

        scanner.close();
    }

   
    public static String inverterString(String str) {
        char[] caracteres = str.toCharArray();

        int i = 0;
        int j = caracteres.length - 1;

        while (i < j) {
           
            char temp = caracteres[i];
            caracteres[i] = caracteres[j];
            caracteres[j] = temp;
            i++;
            j--;
        }

        
        StringBuilder resultado = new StringBuilder();
        for (char caractere : caracteres) {
            resultado.append(caractere);
        }

        return resultado.toString();
    }
}
