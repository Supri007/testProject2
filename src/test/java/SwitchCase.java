class SwitchCase{
    public static void main(String[] args){
        String x = "Suprima";

        switch(x){
            case "Omkar":
                System.out.println("Matched name is : " + x);
                break;
            case "Suprima":
                System.out.println("Matched name is : " + x);
                break;
            default:
                System.out.println("Did not match any name.");
                break;
        }
    }
} 