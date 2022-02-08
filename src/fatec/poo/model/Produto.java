package fatec.poo.model;

/**
 *
 * @author Ingrid Kruse
 */
public class Produto {
    private int codigo;
    private String descricao;
    private int qtdeDisponivel;
    private double precoUnit;
    private int estoqueMin;
    
    public Produto(int cod, String desc){
        this.codigo = cod;
        this.descricao = desc;
    }

    public int getQtdeDisponivel() {
        return qtdeDisponivel;
    }

    public boolean setQtdeDisponivel(int qtdeDisponivel) {
        if(qtdeDisponivel >= 0){
            this.qtdeDisponivel = qtdeDisponivel;
            return true;
        }
        return false;
    }

    public double getPrecoUnit() {
        return precoUnit;
    }

    public void setPrecoUnit(double precoUnit) {
        this.precoUnit = precoUnit;
    }

    public int getEstoqueMin() {
        return estoqueMin;
    }

    public void setEstoqueMin(int estoqueMin) {
        this.estoqueMin = estoqueMin;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }
}
