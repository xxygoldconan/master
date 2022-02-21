public class ArrTest {
    public static void main(String[] args) {
        int[] arr = {3, 5, 9, 1, -2, 100, -3};
        MyTools tools = new MyTools();
        int[] arr2 = tools.bubble(arr);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + "\t");
            
        }

    }
}


class MyTools {

    public int[] bubble(int[] arr) {
        int temp = 0;
        for (int i = 0; i < arr.length - 1; i++) { //外层循环次数
            for (int j = 0; j < arr.length - 1 - i; j++) { // 内层比较次数
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }
        return arr;
    }
}