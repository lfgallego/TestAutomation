package co.com.test.utils;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.awt.*;
import java.awt.event.KeyEvent;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class UtilDestino implements Task {
    Robot robot = new Robot();

    public UtilDestino() throws AWTException {
    }

    public static UtilDestino utilDestino() {
        return instrumented(UtilDestino.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        robot.keyPress(KeyEvent.VK_B);
        robot.keyPress(KeyEvent.VK_O);
        robot.keyPress(KeyEvent.VK_G);
    }
}
