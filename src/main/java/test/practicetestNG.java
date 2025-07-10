package test;

import org.testng.annotations.*;

public class practicetestNG {
    @AfterTest
    public void executelast() {
        System.out.println("will execute last");

    }

    @Test(groups ={"Smoke","Regression"})
    public void Demo(){

System.out.println("testcaase1");
    }


    @Test(groups ={"Smoke","Regression"})
    public void Demo2(){

        System.out.println("testcaase2");
    }

    @BeforeSuite
    public void beforesuite(){

        System.out.println("beforesuite");
    }

    @AfterSuite
    public void aftersuite(){

        System.out.println("aftersuite");
    }

    @BeforeMethod
    public void beforemethode(){

        System.out.println("execute before every method in practicetestNG");
    }
}
