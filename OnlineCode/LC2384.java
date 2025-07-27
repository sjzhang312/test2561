package OnlineCode;

public class LC2384 {


    public static void main(String[] args) {
        String num="00000";
        System.out.println(sovle(num));
    }

    private static String sovle(String num) {
        int []cnt=new int[10];
        for(int i=0;i<num.length() ;i++)
            cnt[num.charAt(i)-'0']++;
        StringBuffer s1=new StringBuffer();
        for(int i=9;i>=0;i--){
            int t=cnt[i]/2;
            int j=0;
            while( j++<t){
                s1.append( (char)( i+'0'));

            }
        }

        while( !s1.isEmpty() && s1.charAt(0)=='0')
            s1.deleteCharAt(0);
        String ans1=s1.toString();

        String tmp=s1.reverse().toString();
        for(int i=9;i>=0;i--){
            if(cnt[i]%2!=0 ){
                ans1+=( (char)( i+'0'));
                break;
            }
        }
        if(ans1.isEmpty())ans1+='0';
        return ans1+tmp;

    }
}
