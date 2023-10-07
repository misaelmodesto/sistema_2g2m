package model;
/**
*
* @author Misael Modesto
*/
public class Model_VendaProduto {

    private int pk_id_venda_produto;
    private int fk_produto;
    private int fk_venda;
    private double ven_pro_valor;

    /**
    * Construtor
    */
    public Model_VendaProduto(){}

    /**
    * seta o valor de pk_id_venda_produto
    * @param pPk_id_venda_produto
    */
    public void setPk_id_venda_produto(int pPk_id_venda_produto){
        this.pk_id_venda_produto = pPk_id_venda_produto;
    }
    /**
    * @return pk_pk_id_venda_produto
    */
    public int getPk_id_venda_produto(){
        return this.pk_id_venda_produto;
    }

    /**
    * seta o valor de fk_produto
    * @param pFk_produto
    */
    public void setFk_produto(int pFk_produto){
        this.fk_produto = pFk_produto;
    }
    /**
    * @return fk_fk_produto
    */
    public int getFk_produto(){
        return this.fk_produto;
    }

    /**
    * seta o valor de fk_venda
    * @param pFk_venda
    */
    public void setFk_venda(int pFk_venda){
        this.fk_venda = pFk_venda;
    }
    /**
    * @return fk_fk_venda
    */
    public int getFk_venda(){
        return this.fk_venda;
    }

    /**
    * seta o valor de ven_pro_valor
    * @param pVen_pro_valor
    */
    public void setVen_pro_valor(double pVen_pro_valor){
        this.ven_pro_valor = pVen_pro_valor;
    }
    /**
    * @return fk_ven_pro_valor
    */
    public double getVen_pro_valor(){
        return this.ven_pro_valor;
    }

}