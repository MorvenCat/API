package com.morvencat.a03runtimedemo;

import java.io.IOException;

public class RuntimeDemo1 {
    public static void main(String[] args) throws IOException {
        //获取Runtime对象
        Runtime r = Runtime.getRuntime();

        /*
        exit退出虚拟机
        r.exit(0);
        Runtime.getRuntime().exit(0);
        System.out.println("看看我执行了吗");
        */

        //获得CPU线程数
        int p = Runtime.getRuntime().availableProcessors();
        System.out.println(p);

        //可获得总内存大小，单位byte,➗1024是kb，再➗1024是m，再➗1024是gb
        System.out.println(r.maxMemory()/1024/1024+"m");

        //已经获取的内存
        System.out.println(r.totalMemory()/1024/1024+"m");

        //空闲内存
        System.out.println(r.freeMemory()/1024/1024+"m");

        //运行cmd命令
        Runtime.getRuntime().exec("whoami");
    }
}
