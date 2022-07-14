package com.base;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"			
				}, 
		glue = { "com.base","com.protonFramework.stepdefs" },
		features = { "src/test/resources/Feature" }
)
public class TestRunner extends AbstractTestNGCucumberTests{

//	@Override
//	@DataProvider(parallel=true)
//    public Object[][] scenarios() {
//       return super.scenarios();
//    }
}

