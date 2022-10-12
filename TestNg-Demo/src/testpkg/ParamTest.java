package testpkg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParamTest {

	
	
	@DataProvider
	public Object[][] getdata(){
		
		Object[][] data = new Object[3][2];
		
		data[0][0] = "john";
		data[0][1] = "dg";
		
		data[1][0] = "max";
		data[1][1] = "sf";
		
		data[2][0] = "will";
		data[2][1] = "ff";
		return data;
	}
	
	@Test(dataProvider ="getdata")
	public void m(String a , String b) {
		System.out.println(a+b);
		
	}
	
}
