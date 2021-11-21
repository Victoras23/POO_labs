package com.company;
import java.lang.Math;

class Triangle extends Figure{
    float a1,a2,a3;
    Triangle(float x, float y, float z){
        this.a1=z;
        this.a2=y;
        this.a3=z;
    }
    @Override
    public double getArea() {
        double area,p;
        p=(a1+a2+a3)/2;
        try {
        area=Math.sqrt(p*(p-a1)*(p-a2)*(p-a3));
        return area;
        }
        catch(Exception e) {
            System.out.print("here are incorrect data");
            return 0;
        }
    }

    @Override
    public double getPerimeter() {
        double perimeter;
        perimeter=a1+a2+a3;
        return perimeter;
    }
}
