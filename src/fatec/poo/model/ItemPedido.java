/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

/**
 *
 * @author Matheus
 */
public class ItemPedido {
    private int numeroItem;
    private int qtdeVendida;
    
    private Produto produto;
    private Pedido pedido;

    public ItemPedido(int numeroItem, int qtdeVendida) {
        this.numeroItem = numeroItem;
        this.qtdeVendida = qtdeVendida;
    }

    public int getQtdeVendida() {
        return qtdeVendida;
    }

    public void setQtdeVendida(int qtdeVendida) {
        this.qtdeVendida = qtdeVendida;
    }

    public int getNumeroItem() {
        return numeroItem;
    }
    
    public void setProduto(Produto produto){
        this.produto = produto;
        boolean ok = produto.setQtdeDisponivel(produto.getQtdeDisponivel() - qtdeVendida);
        if(!ok){
            System.out.println("\nErro: Quantidade Indisponível em estoque\n");
        }
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }
    
    public double calcValorItemPedido(){
        return produto.getPrecoUnit() * qtdeVendida;
    }
}
