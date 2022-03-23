package br.com.desafios.dominio;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }
    public void Pagamento(Pagamento pagamento){
        super.saldo -= pagamento.getValor();
    }
    @Override
    public void imprimirExtrato() {
        System.out.println("-----Extrato Conta Corrente-----");
        super.ImprimirInformacoesComuns();
    }
}
