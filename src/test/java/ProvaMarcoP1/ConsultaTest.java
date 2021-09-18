package ProvaMarcoP1;

import org.junit.jupiter.api.Test;

import static org.easymock.EasyMock.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class ConsultaTest {

    @Test
    void deveRetornarNomeMedicoConsulta() {
        Medico medico = new Medico("Pedro");
        Paciente paciente = new Paciente("Henrique");
        Consulta consulta = new Consulta(medico, paciente);

        assertEquals("Pedro", consulta.getMedico().getNome());
    }

    @Test
    void deveRetornarExcecaoMedicoNulo() {
        try {
            Medico medico = new Medico("Pedro");
            Paciente paciente = new Paciente("Henrique");
            Consulta consulta = new Consulta(medico, paciente);
            consulta.setMedico(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Médico é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetornarNomePacienteConsulta() {
        Medico medico = new Medico("Pedro");
        Paciente paciente = new Paciente("Henrique");
        Consulta consulta = new Consulta(medico, paciente);

        assertEquals("Henrique", consulta.getPaciente().getNome());
    }

    @Test
    void deveRetornarExcecaoPacienteNulo() {
        try {
            Medico medico = new Medico("Pedro");
            Paciente paciente = new Paciente("Henrique");
            Consulta consulta = new Consulta(medico, paciente);
            consulta.setPaciente(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Paciente é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveRetornarTipoReceitaConsulta() {
        Medico medico = new Medico("Pedro");
        Paciente paciente = new Paciente("Henrique");
        Consulta consulta = new Consulta(medico, paciente);
        Receita receita = new Receita("Amarela");
        consulta.setReceita(receita);

        assertEquals("Amarela", consulta.getTipoReceita());
    }

    @Test
    void deveRetornarConsultaSemReceita() {
        Medico medico = new Medico("Pedro");
        Paciente paciente = new Paciente("Henrique");
        Consulta consulta = new Consulta(medico, paciente);

        assertEquals("Consulta sem receita", consulta.getTipoReceita());
    }

}
