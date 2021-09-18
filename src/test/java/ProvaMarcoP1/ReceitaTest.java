package ProvaMarcoP1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.easymock.EasyMock.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class ReceitaTest {

    @Test
    void deveRetornarTipoReceita() {
        Receita receita = new Receita("Amarela");

        assertEquals("Amarela", receita.getTipo());
    }

    @Test
    void deveRetornarExcecaoTipoReceitaNulo() {
        try {
            Receita receita = new Receita("Branca");
            receita.setTipo(null);
            fail();
        }
        catch (NullPointerException e) {
            assertEquals("Tipo da receita é obrigatório", e.getMessage());
        }
    }

    @Test
    void deveVerificarSeOsMedicamentosForamPreescritosNaReceita() {
        Paciente paciente = new Paciente("Pedro");
        Medico medico = new Medico("Henrique");
        Consulta consulta = new Consulta(medico, paciente);
        Receita receita = new Receita("Branca");
        consulta.setReceita(receita);
        Medicamento medicamento1 = new Medicamento("Dorflex");
        Medicamento medicamento2 = new Medicamento("Doril");
        List<Medicamento> medicamentos = Arrays.asList(medicamento1, medicamento2);
        receita.setMedicamentoList(medicamentos);

        assertEquals(medicamentos, receita.getMedicamentoList());
    }

}
