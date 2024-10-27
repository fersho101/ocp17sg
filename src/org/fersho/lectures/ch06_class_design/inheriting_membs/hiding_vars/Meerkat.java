package org.fersho.lectures.ch06_class_design.inheriting_membs.hiding_vars;

class Carnivore {
    protected boolean hasFur = false;
    public static void main(String[] args) {
        System.out.println("class Carnivore");
    }
}

class Meerkat extends Carnivore {
    protected boolean hasFur = true;

    public static void main(String[] args) {
        Meerkat m = new Meerkat();
        Carnivore c = m;
        System.out.println(m.hasFur);
        System.out.println(c.hasFur);
    }
}
