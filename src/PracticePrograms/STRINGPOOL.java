package PracticePrograms;

public class STRINGPOOL {

    public static void main(String[] args) {
            String a = "Mahesh";
            String b = "Dhoot";
            String c = "Mahesh";
            String d = "Mumbai_Pune_Mumbai";
            System.out.println(a.length());
            System.out.println(a.charAt(2));
            System.out.println(a.replaceAll("M","D"));
            System.out.println(a.toLowerCase());
            System.out.println(a.toUpperCase());
            System.out.println(a.substring(1,2));
            System.out.println(a.concat(b));
            System.out.println(a.contains("m"));
            System.out.println(a.equals(c));


            //String Buffer
            StringBuffer str = new StringBuffer("abc");
            StringBuffer str1 = new StringBuffer("I am Learning JAVA");
            StringBuffer str2 = new StringBuffer("10.0");
            System.out.println(str.length());
            System.out.println(str1.reverse());
            System.out.println(str.delete(1,2));
            System.out.println(str.append("i"));
            System.out.println(str.insert(0,"mahe"));
            System.out.println(str.replace(1,2,"H"));
            System.out.println(str2.replace(2,4,""));

            //String Builder



        }
    }

