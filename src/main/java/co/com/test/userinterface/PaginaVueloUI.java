package co.com.test.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class PaginaVueloUI extends PageObject {

    public static final Target DESDE =
            Target.the("DESDE").locatedBy("//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/section[1]/div[3]/div[4]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/fieldset[1]/div[1]/div[1]/div[1]/div[1]/label[1]");
    public static final Target INPUT_DESDE =
            Target.the("INPUT_DESDE").locatedBy("//*[contains(@'pbOrigen_')]");

    public static final Target DESTINO =
            Target.the("DESTINO")
                    .locatedBy(
                            "//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/section[1]/div[3]/div[4]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/fieldset[1]/div[1]/div[2]/div[2]/div[1]/label[1]");
    public static final Target SELECT_DESDE =
            Target.the("SELECCIONAR DESDE")
                    .locatedBy(
                            "//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/section[1]/div[3]/div[4]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/fieldset[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]");
    public static final Target SELECT_DESTINO =
            Target.the("SELECCIONAR DESTINO")
                    .locatedBy(
                            "//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/section[1]/div[3]/div[4]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[1]/fieldset[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/li[1]");
    public static final Target SELECT_FECHA_SAL =
            Target.the("SELECCIONAR FECHA DE SALIDA").locatedBy("//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/section[1]/div[3]/div[4]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[2]/fieldset[1]/div[1]/div[1]/div[1]/label[1]");
    public static final Target FECHA_SALIDA =
            Target.the("FECHA DE SALIDA").locatedBy("//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/section[1]/div[3]/div[4]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[2]/fieldset[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[29]");
    public static final Target FECHA_LLEGADA =
            Target.the("SELECCIONAR FECHA DE SALIDA").locatedBy("//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/section[1]/div[3]/div[4]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[2]/fieldset[1]/div[1]/div[1]/div[3]/div[1]/div[1]/div[3]/div[3]/div[33]");

}
