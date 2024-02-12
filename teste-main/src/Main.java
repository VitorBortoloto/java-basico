import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

        menuBanco();

    }

    public static void menuBanco() {

        System.out.println("Bem vindo ao aplicativo do " + Banco.nome);
        System.out.println("");

        try {

        int escolhaMenu = 4;

            while (escolhaMenu <= 0 || escolhaMenu > 3) {

                System.out.println("============ Menu ============");
                System.out.println("");
                System.out.println("1- Abrir Conta");
                System.out.println("2- Consultar dados da conta");
                System.out.println("3- Realizar operacoes");
                System.out.println("");
                System.out.println("==============================");
                
                Scanner scanner = new Scanner(System.in);
                escolhaMenu = scanner.nextInt();                  
                
                if(escolhaMenu == 1) {

                    menuConta();            

                } else if(escolhaMenu == 2) {

                    System.out.println("Digite o numero da sua conta para continuar: ");
                    scanner = new Scanner(System.in);
                    int numeroConta = scanner.nextInt();
                    int auxiliar = numeroConta - 1;
                    Conta conta = Conta.listaContas.get(auxiliar);
                    conta.verConta();
                    System.out.println("");

                } else if(escolhaMenu == 3) {

                    menuOperacoes();

                } else {
                    System.out.println("Valor incorreto. Escolha uma das opções abaixo: ");
                    System.out.println("");
                }
            }
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("Valor incorreto. Escolha uma das opcoes do menu: ");
            System.out.println("");
            menuBanco();
        } catch (InputMismatchException e) {
            System.out.println("O valor deve ser numerico. Escolha uma das opcoes do menu: ");
            System.out.println("");
            menuBanco();
        }
    }

    public static void menuConta() {
        
        try {
        int escolhaMenu = 0;

        while (escolhaMenu <= 0 || escolhaMenu > 2) {

            System.out.println("============ Menu Conta ============");
            System.out.println("");
            System.out.println("1- Abrir Conta Corrente");
            System.out.println("2- Abrir Conta Poupanca");
            System.out.println("");
            System.out.println("====================================");

            Scanner scanner = new Scanner(System.in);
            escolhaMenu = scanner.nextInt();

            if (escolhaMenu == 1) {
                ContaCorrente novaConta = new ContaCorrente();   
                Conta.listaContas.add(novaConta);
                System.out.println("");
                System.out.println("Conta criada com sucesso!");
                System.out.println("");
                novaConta.verConta(); 
                System.out.println(""); 
                System.out.println(Conta.listaContas);
                System.out.println(""); 
                menuBanco();        
            } else if (escolhaMenu == 2) {
                Conta novaConta = new ContaPoupanca();
                Conta.listaContas.add(novaConta);
                System.out.println("");
                System.out.println("Conta criada com sucesso!");
                System.out.println("");
                novaConta.verConta();
                System.out.println(""); 
                System.out.println(Conta.listaContas);
                System.out.println(""); 
                menuBanco();
            } else {
                System.out.println("Valor incorreto. Escolha uma das opcoes do menu: ");
                System.out.println("");
                menuConta();
            }
        }
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("Valor incorreto. Escolha uma das opcoes do menu: ");
            System.out.println("");
            menuConta();
        }
        catch (InputMismatchException e) {
            System.out.println("O valor deve ser numerico. Escolha uma das opcoes do menu: ");
            System.out.println("");
            menuConta();
        }
    }

    public static void menuOperacoes() {

        int escolhaMenu = 0;

        try {

            System.out.println("Digite o numero da sua conta para continuar: ");
            Scanner scanner = new Scanner(System.in);
            int numeroConta = scanner.nextInt();
            int quantidadeContas = (Conta.listaContas).size();
            int auxiliar = numeroConta - 1;
            Conta conta = Conta.listaContas.get(auxiliar);
            System.out.println("");
            System.out.println(conta);
            System.out.println("");

            if (conta.numero <= quantidadeContas) {

                while (escolhaMenu <= 0 || escolhaMenu > 4) {

                    System.out.println("============ Menu de Operacoes ============");
                    System.out.println("");
                    System.out.println("1- Sacar");
                    System.out.println("2- Depositar");
                    System.out.println("3- Transferir");
                    System.out.println("4- Voltar");
                    System.out.println("");
                    System.out.println("===========================================");

                    scanner = new Scanner(System.in);
                    escolhaMenu = scanner.nextInt();                  
                
                    if(escolhaMenu == 1) {

                        System.out.println("Digite o valor do saque para continuar: ");
                        scanner = new Scanner(System.in);
                        double valorSaque = scanner.nextDouble();
                        conta.sacar(valorSaque);
                        System.out.println("Saque efetuado com sucesso!");
                        System.out.println("Novo saldo da conta: " + conta.saldo);
                        menuOperacoes();

                    } else if(escolhaMenu == 2) {

                        System.out.println("Digite o valor do deposito para continuar: ");
                        scanner = new Scanner(System.in);
                        double valorDeposito = scanner.nextDouble();
                        conta.depositar(valorDeposito);
                        System.out.println("Deposito efetuado com sucesso!");
                        System.out.println("Novo saldo da conta: " + conta.saldo);
                        menuOperacoes();

                    } else if(escolhaMenu == 3) {

                        System.out.println("Digite o valor da transferencia para continuar: ");
                        scanner = new Scanner(System.in);
                        double valorTransferencia = scanner.nextDouble();
                        System.out.println("Digite o numero da conta para a qual deseja transferir o dinheiro: ");
                        scanner = new Scanner(System.in);
                        numeroConta = scanner.nextInt()-1;
                        Conta contaDestino = Conta.listaContas.get(numeroConta);

                        if (contaDestino.numero <= quantidadeContas) {
                            conta.transferir(valorTransferencia, contaDestino);
                            System.out.println("Deposito efetuado com sucesso!");
                            System.out.println("Novo saldo da conta: " + conta.saldo);   
                        } else { while (contaDestino.numero > quantidadeContas) {
                            System.out.println("O numero da conta destino esta incorreto. Digite um numero valido para continuar: ");
                            scanner = new Scanner(System.in);
                            numeroConta = scanner.nextInt();

                            contaDestino = Conta.listaContas.get(auxiliar);  
                            }
                            menuOperacoes();
                        }

                    } else if (escolhaMenu == 4) {
                        menuBanco();
                    }
                }
            } 
            
                if (conta.numero >= quantidadeContas) {

                    while (conta.numero >= quantidadeContas) {
                        menuOperacoes();
                    }
                }           

        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("Valor incorreto. Escolha uma das opcoes do menu! ");
            System.out.println("");
            menuOperacoes();
        } catch (InputMismatchException e) {
            System.out.println("O valor deve ser numerico!");
            System.out.println("");
            menuOperacoes();
        }
    }

}
