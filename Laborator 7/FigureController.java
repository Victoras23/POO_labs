package com.company;

import java.util.*;

public class FigureController {
    static Map<String, Double> giveBiggestArea(Map<Figure,String> f){
        Map<String , Double> biggest = new  HashMap<String,Double>();
        double b=0,count;
        for (Figure a : f.keySet()  ) {
            count=a.getArea();
            if (count>=b){
                biggest.clear();
                b=count;
                biggest.put(f.get(a), b);
            }
        }
        return biggest ;
    }
    static Map<String, Double> giveBiggestPerimeter(Map<Figure,String> f){
        Map<String , Double> biggest = new HashMap<String,Double>();
        double b=0,count;
        for (Figure a : f.keySet()  ) {
            count=a.getPerimeter();
            if (count>b){
                biggest.clear();
                b=count;
                biggest.put(f.get(a), b);
            }
        }
        return biggest ;
    }
}
