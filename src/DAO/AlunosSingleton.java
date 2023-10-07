package DAO;

/**
 *
 * @author Suporte
 */
public class AlunosSingleton {
    private static AlunosSingleton instance;
    private String nome; 
    private String perfil;
    private int pk_id_Aluno;
    
        private AlunosSingleton() {
        // Construtor privado para evitar instâncias múltiplas
    }
    public static synchronized AlunosSingleton getInstance() {
        if (instance == null) {
            instance = new AlunosSingleton();
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

    public int getPk_id_Aluno() {
        return pk_id_Aluno;
    }

    public void setPk_id_Aluno(int pk_id_Aluno) {
        this.pk_id_Aluno = pk_id_Aluno;
    }
}
