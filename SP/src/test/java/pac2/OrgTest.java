package pac2;

import org.testng.annotations.Test;

public class OrgTest {
	@Test
	public void createOrgTest() {
		System.out.println("executing createOrgTest");
		String Url=System.getProperty("url");
		String Browser=System.getProperty("browser");
		System.out.println(Url);
		System.out.println(Browser);
	}
	@Test
	public void modifyOrgTest() {
		System.out.println("executing modifyOrgTest");
	}

}
