package com.project.geekynehal.websiteshoping;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }
    
    @Test
    public boolean testOnCreateOptionsMenu {
        HomeActivity homeActivity = new HomeActivity();
        Menu menu = new Menu();
        assertTrue(homeActivity.onCreateOptionsMenu(menu);
     }
                   
     @Test
     public boolean testOnOptionsItemSelected {
         HomeActivity homeActivity = new HomeActivity();
         MenuItem item = new MenuItem();
         item = item.getItemId();
         assertTrue(homeActivity.onOptionsItemSelected(item))
     }
                   
}
