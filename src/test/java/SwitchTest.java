public class SwitchTest {
    public static void main(String[] arg){
        String name = "Amazon";

        switch (name){
            case "Amazon" :
                System.out.println("Logged into : " + name);
                break;
            case "Youtube" :
                System.out.println("Logged into : " + name);
                break;
            case "Facebook" :
                System.out.println("Logged into : " + name);
                break;
            case "Google" :
                System.out.println("Logged into : " + name);
                break;
            case "gmail" :
                System.out.println("Logged into : " + name);
                break;
            default:
                System.out.println("Cannot Login to : " + name + ", it doesn't exist");
                break;



        }
    }
}
