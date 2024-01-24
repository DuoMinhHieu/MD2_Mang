//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        them 11 vao dau mang
//        int[] arr = {1, 2, 3, 4, 5, 6};
//        int newValue = 11;
//        int[] newArr = new int[arr.length + 1];
//        for (int i = 0; i < arr.length; i++) {
//            newArr[i] = arr[i];
//        }
//        newArr[newArr.length - 1] = newValue;
//        for (int num : newArr) {
//            System.out.print(num + " ");
//        }


//        them 11 vao giua mang
//        int[] arr = {1, 2, 3, 4, 5, 6};
//        int newValue = 11;
//        int insertIndex = 3;
//        int[] newArr = new int[arr.length + 1];
//        for (int i = 0; i < arr.length; i++) {
//            newArr[i] = arr[i];
//        }
//        newArr[insertIndex] = newValue;
//        for (int i = insertIndex + 1; i < newArr.length; i++) {
//            newArr[i] = arr[i - 1];
//        }
//        for (int num : newArr) {
//            System.out.print(num + " ");
//        }


//        xoa phan tu tai vi tri thu 3
        int[] arr = {1, 2, 3, 4, 5, 6};
        int removeIndex = 3;
        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < removeIndex; i++) {
            newArr[i] = arr[i];
        }
        for (int i = removeIndex; i < newArr.length; i++) {
            newArr[i] = arr[i + 1];
        }
        for (int num : newArr) {
            System.out.print(num + " ");
        }


//        xoa phan tu dau mang
        int[] arr = {1, 2, 3, 4, 5, 6};
        int removeIndex = 0;
        int[] newArr = new int[arr.length - 1];

        for (int i = 0; i < newArr.length; i++) {
            newArr[i] = arr[i + 1];
        }
        System.out.println("Mảng sau khi xóa phần tử ở đầu:");
        for (int num : newArr) {
            System.out.print(num + " ");
        }
    }
}
