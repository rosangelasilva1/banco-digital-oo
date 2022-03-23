import br.com.desafios.dominio.*;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Maria da Silva");

        //Conta Corrente
        ContaCorrente cc = new ContaCorrente(cliente);
        cc.depositar(1500);
        Pagamento pagamento1 = new Pagamento(TipoPagamento.AGUA,52.44);
        Pagamento pagamento2 = new Pagamento(TipoPagamento.LUZ, 142.44);
        Pagamento pagamento3 = new Pagamento(TipoPagamento.TELEFONE,42.14);
        Pagamento pagamento4 = new Pagamento(TipoPagamento.CARTAO_DE_CREDITO,342.14);
        cc.Pagamento(pagamento1);
        cc.Pagamento(pagamento2);
        cc.Pagamento(pagamento3);
        cc.Pagamento(pagamento4);

        //Conta Poupança
        Conta cp = new ContaPoupanca(cliente);
        cc.transferir(500,cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}

