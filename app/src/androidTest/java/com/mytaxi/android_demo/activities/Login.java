package com.mytaxi.android_demo.activities;

import android.support.test.espresso.action.ViewActions;

import com.mytaxi.android_demo.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static com.mytaxi.android_demo.activities.Locator.findByRId;


public class Login {

    public Login(String username, String pass)
    {
        findByRId(R.id.edt_username);
        onView(withId(R.id.edt_username)).perform(ViewActions.typeText(username));
        onView(withId(R.id.edt_password)).perform(ViewActions.typeText(pass));
        onView(withId(R.id.btn_login)).perform(click());

    }
}
