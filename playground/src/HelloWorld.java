import javafx.beans.binding.When;

public class HelloWorld {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        int inum = 0;
        char ch = '3';
        String str = "2";
        sb.append(inum).append(ch).append(str);

        System.out.println(sb.toString());
    }

}