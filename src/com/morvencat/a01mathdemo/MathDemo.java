package com.morvencat.a01mathdemo;

public class MathDemo {
    public static void main(String[] args) {
        //判断一个数是否为质数
        System.out.println(isPrime(912311333));
        //自幂数：一个n位自然数等于自身各个数位上数字的n次幂之和
        //统计一共有多少个水仙花数。
        System.out.println("有"+three()+"个水仙花数");
        //证明没有两位的自幂数。
        System.out.println(two());
        //分别统计有多少个四叶玫瑰数和五角星数。
        System.out.println(four());
        System.out.println(five());
    }

    private static int five() {
        int count = 0;
        for (int i = 10000; i <= 99999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            int qian = i / 1000 % 10;
            int wan = i / 10000 % 10;
            double sum = Math.pow(ge, 5) + Math.pow(shi, 5) + Math.pow(bai, 5) + Math.pow(qian, 5) + Math.pow(wan, 5);
            if (sum== i){
                count++;
            }
        }
        return count;
    }

    private static int four() {
        int count = 0;
        for (int i = 1000; i <= 9999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            int qian = i / 1000 % 10;
            double sum = Math.pow(ge, 4) + Math.pow(shi, 4) + Math.pow(bai, 4) + Math.pow(qian, 4);
            if (sum== i){
                count++;
            }
        }
        return count;
    }

    private static boolean two() {
        for (int i = 10; i <= 99; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            double sum = Math.pow(ge, 2) + Math.pow(shi, 2);
            if (sum == i) {
                return true;
            }
        }
        return false;
    }

    private static int three() {
        int count = 0;
        for (int i = 100; i <= 999; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            double sum = Math.pow(ge, 3) + Math.pow(shi, 3) + Math.pow(bai, 3);
            if (sum== i){
                count++;
            }
        }
        return count;
    }

    private static boolean isPrime(int number) {
        int count = 0;
        for (int i = 2; i <= java.lang.Math.sqrt(number); i++) {
            count++;
            if (number % i == 0) {
                return false;
            }
        }
        System.out.println("循环了" + count + "次");
        return true;
    }
}