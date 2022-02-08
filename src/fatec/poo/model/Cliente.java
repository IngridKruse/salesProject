
package fatec.poo.model;

import java.util.ArrayList;

/**
 *
 * @author Fábio Tofoli
 */
public class Cliente extends Pessoa{
    private double limiteCred;
    private double limiteDisp;
    private ArrayList<Pedido> pedidos;
    
    //Construtor

    public Cliente(String cpf, String nome, double limiteCred) {
        super(cpf, nome);
        this.limiteCred = limiteCred;
        limiteDisp = limiteCred;
    }

    public void addPedido(Pedido p){
        pedidos.add(p);
        p.setCliente(this);
    }
    
    public double getLimiteCred() {
        return limiteCred;
    }

    public double getLimiteDisp() {
        return limiteDisp;
    }
    
    public boolean subLimite(double valorCompra){
        if(limiteDisp>=valorCompra){
            limiteDisp-=valorCompra;
            return true;//aceito
        }
        return false;
    }
}
