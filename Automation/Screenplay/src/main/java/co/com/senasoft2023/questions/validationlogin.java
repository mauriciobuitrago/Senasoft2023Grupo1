package co.com.senasoft2023.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Visibility;
import userinterfaces.Loginpage;

public class validationlogin implements Question<Boolean> {


    @Override
    public Boolean answeredBy(Actor actor) {
        return Visibility.of(Loginpage.LBL_GREET).viewedBy(actor).asBoolean();
    }

    public static validationlogin compare() {
        return new validationlogin();
    }
}
