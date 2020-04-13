public class Sort {
    static int[] list = {2,3,5,9,1,8,7};
    public static void sort(int[] list){
            for (int i = 1; i < list.length; i++) {
                int currentElement = list[i];
                int k;
                for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
                    list[k + 1] = list[k];
                }
                list[k + 1] = currentElement;
        }
    }

    public static void main(String[] args) {
        sort(list);
        System.out.println("mang sau khi sap xep");
        for(int i = 0 ; i< list.length; i++){
            System.out.println(list[i] + " ");
        }
    }
}
