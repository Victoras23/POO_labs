package com.company;

class Square extends Figure{
    float a;
    Square(float l){
        this.a=l;
    }
    @Override
    public double getArea(){
        double area;
        area=a*a;
        return area;
    }
    @Override
    public double getPerimeter(){
        double perimeter;
        perimeter=a*4;
        return perimeter;
    }
}
