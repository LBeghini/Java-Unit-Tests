import model.IMC;
import model.Gender;



public class Main {

    public static void main(String[] args) {

        IMC imc = new IMC(1, 19.1, Gender.FEMALE );

        System.out.println(imc.condition());

    }
}
