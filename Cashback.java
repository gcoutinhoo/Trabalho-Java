import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	
	Scanner leitor = new Scanner(System.in);
	Double cinco = 1.05, sete = 1.07, dez = 1.10;
	
	System.out.println("Digite seu nome: ");
	String nome = leitor.nextLine();
	
	System.out.println("Digite sua idade: ");
	int idade = leitor.nextInt();
	
	System.out.println("Digite o valor da compra: R$");
	double compra = leitor.nextDouble();
	
	leitor.close();
	
	double cashback5 = ( compra / 100 ) * cinco;
	double cashback7 = ( compra / 100 ) * sete;
	double cashback10 = ( compra / 100 ) * dez;
	
    if(idade >= 21 && compra < 1000){
        System.out.println("Cliente: " + nome + "\nIdade: " + idade + "Anos" "\nCashback: R$" + );
    } else if (idade < 21 && compra < 1000) {
        System.out.println("Cliente: " + nome + "\nIdade: " + idade + "\nCashback: R$" + cashback7);
    } else if (idade >= 21 && compra > 1000) {
        System.out.println("Cliente: " + nome + "\nIdade: " + idade + "\nCashback: R$" + cashback7);
    } else if (idade < 21 && compra > 1000) {
        System.out.println("Cliente: " + nome + "\nIdade: " + idade + "\nCashback: R$" + cashback10);
    }
	
	}
}
