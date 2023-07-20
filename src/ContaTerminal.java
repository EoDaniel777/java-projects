import java.util.Random;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        //TODO:CONHECER E IMPORTAR A CLASSE SCANNER
        
        Scanner ler = new Scanner (System.in);

        //EXIBIR AS MENSAGENS PARA O USUARIO
        //OBTER PELA CLASSE SCANNER OS VALORES DIGITADOS PELO TERMINAL

        System.out.println("Inisira seu nome completo: ");
        String nome = ler.nextLine();

        System.out.println("Insira seu CPF: ");
        String cpf = ler.nextLine();

        System.out.println("Insira seu RG: ");
        String rg = ler.nextLine();

        //CRIANDO A AGENCIA E A CONTA

        Random rand = new Random(0);
        
        int conta = rand.nextInt(999999) + 1;
        int agencia = rand.nextInt(9999) + 1;

        //EXIBIR A MENSAGEM DE CONTA CRIADA

        System.out.println("Conta criada com sucesso!");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("RG: " + rg);
        System.out.println("Agência: " + agencia);
        System.out.println("Conta: " + conta);

    }
}
