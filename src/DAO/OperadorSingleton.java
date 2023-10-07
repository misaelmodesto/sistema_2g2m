
package DAO;

/**
 *
 * @author Misael Modesto
 */
public class OperadorSingleton {
    private static OperadorSingleton instance;
    private String nome; 
    private String perfil;
    private int pk_id_operador;
    private String unidade;
    
    private OperadorSingleton() {
        // Construtor privado para evitar instâncias múltiplas
    }
    
    public static synchronized OperadorSingleton getInstance() {
        if (instance == null) {
            instance = new OperadorSingleton();
        }
        return instance;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPerfil() {
        return perfil;
    }

    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    public int getPk_id_operador() {
        return pk_id_operador;
    }

    public void setPk_id_operador(int pk_id_operador) {
        this.pk_id_operador = pk_id_operador;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }
    
    
    
}
