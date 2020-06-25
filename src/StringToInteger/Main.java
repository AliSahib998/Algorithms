package StringToInteger;

public class Main {


    public static void main(String[] args) {
        System.out.println(Atoi("123"));
    }

    public static int Atoi(String str) {

        str = str.trim();
        String result = "";
        for(int i=0;i<str.length();i++) {
            int a =(int)str.charAt(i);
            if((a>=48 && a<=57) || (a==45 && i==0)) {
                result +=str.charAt(i);
            } else if(a==43 && i==0) {
                result+="";
            } else {
                break;
            }
        }

        if(result.trim().equals("") || result.equals("-")) return 0;
        int s=0;
        try{
            s = Integer.parseInt(result);
        } catch(Exception ex) {
            if(result.charAt(0) == '-')
                return -2147483648;
            else
                return  2147483647;
        }
        return s;
    }


}



