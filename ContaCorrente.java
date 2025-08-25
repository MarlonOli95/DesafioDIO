public class ContaCorrente extends Conta {
    
    private static int SEQUENCIAL = 1;

    public ContaCorrente(){
        super.agencia = Conta.AGENCIA_PADRAO;
        super.numero = SEQUENCIAL++;
    }
    
    public void imprimirExrtato(){
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
    }
}
