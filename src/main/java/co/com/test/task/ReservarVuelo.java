package co.com.test.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.test.userinterface.PaginaVueloUI.*;
import static co.com.test.utils.UtilDesde.utilDesde;
import static co.com.test.utils.UtilDestino.utilDestino;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ReservarVuelo implements Task {


    public static ReservarVuelo reservarVuelo() {
        return instrumented(ReservarVuelo.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(DESDE),
                utilDesde(),
                Click.on(SELECT_DESDE),
                Click.on(DESTINO),
                utilDestino(),
                Click.on(SELECT_DESTINO),
                Click.on(SELECT_FECHA_SAL),
                Click.on(FECHA_SALIDA),
                Click.on(FECHA_LLEGADA),
                Click.on(SELECT_PASAJEROS),
                Click.on(SELECT_ADULTOS),
                Click.on(SELECT_NINOS),
                Click.on(BTN_CONTINUAR),
                Click.on(BTN_BUSCAR_V),
                WaitUntil.the(LBL_MEJOR_PRECIO, isVisible()).forNoMoreThan(120).seconds(),
                Click.on(LBL_MEJOR_PRECIO)
        );
    }
}
