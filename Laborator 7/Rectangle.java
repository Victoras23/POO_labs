package com.company;

class Rectangle extends Figure {
    float a1,a2;
    Rectangle (float x,float y){
        this.a1=x;
        this.a2=y;
    }
    @Override
    public double getArea() {
        double area;
        area=a1*a2;
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter;
        perimeter=2*(a1+a2);
        return perimeter;
    }
}
