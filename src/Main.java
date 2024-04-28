import java.util.Locale;

public class Main {
    public static void main(String[] args) {

            String name = "ITMastar";
            System.out.println(name.length());
            String name1 = "MOHAN";
            String name2 = "mohan";
            String name3 = "star";
            System.out.println(name1.length());
        System.out.println(name.charAt(1));
        System.out.println(name.toLowerCase());
        System.out.println(name2.toUpperCase());
        System.out.println(name.concat(name1));
        System.out.println(name+name1);
        System.out.println(name+" "+name1);
        System.out.println(name.concat(" " ).concat(name1));
        System.out.println(name.equalsIgnoreCase(name2));
        System.out.println(name1.equalsIgnoreCase(name2));
        System.out.println(name.contains("star"));
        System.out.println(name.contains(name3));
        System.out.println(name.substring(0,8));
        System.out.println(name.startsWith("t"));
        System.out.println(name2.startsWith("M"));
        System.out.println(name2.startsWith("m"));
        System.out.println(name2.endsWith("n"));
        System.out.println(name.substring(4));
        System.out.println(name.substring(0,2));
        String sentence ="I love INDIA";
        String desiredoutput ="love";
        String extractedWord= sentence.substring(2,6);
        if(extractedWord.equals(desiredoutput)){
            System.out.println("pass");
        }else{
            System.out.println("Try again");
        }


        }
    }


