public class ContaPoupanca extends Conta {

    private static int SEQUENCIAL = 1;

    public ContaPoupanca() {
        super.agencia = AGENCIA_PADRAO;
        super.numero = SEQUENCIAL++;
    }

    @Override
    protected void consultarExtrato() {
        System.out.println("=== Extrato da Conta Poupança ===");
        super.consultarExtrato();
    }
}
