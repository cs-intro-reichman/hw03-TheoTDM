/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0];
        //System.out.println((char)((int) str.charAt(0) + 32));
        System.out.println(lowerCase(str));
    }
    public static String lowerCase(String s) {
        String lower = "";
        for (int i = 0;i < s.length(); i++){
            char c = s.charAt(i);
            int asciiC = (int) c;
            if (asciiC >= 65 && asciiC <= 90){
                lower = lower + (char) (asciiC + 32);
            }
            else { 
                lower = lower + c;
            }
        }
        return lower;
    }
}