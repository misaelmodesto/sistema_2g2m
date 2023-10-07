package model;

import java.sql.Timestamp;

/**
 *
 * @author Misael Modesto
 */
public class Model_Caixa {
    private int pk_id_caixa;
    private Timestamp cx_abertura_times;
    private Timestamp cx_fechamento_times;
    private int fk_id_operador;
    private double cx_valorAbertura;
    private String cx_refeicao;

    public int getPk_id_caixa() {
        return pk_id_caixa;
    }

    public void setPk_id_caixa(int pk_id_caixa) {
        this.pk_id_caixa = pk_id_caixa;
    }

    public Timestamp getCx_abertura_times() {
        return cx_abertura_times;
    }

    public void setCx_abertura_times(Timestamp cx_abertura_times) {
        this.cx_abertura_times = cx_abertura_times;
    }

    public Timestamp getCx_fechamento_times() {
        return cx_fechamento_times;
    }

    public void setCx_fechamento_times(Timestamp cx_fechamento_times) {
        this.cx_fechamento_times = cx_fechamento_times;
    }

    public int getFk_id_operador() {
        return fk_id_operador;
    }

    public void setFk_id_operador(int fk_id_operador) {
        this.fk_id_operador = fk_id_operador;
    }

    public double getCx_valorAbertura() {
        return cx_valorAbertura;
    }

    public void setCx_valorAbertura(double cx_valorAbertura) {
        this.cx_valorAbertura = cx_valorAbertura;
    }

    public String getCx_refeicao() {
        return cx_refeicao;
    }

    public void setCx_refeicao(String cx_refeicao) {
        this.cx_refeicao = cx_refeicao;
    }

   
}
