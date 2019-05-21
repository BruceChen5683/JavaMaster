package com.cjl.interview;

public class ParamTest {
    public void changeInt(int a){
        a =3;
    }

    public void changePoint(Point point){
        point.x = 3;
        point.y = 3;
    }

    public void changeString(String str){
        str = "abc";
    }

    public static void main(String[] args) {
        int a = 1;
        ParamTest paramTest = new ParamTest();
        paramTest.changeInt(a);
        System.out.println("ParamTest.main "+a);

        Point point = new Point(1,1);
        paramTest.changePoint(point);
        System.out.println("ParamTest.main "+point);

        //引用類型的傳遞　實際就是地址
        //方法参数的传递，一律是传值  pass by value
        String str = "xyz";
        paramTest.changeString(str);
        System.out.println("ParamTest.main  "+str);

    }
}

class Point{
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
