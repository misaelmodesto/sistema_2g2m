package model;

/**
 *
 * @author Misael Modesto
 */
public class Model_Produtos {
    private int idproduto;
    private String proNome;
    private String proDescricao;
    private double proValor;

    public int getIdproduto() {
        return idproduto;
    }

    public void setIdproduto(int idproduto) {
        this.idproduto = idproduto;
    }

    public String getProNome() {
        return proNome;
    }

    public void setProNome(String proNome) {
        this.proNome = proNome;
    }

    public String getProDescricao() {
        return proDescricao;
    }

    public void setProDescricao(String proDescricao) {
        this.proDescricao = proDescricao;
    }

    public double getProValor() {
        return proValor;
    }

    public void setProValor(double proValor) {
        this.proValor = proValor;
    }
}
