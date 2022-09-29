public class ArraySwitch {
    public static void main(String[] args) {
        String[] cosmetics = new String[] {"Sunscreen", "Lotion", "Powder", "Mirror", "Table"};

        for (String face : cosmetics) {

            switch (face){
                case "Sunscreen" :
                    System.out.println(face + " Need to use in Sun");
                    break;
                case "Lotion" :
                    System.out.println(face + " Moisturizes your skin");
                    break;
                case "Powder" :
                    System.out.println(face + " Is good to dry out");
                    break;
                case "Mirror" :
                    System.out.println(face + " I need Big one");
                    break;
                case "Table" :
                    System.out.println(face + " I need turfed Central one");
                    break;

                default:
                    System.out.println("No Good products Listed");
                    break;

            }


        }
    }
}
