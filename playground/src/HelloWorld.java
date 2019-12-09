public class HelloWorld {

    public static void main(String[] args) {
        int x = 0;
        String str = "Hello1 World";
        System.out.println(x);
        System.out.println(str);

        for (int i = 0; i < str.length(); i++)
        {
            if (Character.isDigit(str.charAt(i)))
                System.out.println(str.charAt(i));
            else
                System.out.println("fail");
//            System.out.println(str.charAt(i));
//            System.out.println(str.substring(i,i+1));
        }
    }
}
