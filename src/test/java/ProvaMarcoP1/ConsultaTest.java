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

    @Test
    void deveRetornarTipoReceita() {
        Receita receita = createMock(Receita.class);
        expect(receita.getTipo()).andReturn("Amarela");
        replay(receita);

        assertEquals("Amarela", receita.getTipo());
    }

    @Test
    void deveRetornarPaciente() {
        Paciente paciente = createMock(Paciente.class);
        expect(paciente.getNome()).andReturn("Henrique");
        replay(paciente);

        assertEquals("Henrique", paciente.getNome());
    }

    @Test
    void deveRetornarMedico() {
        Medico medico = createMock(Medico.class);
        expect(medico.getNome()).andReturn("Pedro");
        replay(medico);

        assertEquals("Pedro", medico.getNome());
    }

    @Test
    void deveRetornarCrmMedico() {
        Medico medico = createMock(Medico.class);
        expect(medico.getNome()).andReturn("123");
        replay(medico);

        assertEquals("123", medico.getNome());
    }

}
