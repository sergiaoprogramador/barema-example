package Models;

public class Barema {
    
    private int id;
    private String atividade;
    private String horas;
    private String limite;
    private String grupo;
    
    public Barema (int id, String atividade, String horas, String limite, String grupo) {
        this.id = id;
        this.atividade = atividade;
        this.horas = horas;
        this.limite = limite;
        this.grupo = grupo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAtividade() {
        return atividade;
    }

    public void setAtividade(String atividade) {
        this.atividade = atividade;
    }

    public String getHoras() {
        return horas;
    }

    public void setHoras(String horas) {
        this.horas = horas;
    }

    public String getLimite() {
        return limite;
    }

    public void setLimite(String limite) {
        this.limite = limite;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }
    
    
}