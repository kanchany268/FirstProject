package swaglabsTestPage;

import org.testng.annotations.DataProvider;

public class Allvalues {
	@DataProvider(name="datavalues")
	public Object[][] data() {
		
		return new Object[][] { {"standard_user","secret_sauce"},{"standard ","secret_sauce"},{"standard_user","selenium123"},
			{"standard_user","  "},{" ","selenium123"},{" "," "},{"standard","selenium"}
		
		
	};
	}

}