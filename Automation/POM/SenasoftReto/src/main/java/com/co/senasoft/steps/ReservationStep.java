package com.co.senasoft.steps;

import com.co.senasoft.pageobjects.ReservationPage;
import net.thucydides.core.annotations.Step;

public class ReservationStep {

    ReservationPage reservationPage = new ReservationPage();


    @Step("user opens stays page")
    public void openStaysPage() {
        reservationPage.open();
    }

    @Step
    public void enterInformation() {
        reservationPage.getDriver().findElement(reservationPage.getTXT_WHERE_WE_GO())
                .sendKeys("Pereira");
        reservationPage.getDriver().findElement(reservationPage.getBTN_DATE())
                .click();
        reservationPage.getDriver().findElement(reservationPage.getBTN_CHECK_IN())
                .click();
        reservationPage.getDriver().findElement(reservationPage.getBTN_CHECK_OUT())
                .click();
        reservationPage.getDriver().findElement(reservationPage.getBTN_OCCUPANCY())
                .click();
        reservationPage.getDriver().findElement(reservationPage.getBTN_MORE_ADULTS())
                .click();

    }
}
