package magicnumber;

public class WithoutMagicNumber {

	final static public String IP = "127.0.0.1";
	final static public int PORT = 8080;
	final static public String USERNAME = "vinit";
	final static public int TIMEOUT = 60000;

	public void serve(String ip, int port, String user, int timeout) {
		System.out.println(ip);
		System.out.println(port);
		System.out.println(user);

	}

	public static void main(String[] args) {

		new WithoutMagicNumber().serve(IP, PORT, USERNAME, TIMEOUT);
	}

}
