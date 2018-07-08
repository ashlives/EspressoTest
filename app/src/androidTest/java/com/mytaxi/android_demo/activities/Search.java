package com.mytaxi.android_demo.activities;

import android.support.test.espresso.action.ViewActions;
import android.support.test.runner.AndroidJUnit4;

import com.mytaxi.android_demo.R;

import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static com.mytaxi.android_demo.activities.Locator.findByRId;
import static com.mytaxi.android_demo.activities.Locator.findByRText;

public class Search  {

    public Search(String name) throws InterruptedException{

        findByRId(R.id.textSearch);
        onView(withId(R.id.textSearch)).perform(ViewActions.typeText(name));

        String text;
        text = "sa";
        findByRText(text);
    }
}
