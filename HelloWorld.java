public class HelloWorld {
    public static void main(String[] args) {
        String[] fruits = {"apple", "orange", "mango"};
        print(null);
        // System.out.println(fruits); 
        // System.out.println(Arrays.toString(fruits)); // java đặt ngầm to string Array.toString
        System.out.println(fruits[0]);
        System.out.println(fruits[1]);
        System.out.println(fruits[2]);
        // for (int i = 0 ; i <= 5; i++){
           //  System.out.println("hello world");

        // }
        for (int i = 0;i<fruits.length;i++){
            System.out.println(fruits[i]);
        }
        



    


 

    }
    public static void print(int[] array ) {  // là 1 đoạn mã mà m có thể tái sử dụn, khi mà gọi cái method thì m có  thể sử dụng code m đã viết bên trong
        // cần lặp từ đầu tới cuối của 1 còn arrays length là mình lấy độ dài của cái arrays đấy
        // {32,5,27,-3.2598} element [0] =32 element[1] = 5 element[3] =  -3 element[2]=27
        // {1,6,7,9} element [0]=1 element[3] = 9
        for (int i = 0 ; i < array.length;i++){
            System.out.println("element[" + i +"] is "+ array[i]);

        }
    }

    }

