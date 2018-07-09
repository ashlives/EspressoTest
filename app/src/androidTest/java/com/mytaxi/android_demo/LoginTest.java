package com.mytaxi.android_demo;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.Root;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.matcher.RootMatchers;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import com.mytaxi.android_demo.activities.Calling;
import com.mytaxi.android_demo.activities.Login;
import com.mytaxi.android_demo.activities.MainActivity;
import com.mytaxi.android_demo.activities.Search;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.matcher.RootMatchers.withDecorView;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.Matchers.not;

@RunWith(AndroidJUnit4.class)
@LargeTest
public class LoginTest {

    String userName = "crazydog335";
    String password = "venture";
    String keyword = "sa";

    @Rule
    public ActivityTestRule<MainActivity> testRule = new ActivityTestRule<>(MainActivity.class);

    private MainActivity maActivity = null;

    @Before
    public void setActivity() {
        maActivity = testRule.getActivity();
    }

    @Test
    public void test1() throws InterruptedException {

        Login login = new Login(userName, password);
        Log.i("Step", "Some text");

        Search search = new Search(keyword);

        //Not really happy with this method but its the only one which I came across.
        //Using this means user already knows the Driver, if tomorrow the API gives some other name at second place, test will fail
        //To figure out in future how to select it based on position in the dropdown/pop-up
        onView(withText("Sarah Scott"))
                .inRoot(withDecorView(not(is(maActivity.getWindow().getDecorView()))))
                .perform(click());

        Calling call = new Calling();

    }
}
