package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Loginpage {

    public static final Target TXT_EMAIL = Target.the("insert email")
            .locatedBy("//*[@id='username']");
    public static final Target BTN_LOGIN = Target.the("click continue button")
            .locatedBy("//button[@type=\"submit\"]");
    public static final Target TXT_PASSWORD = Target.the("insert password")
            .locatedBy("//input[@type=\"password\"]");
    public static final Target BTN_SUBMIT = Target.the("click submit button")
            .locatedBy("//button[@type=\"submit\"]");
    public static final Target LBL_GREET = Target.the("greeting text")
            .locatedBy("//*[@id=\"indexsearch\"]/div[1]/div/div/div/div/header/h1/span");
}
