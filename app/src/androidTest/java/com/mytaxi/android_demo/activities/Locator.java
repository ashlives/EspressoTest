package com.mytaxi.android_demo.activities;

import android.support.test.espresso.ViewInteraction;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class Locator {

    private static boolean waitForElement(ViewInteraction element){
        int i=0;
        while (i++<100){
            try{
                element.check(matches(isDisplayed()));
                return true;
            }
            catch (Exception e1){
                e1.printStackTrace();
                try {
                    Thread.sleep((5000));
                }catch (Exception e2){
                    e2.printStackTrace();
                }
            }
        }
        return false;
    }

    public static ViewInteraction findByRId(int id){
        ViewInteraction element = onView(withId(id));
        waitForElement(element);
        return element;
    }

    public static ViewInteraction findByRText(String text){
        ViewInteraction element = onView(withText(text));
        waitForElement(element);
        return element;
    }
}
