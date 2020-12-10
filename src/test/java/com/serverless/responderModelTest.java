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
    @Test
    public void  cuandoPreguntanPorElNumeroMasAltoDeCuatroResponde262144(){
        ResponderModel responder = new ResponderModel();
        String pregunta = "15cffd30: which of the following numbers is the largest: 4, 255, 837, 262144";
        String respuesta = responder.answer(pregunta);
        assertThat(respuesta).isEqualTo("262144");
    }
    @Test
    public void  cuandoPreguntanPorLaMultiplicacionDeDosValoresResponder20(){
        ResponderModel responder = new ResponderModel();
        String pregunta = "f2802ca0: what is 2 multiplied by 10";
        String respuesta = responder.answer(pregunta);
        assertThat(respuesta).isEqualTo("20");
    }
}
