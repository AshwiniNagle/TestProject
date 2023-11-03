package com.RunnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src\\test\\resources\\F02PracticeTestLogin.feature"},glue = {"com.StepDef"})

public class R02PracticeTestLogin {
	
}
