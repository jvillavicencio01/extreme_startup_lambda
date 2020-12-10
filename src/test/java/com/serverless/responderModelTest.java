package com.serverless;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class responderModelTest {

    @Test
    public void  cuandoPreguntanPorElNombreRespondeCarlos(){
        ResponderModel responder = new ResponderModel();
        String pregunta = "f5d48e90: what is your name";
        String respuesta = responder.answer(pregunta);
        assertThat(respuesta).isEqualTo("Equipo1");


    }

}
