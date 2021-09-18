package ProvaMarcoP1;

import org.junit.jupiter.api.Test;

import static org.easymock.EasyMock.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PacienteTest {
    @Test
    void deveRetornarPaciente() {
        Paciente paciente = createMock(Paciente.class);
        expect(paciente.getNome()).andReturn("Henrique");
        replay(paciente);

        assertEquals("Henrique", paciente.getNome());
    }
}
