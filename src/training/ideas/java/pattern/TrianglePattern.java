package training.ideas.java.pattern;

/**
 * Created by idndde on 8/19/2014.
 */
public class TrianglePattern {

    public static void main(String agrs[]) {
        String pattern="devendra";
        String output="";
        String space;
        System.out.println("The Pattern of devendra is");
        for (int i = 0; i < pattern.length(); i++) {
            space="";
            String substr=pattern.substring(i,i+1);
            output=substr+output+substr;

            for(int j=pattern.length()-1;j>i;j--){
                space=space+" ";
            }
            System.out.println(space+output+space);
        }
//
//        for (int i = pattern.length()-1;  i >0; i--) {
//            space="";
//            String substr=pattern.substring(i,i+1);
//            output=substr+output+substr;
//
//            for(int j=0;j<pattern.length();j++){
//                space=space+" ";
//            }
//            System.out.println(space+output+space);
//        }

    }

}
