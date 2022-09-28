public class Array {
    public static void main(String[] args) {

        int[] a = new int[]{1, 2, 3, 4, 5};
        int total=0;
        //total= a[1] + a[3];
        System.out.println("The total value is: " + total);
        for (int i=0; i<a.length; i++){
            total += a[i];
            System.out.println(" The total sum of all elements is:" +  total);
        }

        System.out.println(a[4]);

    }
}
