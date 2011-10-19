package jersey;

import static org.junit.Assert.*;

import org.junit.Test;

import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.test.framework.JerseyTest;

public class HelloTest extends JerseyTest {
	public HelloTest() throws Exception {
		super("jersey.resources");
	}

	@Test
	public void testHelloWorld() {
		WebResource webResource = resource();
		String responseMsg = webResource.path("sayPlainTextHello").get(String.class);
		assertEquals("Hello Jersey", responseMsg);
	}
}
