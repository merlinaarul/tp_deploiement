import javax.xml.ws.Endpoint;

public class Application {
    public static void main(String[] args) {
        System.out.printf("Début de déploiement");
        String url = "http://localhost:8888/";
        Endpoint.publish(url, new MonServiceWeb());
        System.out.println("Le service web est deployé");
    }
}
