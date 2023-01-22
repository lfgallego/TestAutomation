package co.com.test.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.NamedUrl;
import net.thucydides.core.annotations.NamedUrls;


@NamedUrls({
        @NamedUrl(name = "open.inconcert", url = "http://{1}"),
})
public class PaginainicailUI extends PageObject {
    public static final Target LBL_BUSCAR =
            Target.the("LEBEL BUSCAR")
                    .locatedBy(
                            "//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[1]/div[2]/input[1]");
    public static final Target BTN_BUSCAR =
            Target.the("BOTON BUSCAR")
                    .locatedBy(
                            "//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[4]/center[1]/input[1]");
    public static final Target TXT_PAGINA =
            Target.the("PAGINA BUCADA")
                    .locatedBy(
                            "//h3[contains(text(),'Avianca | Encuentra vuelos y tiquetes baratos | We')]");

}
