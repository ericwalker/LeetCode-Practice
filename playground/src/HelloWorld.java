import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class HelloWorld {

    public static void main(String[] args) {

        // TEST

        String inputString = "[]";
        
        System.out.println("Start");
        System.out.println(inputString);
        String persoId = "3,12,23,24";
        StringBuilder updatedPersoId = new StringBuilder("[[");
        
        for (int i = 0; i < persoId.length(); i++){
            if (persoId.charAt(i) != ','){
                updatedPersoId.append(persoId.charAt(i));
            }
            else{
                updatedPersoId.append("],[");
            }
        }
        updatedPersoId.append("]]");
        System.out.println(updatedPersoId.toString());

        System.out.println("Finish");
    }

}

