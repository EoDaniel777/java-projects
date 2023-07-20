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

        //CRIANDO AGENCIA, CONTA E SALDO
        
        Random rand = new Random();
        
        //int conta = rand.nextInt(999999) + 1;
        //int agencia = rand.nextInt(9999) + 1;
        int numAgencia = rand.nextInt(9999);
        int digitoAgencia = rand.nextInt(9);

        String agencia = String.format("%03d-%d", numAgencia, digitoAgencia);
        //"%03d-%d" usado para formatar o numero de uma agencia real


        int numConta1 = rand.nextInt(9999);
        int numConta2 = rand.nextInt(9999);
        int digitoConta = rand.nextInt(99);

        String conta = String.format("%03d.%03d-%d",numConta1, numConta2, digitoConta);
        //"%03d.%03d-%d" usado para formatar o numero no formato de uma conta real

        double saldo = rand.nextDouble() * 99999;
        
        String saldoFormatado = String.format("R$ %.2f", saldo).replace('.', ',');
        //"R$ %.2f" usado para formatar o numero no formato em  reais

        //EXIBIR A MENSAGEM DE CONTA CRIADA

        System.out.println("Conta criada com sucesso!");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("RG: " + rg);
        System.out.println("Agência: " + agencia);
        System.out.println("Conta: " + conta);
        System.out.println("Saldo: " + saldoFormatado);
        System.out.println("Olá " + nome + ", Obrigado por criar uma conta em nosso banco!");
        //System.out.println("sua agência é " + agencia);
        //System.out.println("sua conta é " + conta);
        System.out.println("seu saldo " + saldoFormatado + " já está disponível para saque!");
    }
}
