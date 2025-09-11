public class StringRotation {
    static boolean isRotation(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        return (s1 + s1).contains(s2);// s1+s1 means IndvsEngIndvsEng output now checks s2 present in s1 if there then prnts true else false
    }
    public static void main(String args[]){
      String s1 = "IndvsEng";
      String s2 = "EngIndvs";
      System.out.println(isRotation(s1,s2));
    }
}
/*
Output:

true
*/