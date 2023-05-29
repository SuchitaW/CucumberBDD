package Runner;



import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features={"src/test/resources/Feature/Features.feature"},          //Path of Feature folder which hold feature file
        glue={"Stepdef","Stepdefination" }, // Path of StepDefinition file
        tags= " @automationCheck", 
       plugin = {"pretty",                      
            "html:target/html/htmlReport.html",
            "json:target/json/jsonReport.json",
       
            },
        monochrome=true,
        publish= true,
        dryRun=false
        )




public class TestRunner {

}
