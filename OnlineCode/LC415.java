package OnlineCode;

public class LC415 {

    public static void main(String[] args) {
        String num1="99";
        String num2="101";
        System.out.println(strAdd(num1,num2));
        //System.out.println('1'+'2');
    }

    private static String strAdd(String num1, String num2) {

        int i=num1.length()-1,j=num2.length()-1;
        String ans="";
        StringBuffer s1=new StringBuffer();

        int ji=0;
        while(i>=0 && j>=0){
            int tmp=(num1.charAt(i)-'0' )+ (num2.charAt(j)-'0')+ji;

            s1.append(tmp%10);

            ji=tmp/10;
            i--;
            j--;
        }
        while(i>=0){
            int tmp=(num1.charAt(i)-'0' )+ji;
            s1.append(tmp%10);
            ji=tmp/10;
            i--;
        }
        while(j>=0){
            int tmp=(num2.charAt(j)-'0' )+ji;
            s1.append(tmp%10);
            ji=tmp/10;
            j--;
        }
        if(ji!=0)
            s1.append(ji);

        return s1.reverse().toString();

    }
}
