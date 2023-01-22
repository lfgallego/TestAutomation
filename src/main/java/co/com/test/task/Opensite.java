package co.com.test.task;

import co.com.test.userinterface.PaginainicailUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class Opensite implements Task {

    PaginainicailUI site = new PaginainicailUI();

    public static Opensite opensite() {
        return Tasks.instrumented(Opensite.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String strUrl = "https:/www.google.com.co";
        site.openUrl(strUrl);
        System.out.println(strUrl);
    }

}
