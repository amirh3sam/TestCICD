package company.stepDef;

import io.cucumber.java.en.Given;
import org.junit.Assert;

public class CICD {


    @Given("say hello CICD")
    public void say_hello_cicd() {
        System.out.println("Hello CI/CD");
        Assert.assertEquals(2,2);
    }

}
