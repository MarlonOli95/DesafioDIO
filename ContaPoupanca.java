//Entidade é uma classe que possui um papel importante

public class ContaPoupanca extends Conta {
    private static int SEQUENCIAL = 1;

    public ContaPoupanca(){
        super.agencia = Conta.AGENCIA_PADRAO;
        super.numero = SEQUENCIAL++;
    }

    public void imprimirExrtato(){
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();
    }

    
}
