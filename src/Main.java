import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Cliente cliente = new Cliente();
        ContaTerminal conta = new ContaTerminal();

        System.out.println("Por favor, insira o número da sua conta bancária: ");
        conta.setNumero(in.nextInt());

        System.out.println("Por favor, insira a sua agência: ");
        conta.setAgencia(in.next());

        System.out.println("Por favor, insira o seu nome: ");
        cliente.setNome(in.next());
        conta.setCliente(cliente);

        System.out.println("Por favor, insira o saldo da sua conta: ");
        conta.setSaldo(new BigDecimal(in.nextDouble()));



        System.out.println(conta);



    }

}
