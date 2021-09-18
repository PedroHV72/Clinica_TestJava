package ProvaMarcoP1;

import java.util.ArrayList;
import java.util.List;

public class Consulta {

    private Medico medico;
    private Receita receita;
    private Paciente paciente;

    public Consulta(Medico medico, Paciente paciente) {
        this.medico = medico;
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        if (medico == null) {
            throw new NullPointerException("Médico é obrigatório");
        }
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        if (paciente == null) {
            throw new NullPointerException("Paciente é obrigatório");
        }
        this.paciente = paciente;
    }

    public Receita getReceita() {
        return receita;
    }

    public void setReceita(Receita receita) {
        this.receita = receita;
    }

    public String getTipoReceita() {
        if (this.receita == null) {
            return "Consulta sem receita";
        }
        return this.receita.getTipo();
    }

}
