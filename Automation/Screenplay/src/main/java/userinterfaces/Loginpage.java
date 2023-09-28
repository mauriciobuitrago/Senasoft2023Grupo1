package userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class Loginpage {

    public static final Target TXT_EMAIL = Target.the("insert email")
            .locatedBy("//*[@id='username']");
}
