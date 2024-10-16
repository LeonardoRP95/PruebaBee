package com.prueba.stepDefinitions;

import com.prueba.steps.BancolombiaStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import net.thucydides.core.annotations.Steps;

public class PruebasStepDefinition {
    @Steps
    BancolombiaStep bancolombiaStep;

    @Given("^navego en la aplicación$")
    public void navegoEnLaAplicacion() throws InterruptedException {
        bancolombiaStep.abrirWeb();
    }

    @When("^ingreso a corporativos$")
    public void ingresoACorporativos() throws InterruptedException {
        bancolombiaStep.seleccionarOpcionCorporativos();
    }
    @When("^ingreso a capital inteligente$")
    public void ingresoACapitalInteligente() throws InterruptedException {
        bancolombiaStep.seleccionarOpcionCapitalInteligente();
    }

    @When("^ingreso a actualidad economica$")
    public void ingresoAActualidadEconomica() throws Exception {
        bancolombiaStep.seleccionarOpcionActualidadEconomica();
    }

    @When("^selecciono el reporte OPEP y lo descargo$")
    public void seleccionoElReporteOPEPYLoDescargo() throws InterruptedException {
        bancolombiaStep.seleccionarElreporte();
    }

    @Then("^valido que el informe generado en pdf sea el correcto$")
    public void validoQueElInformeGeneradoEnPdfSeaElCorrecto() throws Exception {
        bancolombiaStep.validoElReporte();
    }

}