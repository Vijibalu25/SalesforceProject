package runner;

import base.BaseClassSalesforce;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"./src/test/java/features/TC01_LoginSFApp.feature"},
                 glue= {"pages"},
                 publish=true,
                 monochrome=true		 )
public class CucumberRunner extends BaseClassSalesforce {

}
