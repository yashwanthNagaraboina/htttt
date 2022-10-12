package testpkg;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ParamTest2 {
	
	@DataProvider
	public Object[][] getdata(){
		
		Object[][] data = new Object[3][2];
		
		int count =1;
		count++;
		System.out.println(count);
		data[0][0] = "john";
		data[0][1] = count;
		
		data[1][0] = "max";
		data[1][1] = count;
		
		data[2][0] = "will";
		data[2][1] = count;
		return data;
	}
	
	@Test(dataProvider ="getdata")
	public void m(String a,int b) {
		System.out.println(a+b);
		
		
	}
	
}
