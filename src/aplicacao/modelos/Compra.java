package aplicacao.modelos;

import java.util.ArrayList;

public class Compra implements Comparable<Compra>{
    private String descricao;
    private double valor;

    public Compra(String descricao, double valor){
        this.descricao = descricao;
        this.valor = valor;
    }
    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Compra: " + getDescricao() + " - " + getValor();
    }

    @Override
    public int compareTo(Compra compra) {
        return Double.compare(this.valor, compra.getValor());
    }
}
