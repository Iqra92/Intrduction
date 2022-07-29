public class CoreJavaConcepts {
    public static void main(String[] args) {

// TODO Auto-generated method stub


        int myNum = 5;
        String website = "Rahul Shetty Academy";
        char letter = 'r';
        double dec = 5.99;
        boolean myCard = true;
        System.out.println(myNum + "is the value stored in the myNum variable");
        System.out.println(website);

//Arrays -
        int[] arr = new int[5];// 5, 10
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 4;
        arr[3] = 5;
        arr[4] = 6;

        int[] arr2 = {1, 2, 4, 5, 6};
        System.out.println(arr2[0]);


//for loop arr.length - 5
        for (int j : arr) {
            System.out.println(j);
        }

        for (int j : arr2) {
            System.out.println(j);
        }


        String[] name = {"rahul", "shetty", "selenium"};
        for (String value : name) {
            System.out.println(value);
        }


        for (String s : name) {
            System.out.println(s);
    }
}
}
