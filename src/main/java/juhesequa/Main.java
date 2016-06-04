package juhesequa;

import static spark.Spark.get;
import static spark.SparkBase.port;
import static spark.SparkBase.staticFileLocation;

public class Main {
	
	public static void main(String[] args) {
		
	    port(Integer.valueOf(System.getenv("PORT")));

	    staticFileLocation("/public");

        get("/hello", (req, res) -> "Hello World");
	}
}