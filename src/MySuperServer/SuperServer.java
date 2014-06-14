package MySuperServer;


import java.io.IOException;

public class SuperServer {
	public static void main(String[] args)
	{
		new Thread(){
			public void run()
			{
				new TcpServer();
			}
		}.start();
		System.out.print("tcp ftp server is starting \n");
		new Thread(){
			public void run()
			{
				new UdpServer();
			}
		}.start();
		System.out.print("udp ftp server is starting \n");
		new Thread(){
			public void run()
			{
				new HttpServer();
			}
		}.start();
		System.out.print("web server is starting \n");
	}
}
