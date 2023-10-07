
package model;

import java.sql.Date;
import java.sql.Time;

/**
 *
 * @author Misael Modesto
 */
 public class Model_Vendas {
    private static Model_Vendas instance;
    private int pk_id_venda;
    private Date ven_data;
    private Time ven_hora;
    private Double ven_valor_Bruto;
    private Double ven_valor_Liquido;
    private String ven_desconto;
    private String ven_formpagamento;
    private int fk_operador;
    private int fk_aluno; 
    private Double desconto;
    
    
    public Model_Vendas() {
        // Construtor privado para evitar instâncias múltiplas
    }
    
    /**
    public static synchronized Model_Vendas getInstance() {
        if (instance == null) {
            instance = new Model_Vendas();
        }
        return instance;
    }*/

    public int getPk_id_venda() {
        return pk_id_venda;
    }

    public void setPk_id_venda(int pk_id_venda) {
        this.pk_id_venda = pk_id_venda;
    }

    public Date getVen_data() {
        return ven_data;
    }

    public void setVen_data(Date ven_data) {
        this.ven_data = ven_data;
    }

    public Time getVen_hora() {
        return ven_hora;
    }

    public void setVen_hora(Time ven_hora) {
        this.ven_hora = ven_hora;
    }

    public Double getVen_valor_Bruto() {
        return ven_valor_Bruto;
    }

    public void setVen_valor_Bruto(Double ven_valor_Bruto) {
        this.ven_valor_Bruto = ven_valor_Bruto;
    }

    public Double getVen_valor_Liquido() {
        return ven_valor_Liquido;
    }

    public void setVen_valor_Liquido(Double ven_valor_Liquido) {
        this.ven_valor_Liquido = ven_valor_Liquido;
    }

    public String getVen_desconto() {
        return ven_desconto;
    }

    public void setVen_desconto(String ven_desconto) {
        this.ven_desconto = ven_desconto;
    }

    public int getFk_operador() {
        return fk_operador;
    }

    public void setFk_operador(int fk_operador) {
        this.fk_operador = fk_operador;
    }

    public int getFk_aluno() {
        return fk_aluno;
    }

    public void setFk_aluno(int fk_aluno) {
        this.fk_aluno = fk_aluno;
    }

    public Double getDesconto() {
        return desconto;
    }

    public void setDesconto(Double desconto) {
        this.desconto = desconto;
    }

    public String getVen_formpagamento() {
        return ven_formpagamento;
    }

    public void setVen_formpagamento(String ven_formpagamento) {
        this.ven_formpagamento = ven_formpagamento;
    }

    
}
