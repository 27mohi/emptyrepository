package Skeleton;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty","html:src/cucumber-reports"},features="src/test/resources/Skeleton/FeatureCaseStudy.feature",monochrome=true,dryRun = false)
public class RunCucumber {


}
