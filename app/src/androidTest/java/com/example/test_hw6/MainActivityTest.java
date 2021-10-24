package com.example.test_hw6;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import org.junit.Rule;
import org.junit.Test;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

public
class MainActivityTest {

    @Rule
    public
    ActivityScenarioRule rule = new ActivityScenarioRule<>(MainActivity.class );

    @Test
    public void checkVisible(){
        onView( withId( R.id.addBtn ) ).perform( click() );
        onView( withId( R.id.result_text ) ).check( matches( isDisplayed() ) );
    }
    @Test
    public void checkAdd(){
        onView( withId( R.id.input_1 ) ).perform( typeText( "5" ) );
        onView( withId( R.id.input_2 ) ).perform( typeText( "5" ) );
        onView( withId( R.id.subtractBtn)).perform( click() );
        onView( withId( R.id.result_text ) ).check( matches( withText( "5" ) ) );
    }

    @Test
    public void checkMultiply(){
        onView(withId(R.id.input_1)).perform(typeText("5"));
        onView(withId(R.id.input_2)).perform(typeText("5"));
        onView(withId(R.id.multiplyBtn)).perform(click());
        onView(withId(R.id.result_text)).check(matches(withText("25")));
    }

    @Test
    public void checkDivide(){
        onView(withId(R.id.input_1)).perform(typeText("5"));
        onView(withId(R.id.input_2)).perform(typeText("5"));
        onView(withId(R.id.divBtn)).perform(click());
        onView(withId(R.id.result_text)).check(matches(withText("1")));
    }
}
