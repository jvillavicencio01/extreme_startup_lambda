package com.serverless;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class responderModelTest {

    @Test
    public void  cuandoPreguntanPorElNombreRespondeEquipo1(){
        ResponderModel responder = new ResponderModel();
        String pregunta = "f5d48e90: what is your name";
        String respuesta = responder.answer(pregunta);
        assertThat(respuesta).isEqualTo("Equipo1");


    }
    @Test
    public void  cuandoPreguntanPorElNumeroMasAltoResponde107(){
        ResponderModel responder = new ResponderModel();
        String pregunta = "d131fef0: which of the following numbers is the largest: 107, 16";
        String respuesta = responder.answer(pregunta);
        assertThat(respuesta).isEqualTo("107");
    }
    @Test
    public void  cuandoPreguntanporLaSumaDeDosValoresResponde(){
        ResponderModel responder = new ResponderModel();
        String pregunta ="d7ba3e20: what is 8 plus 1";
        String respuesta = responder.answer(pregunta);
        assertThat(respuesta).isEqualTo("9");
    }

}
