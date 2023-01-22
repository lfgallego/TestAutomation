package co.com.test.utils;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import java.awt.*;
import java.awt.event.KeyEvent;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class PressESCutil implements Task {
    Robot robot = new Robot();

    public PressESCutil() throws AWTException {
    }

    public static PressESCutil pressESCUtil() {
        return instrumented(PressESCutil.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        robot.keyPress(KeyEvent.VK_ESCAPE);
    }
}

