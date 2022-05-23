package com.freenow.android_demo;


import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

import android.support.test.runner.AndroidJUnit4;

import androidx.test.rule.ActivityTestRule;

import com.freenow.android_demo.activities.MainActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(AndroidJUnit4.class)
public class LocationTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivity =
            new ActivityTestRule<>(MainActivity.class);


    @Test
    public void grantAccess() {

        //Username
        onView(withId(R.id.edt_username)).   //locate element
                 perform(typeText("crazydog335")); //Perform Action

        //Password
        onView(withId(R.id.edt_password)).perform(typeText("venture"));


        //Login Button
        onView(withId(R.id.btn_login)).perform(click());

        //Assertion
        onView(withId(R.id.edt_username)).check(matches(withText("crazydog335")));
        onView(withId(R.id.edt_password)).check(matches(withText("venture")));
    }


}
