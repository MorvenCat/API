package com.morvencat.a02systemdemo;


public class SystemDemo1 {
    public static void main(String[] args) {
        /*
        终止虚拟机
        状态码  0:正常停止   非0:异常停止
        System.exit(0);
        System.out.println("看看我执行了吗？");
        */


        //返回当前系统时间毫秒值形式
        long l = System.currentTimeMillis();
        System.out.println(l);


        //拷贝数组
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = new int[10];
        int[] arr3 = new int[10];
        //把arr1拷贝到arr2
        //参数详解：
        //参数1：数据源   参数2：数据源数组的开头索引  参数3：目的地 参数4：目的数组的开头索引   参数5：复制个数
        System.arraycopy(arr1, 0, arr2, 0, 10);
        System.arraycopy(arr2, 0, arr3, 0, 5);
        for (int j : arr2) {
            System.out.print(j + " ");
        }
        System.out.println();
        for (int j : arr3) {
            System.out.print(j + " ");
        }
        System.out.println();

        //arr5从arr4中复制，实现{0，0，0，0，1，2，3，0，0，0}
        int[] arr4 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr5 = new int[10];
        System.arraycopy(arr4, 6, arr5, 4, 3);
        for (int j : arr5) {
            System.out.print(j + " ");
        }
    }
}
