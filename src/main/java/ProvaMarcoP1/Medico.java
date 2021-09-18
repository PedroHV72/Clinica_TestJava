package ProvaMarcoP1;

public class Medico extends Pessoa{

    private String CRM;

    public Medico (String nome) {
        super(nome);
    }

    public String getCRM() {
        return CRM;
    }

    public void setCRM(String CRM) {
        this.CRM = CRM;
    }
}
