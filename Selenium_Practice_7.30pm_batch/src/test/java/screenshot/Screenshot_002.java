package screenshot;

import dynamic_code.Base_Class;

public class Screenshot_002 extends Base_Class{

	public static void main(String[] args) throws Throwable {
		Launch_Browser("Chrome");
	TakesScreenshot("launch browser");
		Navigate_Url("https://www.facebook.com");
		TakesScreenshot("Navigate URL");
		Scroll_Page(0,2000);
		
		
		
		
	}

}
