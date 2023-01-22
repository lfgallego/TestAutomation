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
    public static final Target SELECT_PASAJEROS =
            Target.the("SELECCIONAR PASAJEROS").locatedBy("//body[1]/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/section[1]/div[3]/div[4]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[3]/fieldset[1]/div[1]/div[1]/div[1]/label[1]");
    public static final Target SELECT_ADULTOS =
            Target.the("SELECCIONAR ADULTOS").locatedBy("//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/section[1]/div[3]/div[4]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[3]/fieldset[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[3]/i[1]");
    public static final Target SELECT_NINOS =
            Target.the("SELECCIONAR NIÑOS").locatedBy("//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/section[1]/div[3]/div[4]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[3]/fieldset[1]/div[1]/div[1]/div[2]/div[2]/div[2]/div[3]/i[1]");
    public static final Target BTN_CONTINUAR =
            Target.the("BOTON CONTINUAR").locatedBy("//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/section[1]/div[3]/div[4]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[3]/fieldset[1]/div[1]/div[1]/div[2]/button[1]");
    public static final Target BTN_BUSCAR_V =
            Target.the("BOTON BUSCAR VUELOS").locatedBy("//body/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/section[1]/div[3]/div[4]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/div[3]/fieldset[1]/div[1]/div[4]/button[1]");
    public static final Target LBL_MEJOR_PRECIO =
            Target.the("ETIQUETA MEJOR PRECIO").locatedBy("//body/app-root[1]/main[1]/avail-page[1]/div[1]/div[1]/avail-cont[1]/avail-pres[1]/div[2]/avail-list-pres[1]/div[16]/expander-elem[1]/div[1]/div[1]/div[1]/button[1]/div[1]/new-ribbon-element[1]/div[1]/span[1]");

}
