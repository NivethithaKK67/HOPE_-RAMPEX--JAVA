public class Address {
    public static void main(String[] args) {
        double[] arr = {1.0,2.0,3.0};
        double[] arr2 = arr;
        arr[0]=10;
        arr2[1]=20;
        System.out.println(arr);
        System.out.println(arr2[0]+" "+arr[1]);
    }

}
