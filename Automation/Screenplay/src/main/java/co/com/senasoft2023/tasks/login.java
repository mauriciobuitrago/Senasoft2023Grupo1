package co.com.senasoft2023.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import userinterfaces.Loginpage;

public class login implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Enter.theValue("amolina97@soy.sena.edu.co").into(Loginpage.TXT_EMAIL),
                Click.on(Loginpage.BTN_LOGIN),
                Enter.theValue("Prueba2023").into(Loginpage.TXT_PASSWORD),
                Click.on(Loginpage.BTN_SUBMIT));


    }

    public static login enter() {
        return Tasks.instrumented(login.class);
    }
}
