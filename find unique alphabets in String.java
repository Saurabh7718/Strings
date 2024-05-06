// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        String str="saam";
        
        char []ch=str.toCharArray();
        Map<Character, Integer> map=new HashMap<Character, Integer>();
        
        for(int i=0;i<ch.length;i++){
            if(map.containsKey(ch[i])){
                map.put(ch[i], map.get(ch[i])+1);
            }
            else{
                map.put(ch[i], 1);

            }
        }
        int count=0;
        for(Map.Entry<Character, Integer> e:map.entrySet()){
            if(e.getValue()>1){
                count=1;
                break;
            }
        }
        if(count==0){
            System.out.println("all characters are unique");
        }
        else{
            System.out.println("not unique");
        }
    }
}

/*java -cp /tmp/M8cttpSGhC/HelloWorld
Try programiz.pro
not unique

=== Code Execution Successful ===
*/
