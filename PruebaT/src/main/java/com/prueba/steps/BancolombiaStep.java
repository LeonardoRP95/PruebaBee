package com.prueba.steps;

import net.thucydides.core.annotations.Step;
import com.prueba.pageObject.BancolombiaObject;
import com.prueba.utils.Utilidades;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class BancolombiaStep {
    BancolombiaObject bancolombiaObject;
    Utilidades utilidades;

    @Step
    public void abrirWeb() {
        bancolombiaObject.open();
    }
    @Step
    public void seleccionarOpcionCorporativos() throws InterruptedException {
        bancolombiaObject.getDriver().findElement(bancolombiaObject.getBtnCorporativos()).click();
    }
    public void seleccionarOpcionCapitalInteligente() throws InterruptedException {
        bancolombiaObject.getDriver().findElement(bancolombiaObject.getBtnCapitalInteligente()).click();
    }
    public void seleccionarOpcionActualidadEconomica() throws Exception {
        utilidades.jumpPage(bancolombiaObject.getDriver(),1);
        bancolombiaObject.getDriver().findElement(bancolombiaObject.getBtnActualidadEconomica()).click();
        for (int i=0;i<=12;i++) {
            utilidades.scrollElemento(bancolombiaObject.getDriver(), bancolombiaObject.getBtnVerMas());
            bancolombiaObject.getDriver().findElement(bancolombiaObject.getBtnVerMas()).click();
        }
        utilidades.scrollElemento(bancolombiaObject.getDriver(), bancolombiaObject.getTxtSeccion());
        bancolombiaObject.getDriver().findElement(bancolombiaObject.getTxtSeccion()).click();
        Thread.sleep(2000);
    }
    public void seleccionarElreporte() throws InterruptedException {
        bancolombiaObject.getDriver().findElement(bancolombiaObject.getImgDescarga()).click();
    }
    public void validoElReporte() throws Exception {

    }
}
