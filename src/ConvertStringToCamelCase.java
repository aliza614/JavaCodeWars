import java.lang.StringBuilder;
public class ConvertStringToCamelCase {




        static String toCamelCase(String s){
            StringBuilder sb=new StringBuilder(s);
            for(int i=0;i<sb.length()-1;i++){

                if(sb.charAt(i)==' '||sb.charAt(i)=='-'||sb.charAt(i)=='_')
                {
                    sb.setCharAt(i+1,Character.toUpperCase(sb.charAt(i+1)));
                    sb.deleteCharAt(i--);
                }
            }
            return sb.toString();
        }

}

