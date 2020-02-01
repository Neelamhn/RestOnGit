package rest;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import java.util.Arrays;
import java.util.List;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class FirstResttest {
	@DataProvider(name="Data")
	
	public void checkCityForZipCode(String Country,String Zip) {
	   System.out.println(Country); 
	   System.out.println(Zip);  
	  given().
	    pathParam("country","us").
	    pathParam("zipcode","90210").
	  when().
	    get("http://api.zippopotam.us/{country}/{zipcode}").
	  then().
	    assertThat().
	    body("places.'place name'[0]",equalTo("Beverly Hills"));
	}
	
	  @DataProvider(name="Data") public Object[][] TestData(){ Object[][] d=null;
	  d= new Object[][]{ {"us","90210"}, {"us","87655"} };
	  
	  return d;
	  
	  }
	  
	  @Test
		public static void testng() {
			String[] strings = {"one", "two", "three", "four", "five"};
			// strings array is converted into a List
			List<String> list = Arrays.asList(strings);
			System.out.println(list);
		
			Integer i1 = new Integer(127);
			Integer i2 = new Integer(127);
			System.out.println(i1 == i2); //false, since different object references are compared
			int i3 = 127;
			int i4 =127;
			System.out.println(i3 == i4); //true, refering to the same location in stack
			//To find the big and small num in an array
			int[] intarr= {8,1,9,4};
			Arrays.sort(intarr);
			for(int i:intarr) {
				System.out.println(i);			
			}
			
			System.out.println("BiggestNum:"+intarr[intarr.length-1]);
			System.out.println("SmallNum:"+intarr[0]);
			
			/*
			 * Integer i1 = new Integer(127); Integer i2 = new Integer(127);
			 * System.out.println(i1 == i2);
			 */
		}
	 

}
