import java.util.*;

public class DFA {

}

class SolutionDFS{
    public static void main(String[] args) {
        List<String>list =new ArrayList<String>();
        list.add("法轮");
        list.add("冰毒");
        initMap(list);
    }

    private static void initMap(List<String> words) {
        Map<String ,Object>map =new HashMap<>();
        Map<String,Object>curMap =null;
        Iterator<String>iterator= words.iterator();

        while(iterator.hasNext()){
            String word=iterator.next();
            curMap=map;

            int len=word.length();
            for(int i=0;i<len;i++){
                String key=String.valueOf(word.charAt(i) );
                 Map<String,Object> wordMap= (Map<String,Object>)curMap.get(key);
                 if(wordMap == null){
                     wordMap=new HashMap<>(2);
                     wordMap.put("isEnd",0);
                     curMap.put(key,wordMap);
                 }
                 curMap=wordMap;
                 if(i==len-1)
                     curMap.put("isEnd",1);

            }
        }

    }


}