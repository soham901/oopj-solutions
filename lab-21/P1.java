// 1. WAP to demonstrate single inheritance, multilevel inheritance and hierarchical inheritance. (A)

public class P1 {
    public static void main(String[] args) {
        System.out.println("Single Inheritance:");
        Jethalal jethalal = new Jethalal();
        jethalal.greet();
        jethalal.business();

        System.out.println("\nMultilevel Inheritance:");
        Tappu tappu = new Tappu();
        tappu.greet();
        tappu.business();
        tappu.playCricket();

        System.out.println("\nHierarchical Inheritance:");
        Daya daya = new Daya();
        daya.greet();
        daya.garba();
    }
}



class GadaFamily {
    void greet() {
        System.out.println("Jai Jinendra");
    }
}

class Jethalal extends GadaFamily {
    void business() {
        System.out.println("Gada Electronics");
    }
}

class Tappu extends Jethalal {
    void playCricket() {
        System.out.println("Playing cricket");
    }
}

class Daya extends GadaFamily {
    void garba() {
        System.out.println("A halo");
    }
}
