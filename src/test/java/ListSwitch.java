import java.util.ArrayList;
import java.util.List;

public class ListSwitch {
    public static void main(String[] arg){
        List<String> nameList = new ArrayList<>();
        nameList.add("Amazon");
        nameList.add("Youtube1");
        /*nameList.add("Facebook");
        nameList.add("Google");
        nameList.add("Gmail");*/

        for(int i = 0; i< nameList.size(); i ++){
           switch (nameList.get(i)){
               case "Amazon" :
                   System.out.println("Logged into : " + nameList.get(i));
                   break;
               case "Youtube" :
                   System.out.println("Logged into : " + nameList.get(i));
                   break;
               case "Facebook" :
                   System.out.println("Logged into : " + nameList.get(i));
                   break;
               case "Google" :
                   System.out.println("Logged into : " + nameList.get(i));
                   break;
               case "Gmail" :
                   System.out.println("Logged into : " + nameList.get(i));
                   break;
               default:
                   System.out.println("It doesn't exist");
                   break;
           }
        }
    }

}
