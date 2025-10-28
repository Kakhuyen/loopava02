package com.codegym;

public class NumberArray {

    public static void main(String[] args) {
        int[] arr = {4, 12, 7, 8, 1, 6, 9};

        // Gọi phương thức tìm phần tử nhỏ nhất
        int index = minValue(arr);

        System.out.println("The smallest element in the array is: " + arr[index]);
    }

    // Phương thức trả về index của phần tử nhỏ nhất trong mảng
    public static int minValue(int[] array) {
        int index = 0; // Giả sử phần tử đầu tiên là nhỏ nhất
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i; // Cập nhật index khi tìm thấy phần tử nhỏ hơn
            }
        }
        return index;
    }
}
