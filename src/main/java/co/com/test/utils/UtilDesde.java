package co.com.test.utils;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.awt.*;
import java.awt.event.KeyEvent;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class UtilDesde implements Task {
    Robot robot = new Robot();

    public UtilDesde() throws AWTException {
    }

    public static UtilDesde utilDesde() {
        return instrumented(UtilDesde.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        robot.keyPress(KeyEvent.VK_C);
        robot.keyPress(KeyEvent.VK_A);
        robot.keyPress(KeyEvent.VK_L);
    }
}
