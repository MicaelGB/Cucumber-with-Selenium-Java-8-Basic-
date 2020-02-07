package Steps;

import cucumber.api.java8.En;

public class Java8VersionStop implements En {
    public Java8VersionStop() {
        And("^I just need to see how steps looks for Cucumber-Java(\\d+)$", (Integer arg0) -> {
            System.out.println("The value from new step class is: " + arg0);
        });
    }
}
