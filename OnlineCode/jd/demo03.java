package OnlineCode.jd;

public class demo03 {

    public static int []fa= new int[1010];
    public static int f(int x){
        return x==fa[x]?x: (fa[x]=f(fa[x])) ;
    }

    public static void main(String[] args) {
        String s="123";
        String s1 = s.replace("23", "45");
        System.out.println(s1);
        System.out.println(s1.indexOf('5'));
        //System.out.println(s1.split("2"));
        String[] split = s1.split("4");
        for(String t:split) System.out.println(t);
        System.out.println(s1.contains("45"));
    }
}
