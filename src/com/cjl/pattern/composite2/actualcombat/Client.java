package com.cjl.pattern.composite2.actualcombat;

public class Client {
    public static void main(String[] args) {
        Team root = new Company("万丈高楼平地起有限公司");
        Team company1 = new Company("上海分公司");
        Team company2 = new Company("北京分公司");
        Team t1 = new SmallTeam("销售部");
        Team t2 = new SmallTeam("研发部");
        Team t3 = new SmallTeam("公关部");
        Team t4 = new SmallTeam("测试部");
        Team t5 = new SmallTeam("hr");
        root.add(company1);
        root.add(company2);
        company1.add(t1);
        company1.add(t2);
        company2.add(t3);
        company2.add(t4);
        company2.add(t5);

        root.print("");

    }
}
