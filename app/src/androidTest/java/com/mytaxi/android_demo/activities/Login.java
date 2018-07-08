package com.mytaxi.android_demo.activities;

import android.support.test.espresso.ViewAction;
import android.support.test.espresso.action.ViewActions;
import android.support.test.runner.AndroidJUnit4;

import com.mytaxi.android_demo.R;

import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.ViewMatchers.isClickable;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static com.mytaxi.android_demo.activities.Locator.findByRId;

@RunWith(AndroidJUnit4.class)
public class Login {

    public Login(String username, String pass)
    {
        findByRId(R.id.edt_username);
        onView(withId(R.id.edt_username)).perform(ViewActions.typeText(username));
        onView(withId(R.id.edt_password)).perform(ViewActions.typeText(pass));
        onView(withId(R.id.btn_login)).perform(click());

    }
}
