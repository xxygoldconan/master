package com.hspedu.PolyParameter;

public class PolyParameter {
    public static void main(String[] args) {
        Worker Jack = new Worker("Jack", 10000);
        Manger AK = new Manger("AK", 50000, 100000);
        PolyParameter polyParameter = new PolyParameter();
        polyParameter.showEmpAnnual(Jack);
        polyParameter.testWork(Jack);
        polyParameter.showEmpAnnual(AK);
        polyParameter.testWork(AK);

        "AB".equals("ab");
    }

    public void showEmpAnnual(Employee aa) {
        System.out.println(aa.getAnnual());

    }

    public void testWork(Employee bb) {
        if(bb instanceof Worker) {
            ((Worker) bb).work();
        } else if (bb instanceof Manger){
            ((Manger)bb).mange();
        }
    }
}
