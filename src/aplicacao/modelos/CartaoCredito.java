package aplicacao.modelos;

import java.util.ArrayList;
import java.util.List;

public class CartaoCredito {
    private double limite;
    private double saldo;
    private List<Compra> compras;

    public CartaoCredito(double limite) {
        this.limite = limite;
        this.saldo = limite;
        this.compras = new ArrayList<>();
    }

    public double getLimite() {
        return limite;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compra> getListaCompras() {
        return compras;
    }

    public boolean registrarCompra(Compra produto){

        if(saldo < produto.getValor()){
            return false;
        }else{
            saldo -= produto.getValor();
            compras.add(produto);
        }
        return true;
    }
}
