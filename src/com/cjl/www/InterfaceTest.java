package com.cjl.www;

public class InterfaceTest {
    public static void main(String[] args) {
        I[] i = new I[2];

        i[0] = new II();
        i[1] = new II();

        System.out.println("InterfaceTest.main "+i[0]);
        System.out.println("InterfaceTest.main "+i[1]);


//   wrong     I i = new I();
    }
}

class II implements I{

}
interface I{

}
