import java.util.ArrayList;
import java.util.List;

public class Master {
    public static void main(String[] args) {


        List<String> lists = new ArrayList<>();
        String xxxx = "abc";
        lists.add(xxxx);
        lists.add(xxxx);

        System.out.println("Master.main "+lists.size());

        System.out.println("Master");

        String text = "广告倒计时";

        String[] contents = text.split("&&", -1);
        System.out.println("Master.main l: "+contents[0]);


        int a = 0x10000000;
        int b = 0x20000000;
        int c = 0x04000000;
        int d = 0x08000000;

        int e = 0;

        e |= a;
//        e |= b;
        e |= c;

        if ((e&a) == a){
            System.out.println("a ");
        }
        if ((e&b) == b){
            System.out.println("b ");
        }
        if ((e&c) == c){
            System.out.println("c ");
        }
        if ((e&d) == d){
            System.out.println("d ");
        }
//        Child child = new Child();
//        child.eat(-1);
//        System.out.println("-----------------");
//        child.eat(1);


        int shift = 30;
        int mode_mask = 0x3 << shift;

        mode_mask = 0xf << shift;

        int category = 0 << shift;
        int channel = 1 << shift;
        int channel2 = 2 << shift;
        int channel3 = 15 << shift;



        int aa = makeCom(10,category);
        aa = makeCom(11,channel);
        aa = makeCom(12,channel3);

        if (getType(aa) == category){
            System.out.println("Master.main  category");
        }else if (getType(aa) == channel3){
            System.out.println("Master.main channel3 ");
        }

        int channel3_result = channel3 >> shift;
        System.out.println("Master.main channel3_result "+channel3_result);


//        int bb = makeCom2(10,5);
//
//
//        System.out.println("Master.main  bb "+bb);
//        System.out.println("Master.main" + getCategoryPosition(bb));
//        System.out.println("Master.main" + getChannelPosition(bb));





    }

    public static int makeCom2(int channelPosition,int categoryPosition){
        int shift = 30;
        int mode_mask = 0xffff << shift;
        return (channelPosition & ~mode_mask) | (categoryPosition & mode_mask);
    }

     //    0x0000 0000 0000 0000     f f f f
    public static int getCategoryPosition(int com){
        int shift = 30;
        int mode_mask = 0xffff << shift;
        return com & mode_mask;
    }

    public static int getChannelPosition(int com){
        int shift = 30;
        int mode_mask = 0xffff << shift;
        return com & ~mode_mask;
    }


    public static int makeCom(int position,int type){
        int shift = 30;
        int mode_mask = 0xf << shift;

        return (position & ~mode_mask) | (type & mode_mask);
    }

    public static int getType(int com){
        int shift = 30;
        int mode_mask = 0xf << shift;
        return com & mode_mask;
    }

    public static int getPosition(int com){
        int shift = 30;
        int mode_mask = 0xf << shift;
        return com & ~mode_mask;
    }
}
