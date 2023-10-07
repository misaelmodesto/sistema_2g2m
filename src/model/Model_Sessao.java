
package model;

import java.sql.Timestamp;

/**
 *
 * @author Misael Modesto
 */
public class Model_Sessao {
    private int pk_id_sessao;
    private int fk_id_operador;
    private Timestamp ses_login_times;
    private Timestamp ses_logout_times;

    public int getPk_id_sessao() {
        return pk_id_sessao;
    }

    public void setPk_id_sessao(int pk_id_sessao) {
        this.pk_id_sessao = pk_id_sessao;
    }

    public int getFk_id_operador() {
        return fk_id_operador;
    }

    public void setFk_id_operador(int fk_id_operador) {
        this.fk_id_operador = fk_id_operador;
    }

    public Timestamp getSes_login_times() {
        return ses_login_times;
    }

    public void setSes_login_times(Timestamp ses_login_times) {
        this.ses_login_times = ses_login_times;
    }

    public Timestamp getSes_logout_times() {
        return ses_logout_times;
    }

    public void setSes_logout_times(Timestamp ses_logout_times) {
        this.ses_logout_times = ses_logout_times;
    }
    
    
    
}
