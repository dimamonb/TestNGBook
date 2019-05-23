package test.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestClass {

    @Test(dataProvider = "data-provider", dataProviderClass = DataProviderClass.class)
    public void testMethod(String data) {
        System.out.println("Data is: " + data);
    }
}
