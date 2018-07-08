package com.mytaxi.android_demo.activities;

import android.support.test.espresso.action.ViewActions;

import com.mytaxi.android_demo.R;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static com.mytaxi.android_demo.activities.Locator.findByRId;

public class Calling {
    public Calling()
    {
        findByRId(R.id.fab);

        onView(withId(R.id.fab)).perform(ViewActions.click());
    }
}
