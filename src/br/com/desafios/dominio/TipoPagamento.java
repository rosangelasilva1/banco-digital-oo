package br.com.desafios.dominio;

public enum TipoPagamento {
     AGUA(1),
     LUZ(2),
     TELEFONE(3),
     CARTAO_DE_CREDITO(4);

     private  int tipo;

    TipoPagamento(int tipo){
        this.tipo = tipo;
    }

    public int getTipoPagamento(){
        return this.tipo;
    }
}
