package com.driver;

public class Main {
    public static class Product{
        int x, y, z;
        public int product(int x, int y) {
            return x * y;
        }
        public int product(int x, int y, int z) {
            return x * y * z;
        }
        public double product(double x, double y) {
            return x * y;
        }

    }
    public static void main(String[] args){
        Product p = new Product();
        System.out.println(p.product(5,20));
        System.out.println(p.product(6,8,9));
        System.out.println(p.product(12.5,10.5));
    }
}