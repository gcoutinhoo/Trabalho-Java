import java.util.Random;
import java.util.Scanner;

public class RandomNum {
    public static void main(String[] args) {
        Random randomizacao = new Random();
        Scanner leitor = new Scanner(System.in);
        
        int random = randomizacao.nextInt(100);
        int num = -1; 
        boolean acertou = false;
        
        System.out.println("Tente adivinhar o número entre 0 e 99!");
        
        
        while (!acertou) {
            System.out.print("Escolha um número de 0 à 99: ");
            num = leitor.nextInt();
            
            if (num == random) {
                System.out.println("Parabéns! \nVocê acertou o número!");
                acertou = true; 
            } else if (num < random) {
                System.out.println("Tente mais pra cima!");
            } else {
                System.out.println("Tente mais baixo!");
            }
        }
        
        leitor.close();
    }
}
