package co.com.test.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/co.com.test/features/buscar_pagina.feature",
        glue = "co.com.test.stepdefinitios",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)

public class BusquedaRunner {
}
