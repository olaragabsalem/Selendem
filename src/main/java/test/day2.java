package test;

import org.testng.Assert;
import org.testng.annotations.*;

public class day2 {



    @Test(groups ={"Smoke","Regression"},dependsOnMethods = "helloworld2")
    public void helloworld() {
        System.out.println("helloworld");
        Assert.assertTrue(false);

    }
    @Test(groups ={"Smoke","Regression"})
    public void helloworld2() {
        System.out.println("helloworld2");

    }
    @BeforeTest
    public void runfirst() {
        System.out.println("runfirstbefore test");

    }
    @BeforeMethod
    public void beforemethodS(){

        System.out.println("execute before every method in DAY2");
    }

    @Test(dataProvider = "logindata",priority = 1)
    public void login(String user,String pass){

        System.out.println("username is"+user+"pass is"+pass);
    }
    @DataProvider(name = "logindata")
        public Object[][] getdata() {

            return new Object[][]{
                    {"user1", "pass1"},
                    {"user2", "pass2"},
                    {"admin", "admin123"}
            };


        }
    }



