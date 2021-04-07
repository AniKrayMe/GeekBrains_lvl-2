package com.company;

import java.util.Arrays;

public class MyRunnable {

    static final int size = 10000000;
    static final int h = size / 2;
    static float[] arr = new float[size];

    public static void firstTread() {
        Arrays.fill(arr, 1.0f);
        long start = System.currentTimeMillis();

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start + " ms");
    }

    public static void secondTread() {
        float[] arr2 = new float[size];

        float[] a1 = new float[h];
        float[] a2 = new float[h];
        Arrays.fill(arr2, 1);

        long start = System.currentTimeMillis();

        System.arraycopy(arr2, 0, a1, 0, h);
        System.arraycopy(arr2, h, a2, 0, h);

        Thread t1 = new Thread(new Arr2(){
            @Override
            public void run() {
                for (int i = 0; i < h; i++) {
                    a1[i] = (float) (a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        });
        Thread t2 = new Thread(new Arr2() {
            @Override
            public void run() {
                for(int i = 0;i<h;i++)
                {
                    a2[i] = (float) (a2[i] * Math.sin(0.2f + (i + h) / 5) * Math.cos(0.2f + (i + h) / 5) * Math.cos(0.4f + (i + h) / 2));
                }
            }
        });
        t1.start();
        t2.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.arraycopy(a1, 0, arr2, 0, h);
        System.arraycopy(a2, 0, arr2, h, h);
        long end = System.currentTimeMillis();
        System.out.println(end - start + " ms");


    }
}
