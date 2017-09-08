package com.test.calc.activities.testSuite;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.test.suitebuilder.annotation.LargeTest;

import com.test.calc.activities.Splash;
import com.test.calc.activities.testAutomation.Steps;

import org.junit.FixMethodOrder;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;


@LargeTest
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(AndroidJUnit4.class)
public class AcceptanceTests_WonkyCalculatorApp {

    @Rule
    public ActivityTestRule<Splash> mActivityTestRule = new ActivityTestRule<>(Splash.class);

    @Test
    public void Test_001_AddAndSubtract() {

        Steps.verifyApplicationIsRunning();
        Steps.verifyResultString("Result:");
        Steps.clickAddButton();
        Steps.verifyResultString("Result: 1");
        Steps.clickAddButton();
        Steps.verifyResultString("Result: 2");
        Steps.clickSubtractButton();
        Steps.verifyResultString("Result: 1");
        Steps.clickSubtractButton();
        Steps.verifyResultString("Result: 0");

    }

    @Test
    public void Test_002_ClickAllButtons() {

        Steps.verifyApplicationIsRunning();
        Steps.verifyResultString("Result:");
        Steps.clickAddButton();
        Steps.verifyResultString("Result: 1");
        Steps.clickSubtractButton();
        Steps.verifyResultString("Result: 0");
        Steps.clickSquareRootButton();
        Steps.verifyResultString("Result: 0");
        Steps.clickDivideBy2Button();
        Steps.verifyResultString("Result: 0");
        Steps.clickMultiplyBy2Button();
        Steps.verifyResultString("Result: 0");
        Steps.clickPowerBy2Button();
        Steps.verifyResultString("Result: 0");

    }

    @Test
    public void Test_003_VerifyIfResultCanBeNegative() {

        Steps.verifyApplicationIsRunning();
        Steps.verifyResultString("Result:");
        Steps.clickAddButton();
        Steps.verifyResultString("Result: 1");
        Steps.clickSubtractButton();
        Steps.verifyResultString("Result: 0");
        Steps.clickSubtractButton();
        Steps.verifyResultString("Result: -1");

    }

    @Test
    public void Test_004_VerifyIfSquareRootOfNegativeValueReturnsNaN() {

        Steps.verifyApplicationIsRunning();
        Steps.verifyResultString("Result:");
        Steps.clickSubtractButton();
        Steps.verifyResultString("Result: -1");
        Steps.clickSquareRootButton();
        Steps.verifyResultString("Result: NaN");

    }

    @Test
    public void Test_005_VerifyIfPowerBy2ReturnsSquaredValue() {

        Steps.verifyApplicationIsRunning();
        Steps.verifyResultString("Result:");
        Steps.clickAddButton();
        Steps.verifyResultString("Result: 1");
        Steps.clickPowerBy2Button();
        Steps.verifyResultString("Result: 1");
        Steps.clickAddButton();
        Steps.verifyResultString("Result: 2");
        Steps.clickPowerBy2Button();
        Steps.verifyResultString("Result: 4");

    }

}
