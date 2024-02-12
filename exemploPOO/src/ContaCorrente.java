public class ContaCorrente extends Conta {

    private static int SEQUENCIAL = 1;

    public ContaCorrente() {
        super.agencia = AGENCIA_PADRAO;
        super.numero = SEQUENCIAL++;
    }

    @Override
    protected void consultarExtrato() {
        System.out.println("=== Extrato da Conta Corrente ===");
        super.consultarExtrato();
    }

}
