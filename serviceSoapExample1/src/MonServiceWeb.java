import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(targetNamespace = "http://www.polytech.fr")
public class MonServiceWeb {
    public double conversion(double mt){
        return mt*0.9;
    }

    public double somme(double a, double b){
        return a+b;
    }
}
