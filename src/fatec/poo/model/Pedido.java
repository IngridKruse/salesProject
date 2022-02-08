/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author Matheus
 */
public class Pedido {
    private int Numero;
    private String dataEmissaoPedido;
    private String dataPagto;
    private boolean status;
    
    private Cliente cliente;
    private Vendedor vendedor;
    private ArrayList<ItemPedido> itensPedido;

    public Pedido(int Numero, String dataEmissaoPedido) {
        this.Numero = Numero;
        this.dataEmissaoPedido = dataEmissaoPedido;
    }

    public String getDataPagto() {
        return dataPagto;
    }

    public void setDataPagto(String dataPagto) {
        this.dataPagto = dataPagto;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getNumero() {
        return Numero;
    }

    public String getDataEmissaoPedido() {
        return dataEmissaoPedido;
    }
    
    public void setCliente(Cliente cliente){
        this.cliente = cliente;
    }
    
    public void setVendedor(Vendedor vendedor){
        this.vendedor = vendedor;
    }
    
    public void addItemPedido(ItemPedido itemPedido){
        boolean aceito = cliente.subLimite(itemPedido.calcValorItemPedido());
        if(aceito){
            itensPedido.add(itemPedido);
            itemPedido.setPedido(this);
        }else{
            System.out.println("\nErro: Cliente não possui crédito disponível.\n");
        }
    }
}
