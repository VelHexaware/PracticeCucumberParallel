package com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources" }, glue = { "com.stepdefinition" }, dryRun = false, plugin = {
		"pretty", "json:src\\test\\resources\\Reports\\cucumber.json" })
public class CucumberTest {

}
