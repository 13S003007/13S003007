package MySuperServer;

import static org.junit.Assert.*;
import org.junit.Test;

public class UdpServerTest {
	
	private FtpHandler test=new FtpHandler();

	@Test
	public void test() {
		assertEquals(test.validatePath("/ftp/a.txt"),0);
		assertEquals(test.validatePath("D:/02-workspace/MySuperServer/ftp/a.txt"),1);
		assertEquals(test.validatePath("D:/02-workspace/MySuperServer/ftp/vfdsg.txt"),0);
		assertEquals(test.validatePath("D:\\02-workspace/MySuperServer/ftp/a.txt"),0);
		assertEquals(test.validatePath("/02-workspace/MySuperServer/ftp/a.txt"),0);
		assertEquals(test.validatePath("/a.txt"),2);
		assertEquals(test.validatePath("/gewdfgdth.txt"),0);
	}

}
