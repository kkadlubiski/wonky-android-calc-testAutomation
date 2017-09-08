package com.test.calc.activities.testAutomation;

import android.support.test.espresso.ViewInteraction;
import android.widget.TextView;

import com.test.calc.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

public class Steps {


    public static void clickAddButton(){

        ViewInteraction button = onView(
                allOf(withId(IDs.add_Button), withText("ADD"), isDisplayed()));
        button.perform(click());
        System.out.println("ADD button clicked.");

    }

    public static void clickSubtractButton(){

        ViewInteraction button = onView(
                allOf(withId(IDs.subtract_Button), withText("SUBTRACT"), isDisplayed()));
        button.perform(click());
        System.out.println("SUBTRACT button clicked.");

    }

    public static void clickSquareRootButton(){

        ViewInteraction button = onView(
                allOf(withId(IDs.squareRoot_Button), withText("SQUARE ROOT"), isDisplayed()));
        button.perform(click());
        System.out.println("SQUARE ROOT button clicked.");

    }

    public static void clickDivideBy2Button(){

        ViewInteraction button = onView(
                allOf(withId(IDs.divideBy2_Button), withText("DIVIDE by 2"), isDisplayed()));
        button.perform(click());
        System.out.println("DIVIDE by 2 button clicked.");

    }

    public static void clickMultiplyBy2Button(){

        ViewInteraction button = onView(
                allOf(withId(IDs.multiplyBy2_Button), withText("MULTIPLY by 2"), isDisplayed()));
        button.perform(click());
        System.out.println("MULTIPLY by 2 button clicked.");

    }

    public static void clickPowerBy2Button(){

        ViewInteraction button = onView(
                allOf(withId(IDs.powerBy2_Button), withText("POWER by 2"), isDisplayed()));
        button.perform(click());
        System.out.println("POWER by 2 button clicked.");

    }

    public static void verifyResultString(String expectedResultString){

        ViewInteraction textView = onView(allOf(withId(IDs.result_TextView), isDisplayed()));
        textView.check(matches(withText(expectedResultString)));

    }

    public static void verifyApplicationIsRunning(){

        ViewInteraction textView = onView(allOf(withId(IDs.title_TextView), isDisplayed()));
        textView.check(matches(withText("Wonky calculator app")));

    }

}
