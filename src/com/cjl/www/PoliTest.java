package com.cjl.www;

import java.util.Random;

public class PoliTest {

    public PParent generate(){
        Random random = new Random();
        int number = random.nextInt(3);

        switch (number){
            case 0:
                return new PChild();
            case 1:
                return new PChild2();
            case 2:
                return new PChild3();
        }
        return null;
    }
    public static void main(String[] args) {
        PParent p = new PChild();
        p.doSth();


        Parent3 parent3 = new Child3();
        parent3.doSth();

        //运行时才知道哪一个　　　多态是运行时多态
        p = new PoliTest().generate();
        p.doSth();

    }
}

class PParent{
    public void  doSth(){
        System.out.println("PParent.doSth");
    }
}

class PChild extends PParent{
    @Override
    public void doSth() {
        System.out.println("PChild.doSth");
    }


    public void doSth2(){
        System.out.println("PChild.doSth2");
    }
}

class PChild2 extends PParent{
    @Override
    public void doSth() {
        System.out.println("PChild２.doSth");
    }


    public void doSth2(){
        System.out.println("PChild２.doSth2");
    }
}


class PChild3 extends PParent{
    @Override
    public void doSth() {
        System.out.println("PChild３.doSth");
    }


    public void doSth2(){
        System.out.println("PChild３.doSth2");
    }
}


interface Parent3{
    void doSth();
}

class Child3 implements Parent3{

    @Override
    public void doSth() {
        System.out.println("Child3.doSth");
    }
}
/**
 * 关于多态：父类或者接口类型的引用　指向　　子类或实现该接口的类的对象
 *
 * 多态是运行时行为,不是编译时行为
 */
