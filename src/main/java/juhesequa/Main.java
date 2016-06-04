package juhesequa;

import static spark.Spark.get;
import static spark.SparkBase.port;

public class Main {
	
	public static void main(String[] args) {
	    port(Integer.valueOf(System.getenv("PORT")));

        get("/hello", (req, res) -> "Hello World");
	}
}