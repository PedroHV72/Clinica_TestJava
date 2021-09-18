package ProvaMarcoP1;

public class Medicamento {

    private Receita receita;
    private String nome;

    public Medicamento(String nome) {
    }

    public Receita getReceita() {
        return receita;
    }

    public String getMedicamentoReceita() {
        if (this.receita == null) {
            return "Medicamento não receitado";
        }
        return this.receita.getTipo();
    }

    public void setReceita(Receita receita) {
        this.receita = receita;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
