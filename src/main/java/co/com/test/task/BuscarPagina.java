package co.com.test.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.test.userinterface.PaginainicailUI.*;
import static co.com.test.utils.PressESCutil.pressESCUtil;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BuscarPagina implements Task {

    private String pagina;

    public BuscarPagina(String pagina) {
        this.pagina = pagina;
    }

    public static BuscarPagina buscarPagina(String pagina) {
        return instrumented(BuscarPagina.class, pagina);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Enter.theValue(pagina).into(LBL_BUSCAR),
                pressESCUtil(),
                Click.on(BTN_BUSCAR),
                Click.on(TXT_PAGINA));

    }
}