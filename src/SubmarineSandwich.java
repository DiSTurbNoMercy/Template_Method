public abstract class SubmarineSandwich {

    boolean afterFirstCondiment = false;

    final void makeSandwich() {
        cutBun();
        if(customerWantsMeat()) {
            addMeat();
            afterFirstCondiment = true;
        }
        if(customerWantsCheese()) {
            if(afterFirstCondiment)
            { System.out.println("\n"); }
            addCheese();
            afterFirstCondiment = true;
        }
        if(customerWantsVegatables()) {
            if(afterFirstCondiment)
            { System.out.println("\n"); }
            addVegetables();
            afterFirstCondiment = true;
        }
        if(customerWantsCondiments()) {
            if(afterFirstCondiment)
            { System.out.println("\n"); }
            addCondiments();
            afterFirstCondiment = true;
        }
        wrapTheSubmarine();
    }
    public void cutBun() {
        System.out.println("The Submarine is Cut");
    }
    abstract void addMeat();
    abstract void addCheese();
    abstract void addVegetables();
    abstract void addCondiments();

    boolean customerWantsMeat() {
        return true; }
    boolean customerWantsCheese() {
        return true; }
    boolean customerWantsVegatables() {
        return true; }
    boolean customerWantsCondiments() {
        return true; }

    public void wrapTheSubmarine() {
        System.out.println("\nWrap the Submarine");
    }
    public void afterFirstCondiment() {
        System.out.println("\n");
    }
}
