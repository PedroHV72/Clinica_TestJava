package ProvaMarcoP1;

import java.util.ArrayList;
import java.util.List;

public class Receita {
    private String tipo;
    private List<Medicamento> MedicamentoList;

    public Receita(String tipo) {
        this.tipo = tipo;
    }

    public Receita(List<Medicamento> medicamentoList) {
        MedicamentoList = medicamentoList;
    }

    public String getTipo() {
        if (this.tipo == null) {
            throw new NullPointerException("Tipo da receita é obrigatório");
        }
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo == null) {
            throw new NullPointerException("Tipo da receita é obrigatório");
        }
        this.tipo = tipo;
    }

    public List<Medicamento> getMedicamentoList() {
        return MedicamentoList;
    }

    public void adicionarMedicamento(Medicamento medicamento) {
        this.MedicamentoList.add(medicamento);
    }

    public void setMedicamentoList(List<Medicamento> medicamentoList) {
        MedicamentoList = medicamentoList;
    }

    public List<String> getTodosNomesMedicamentos() {
        List<String> receitas = new ArrayList<String>();

        for (Medicamento medicamento : this.MedicamentoList) {
            if (!medicamento.getMedicamentoReceita().equals("Medicamento não receitado")) {
                receitas.add(medicamento.getMedicamentoReceita());
            }
        }
        return receitas;
    }

    public void setMedicamentoList(Medicamento medicamento1, Medicamento medicamento2) {
    }
}
