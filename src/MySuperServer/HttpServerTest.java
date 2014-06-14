package MySuperServer;

import static org.junit.Assert.*;

import org.junit.Test;

public class HttpServerTest {

	private ConnectionThread test = new ConnectionThread();

	@Test
	public void testGetFileName() {
		assertEquals(test.getfilename("GET /  HTTP/1.0"),
				"index.html");
		assertEquals(test.getfilename("GET /fgasf HTTP/1.0"),
				"error.html");
		assertEquals(test.getfilename("GET /index HTTP/1.0"),
				"index.html");
		assertEquals(test.getfilename("GET /index.htm HTTP/1.0"),
				"index.html");
		assertEquals(test.getfilename("GET /index.html HTTP/1.0"),
				"index.html");

	}


}
