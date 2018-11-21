package step_defs;

import com.sparta.jas.bbcSite.BbcSite;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

    @Before
    public void beforeHook(){
        System.out.println("This Runs Before");
    }

    @After
    public void afterHook(){
        System.out.println("This Runs After");
    }
}
