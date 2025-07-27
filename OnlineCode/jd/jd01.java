package OnlineCode.jd;

import java.util.*;

public class jd01 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        String s= in.nextLine();
        Map<Character ,Integer> map =new HashMap<>();
        for(int i=0;i<s.length();i++)
            map.put(s.charAt(i) , i);
        int n= in.nextInt();
        String [] strs =new String[n];
        for(int i=0;i<n;i++)
            strs[i] = in.next();

        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {

                for(int i=0;i<Math.min(o1.length(),o2.length());i++){
                    if(o1.charAt(i)!= o2.charAt(i))
                        return  Integer.compare( map.get(o1.charAt(i)) , map.get(o2.charAt(i)));
                }
                return o1.length()- o2.length();
            }
        });

        for(int i=0;i< strs.length;i++)
            System.out.println(strs[i]);
    }
}
