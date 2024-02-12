public abstract class Conta {

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected static final int AGENCIA_PADRAO = 1;

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void sacar(double valor) {

        saldo = saldo - valor;

    }

    public void depositar(double valor) {

        saldo = saldo + valor;

    }

    public void transferir(double valor, Conta contaDestino) {

        this.sacar(valor);
        contaDestino.depositar(valor);

    }

    protected void consultarExtrato() {
        System.out.println(String.format("Agencia: %d", agencia));
        System.out.println(String.format("Numero: %d", numero));
        System.out.println(String.format("Saldo: %.2f", saldo));
    }

}
