package SystemEnvExample;
import java.util.Properties;
import java.util.Set;

public class SystemEnvExample	 { 
	public static void main (String [] args) {
		String javaHome = System.getenv("Path");
		System.out.println("Path : " + javaHome);
	}
	}



