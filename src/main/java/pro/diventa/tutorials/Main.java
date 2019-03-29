package pro.diventa.tutorials;

import com.kstruct.gethostname4j.Hostname;

import static spark.Spark.get;

class Main {

    public static void main(String[] args) {

        get("/hello", (req, res) -> "Hello World");

        get("/hostname", (req, res) -> Hostname.getHostname());

        get("/169.254.169.254/", null);

    }
}
