package br.com.desafios.dominio;

public class Pagamento {

    private TipoPagamento tipoPagamento;
    private double valor;

    public Pagamento(TipoPagamento tipo, double valor) {
        this.tipoPagamento = tipo;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }




}
