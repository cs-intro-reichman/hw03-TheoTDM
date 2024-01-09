/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        String uni = "";
        uni = uni + s.charAt(0);
        boolean b = true;
        for (int i = 0; i < s.length();i++){
            b = true;
            char ch = s.charAt(i);
            for (int j = 0; j < uni.length();j++){
                if(ch == uni.charAt(j) && ch != 32)
                    b = false;
            }
            if (b)
                uni = uni + (char)s.charAt(i); 
        } 
        return uni;
    }
}
