package StringExampe;


import java.util.HashMap;

public class StringMain {



    public  static void duplicate() {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        String s = "java is a programming language ";
        for (int i = 0; i < s.length(); i++) {
            if (hashMap.containsKey(s.charAt(i))) {
                hashMap.put(s.charAt(i), hashMap.get(s.charAt(i)) + 1);
            } else {hashMap.put(s.charAt(i), 1);}

        }
        System.out.println(hashMap);
    }



    private static void replaceSpace()
    {
        String s="java is a programming language ";
       // s= s.replaceAll("\\s","");
      //  System.out.println(s);
        char[] arr=s.toCharArray();
        String newString="";
        for(int i=0;i<arr.length;i++)
        {
            if(s.charAt(i)!=' ')
            {
                newString=newString+s.charAt(i);
            }

        }
        System.out.println(newString);

    }
    public static void main(String[] args) {
      //  replaceSpace();
        duplicate();

    }
}
