package sample;
import org.testng.Assert;
import org.testng.annotations.Test;

public class test {
	@Test
	public void testPass() {
	Assert.assertEquals(result.display(55), "pass");
	}
	@Test
	public void testFail() {
	Assert.assertEquals(result.display(35), "fail");
	}
	@Test
	public void testInvalid() {
	Assert.assertEquals(result.display(-5), "invalid");
	}

}
