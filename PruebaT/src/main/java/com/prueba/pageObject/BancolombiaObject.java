package com.prueba.pageObject;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.bancolombia.com/personas")

public class BancolombiaObject extends PageObject {
    By btnCorporativos = By.xpath("//*[@id='header-empresas']");
    By btnCapitalInteligente = By.xpath("//*[@class='header-menu_item']/a[contains(text(),'Capital Inteligente')]");
    By btnActualidadEconomica = By.xpath("//*[@title='Actualidad económica']");
    By btnVerMas = By.xpath("//*[@id='verMas']");
    By txtSeccion =By.xpath("//h2/a[contains(text(),'aumentará la oferta de petróleo en julio de 2021')]");
    By imgDescarga = By.xpath("(//*[@class='hidden-xs img-responsive'])[3]");
    By valReporte = By.cssSelector("#plugin");
    By shadow =By.xpath("//*[contains(text(),'Presentación de PowerPoint')]");

    public By getShadow() {
        return shadow;
    }

    public By getValReporte() {
        return valReporte;
    }

    public By getImgDescarga() {
        return imgDescarga;
    }

    public By getTxtSeccion() {
        return txtSeccion;
    }

    public By getBtnVerMas() {
        return btnVerMas;
    }

    public By getBtnCorporativos() {
        return btnCorporativos;
    }

    public By getBtnCapitalInteligente() {
        return btnCapitalInteligente;
    }

    public By getBtnActualidadEconomica() {
        return btnActualidadEconomica;
    }
}
