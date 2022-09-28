public class IntSwitch {
    public static void main(String[] arg){
        int name = 1;

        switch (name){
            case 1 :
                System.out.println("Logged into Amazon");
                break;
            case 2 :
                System.out.println("Logged into Youtube");
                break;
            case 3 :
                System.out.println("Logged into Facebook");
                break;
            case 4 :
                System.out.println("Logged into google");
                break;
            case 5 :
                System.out.println("Logged into gmail");
                break;
            default:
                System.out.println("Cannot Log in");
                break;
        }
    }
}
