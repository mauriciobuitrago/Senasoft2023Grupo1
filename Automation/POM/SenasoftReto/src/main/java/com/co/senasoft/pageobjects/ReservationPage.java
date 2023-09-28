package com.co.senasoft.pageobjects;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://www.booking.com/index.html?label=gen173nr-1FCAEoggI46AdIM1gEaDKIAQGYAQq4ARfIAQzYAQHoAQH4AQ2IAgGoAgO4AtTJ0KgGwAIB0gIkZGJjNDllNTEtNTQ1Yy00ZDc0LTk5MWQtYjFlZGVmYjFlZTFi2AIG4AIB&sid=4db60a59aa261215ea691e12a00585be&aid=304142")
public class ReservationPage extends PageObject {

    By TXT_WHERE_WE_GO = By.xpath("//input[@id = ':re:']");
    By BTN_DATE = By.xpath("//button[@data-testid = 'date-display-field-start']");

    By BTN_CHECK_IN = By.xpath("//span[@data-date = '2023-09-29']");

    By BTN_CHECK_OUT = By.xpath("//span[@data-date = '2023-10-04']");

    By BTN_OCCUPANCY = By.xpath("//button[@data-testid='occupancy-config']");

    By BTN_MORE_ADULTS = By.xpath("(//button[@class='a83ed08757 c21c56c305 f38b6daa18 d691166b09 ab98298258 deab83296e bb803d8689 f4d78af12a'])[1]");
    By BTN_MORE_CHILDREN = By.xpath("(//button[@class='a83ed08757 c21c56c305 f38b6daa18 d691166b09 ab98298258 deab83296e bb803d8689 f4d78af12a'])[2]");
    By BTN_MORE_ROOMS = By.xpath("(//button[@class='a83ed08757 c21c56c305 f38b6daa18 d691166b09 ab98298258 deab83296e bb803d8689 f4d78af12a'])[3]");

    By SLT_AGE_RANGE = By.xpath("//select[@id=':rv:']");
    By SLT_AGE_RANGE_2 = By.xpath("//select[@id=':r10:']");
    By SLT_AGE = By.xpath("//*[@id=\":r11:\"]/option[13]");
    By SLT_AGE_2 = By.xpath("//*[@id=\":r12:\"]/option[13]");

    By BTN_DONE = By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/form/div[1]/div[3]/div/div/div/button");

    By BTN_SEARCH = By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/form/div[1]/div[4]/button");

    public By getTXT_WHERE_WE_GO() {
        return TXT_WHERE_WE_GO;
    }

    public void setTXT_WHERE_WE_GO(By TXT_WHERE_WE_GO) {
        this.TXT_WHERE_WE_GO = TXT_WHERE_WE_GO;
    }

    public By getBTN_DATE() {
        return BTN_DATE;
    }

    public void setBTN_DATE(By BTN_DATE) {
        this.BTN_DATE = BTN_DATE;
    }

    public By getBTN_CHECK_IN() {
        return BTN_CHECK_IN;
    }

    public void setBTN_CHECK_IN(By BTN_CHECK_IN) {
        this.BTN_CHECK_IN = BTN_CHECK_IN;
    }

    public By getBTN_CHECK_OUT() {
        return BTN_CHECK_OUT;
    }

    public void setBTN_CHECK_OUT(By BTN_CHECK_OUT) {
        this.BTN_CHECK_OUT = BTN_CHECK_OUT;
    }

    public By getBTN_OCCUPANCY() {
        return BTN_OCCUPANCY;
    }

    public void setBTN_OCCUPANCY(By BTN_OCCUPANCY) {
        this.BTN_OCCUPANCY = BTN_OCCUPANCY;
    }

    public By getBTN_MORE_ADULTS() {
        return BTN_MORE_ADULTS;
    }

    public void setBTN_MORE_ADULTS(By BTN_MORE_ADULTS) {
        this.BTN_MORE_ADULTS = BTN_MORE_ADULTS;
    }

    public By getBTN_MORE_CHILDREN() {
        return BTN_MORE_CHILDREN;
    }

    public void setBTN_MORE_CHILDREN(By BTN_MORE_CHILDREN) {
        this.BTN_MORE_CHILDREN = BTN_MORE_CHILDREN;
    }

    public By getBTN_MORE_ROOMS() {
        return BTN_MORE_ROOMS;
    }

    public void setBTN_MORE_ROOMS(By BTN_MORE_ROOMS) {
        this.BTN_MORE_ROOMS = BTN_MORE_ROOMS;
    }

    public By getSLT_AGE_RANGE() {
        return SLT_AGE_RANGE;
    }

    public void setSLT_AGE_RANGE(By SLT_AGE_RANGE) {
        this.SLT_AGE_RANGE = SLT_AGE_RANGE;
    }

    public By getSLT_AGE_RANGE_2() {
        return SLT_AGE_RANGE_2;
    }

    public void setSLT_AGE_RANGE_2(By SLT_AGE_RANGE_2) {
        this.SLT_AGE_RANGE_2 = SLT_AGE_RANGE_2;
    }

    public By getSLT_AGE() {
        return SLT_AGE;
    }

    public void setSLT_AGE(By SLT_AGE) {
        this.SLT_AGE = SLT_AGE;
    }

    public By getSLT_AGE_2() {
        return SLT_AGE_2;
    }

    public void setSLT_AGE_2(By SLT_AGE_2) {
        this.SLT_AGE_2 = SLT_AGE_2;
    }

    public By getBTN_DONE() {
        return BTN_DONE;
    }

    public void setBTN_DONE(By BTN_DONE) {
        this.BTN_DONE = BTN_DONE;
    }

    public By getBTN_SEARCH() {
        return BTN_SEARCH;
    }

    public void setBTN_SEARCH(By BTN_SEARCH) {
        this.BTN_SEARCH = BTN_SEARCH;
    }
}
