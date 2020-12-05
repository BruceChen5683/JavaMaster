import java.util.Arrays;

public class Master {

    enum ChangeDefinitionState{
        START(0),
        END(1),
        INVALID(-1);

        private int change;
        ChangeDefinitionState(int change){
            this.change = change;
        }

        public static ChangeDefinitionState fromChange(int change) {
            for (ChangeDefinitionState type : ChangeDefinitionState.values()) {
                if (type.getChange() == change) {
                    return type;
                }
            }
            return null;
        }

        public int getChange() {
            return this.change;
        }
    }


    public static void main(String[] args) {
        System.out.println("Master");

        int[] pids = new int[5];
        pids[0] = 1;
        pids[0] = 2;
        pids[0] = 3;
        pids[0] = 4;
        pids[0] = 5;

        System.out.println(Arrays.asList(pids));

        System.out.println(ChangeDefinitionState.INVALID.ordinal());

        System.out.println(ChangeDefinitionState.INVALID.getChange());


        int i = 0;
        switch(i){
            case 0:
                if (true){
                    break;
                }
            case 1:
                System.out.println("00000000000111111111111");
                break;
        }
        System.out.println("end");



        switch (0){
            case 0:{
                System.out.println(0);
                }
            case 1:{
                System.out.println(111);
                break;
                }
        }



    }
}
