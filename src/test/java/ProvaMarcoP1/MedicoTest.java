package ProvaMarcoP1;

import org.junit.jupiter.api.Test;

import static org.easymock.EasyMock.*;
import static org.easymock.EasyMock.replay;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import static org.easymock.EasyMock.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedicoTest {
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
