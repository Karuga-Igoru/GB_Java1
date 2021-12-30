class Cat {
    private String name;
    private int appetite;
    private boolean fed = false;
    Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;

    }
    @Override
    public String toString() {
        return name + "\nAppetite: " + appetite + "\nHungry: " + !fed + "\n";
    }

    void eating(Plate plate) {
        plate.decreaseFood(appetite);
    }

    int getAppetite() {
        return appetite;
    }

    boolean getFed() {
        return fed;
    }

    void setFed(boolean fed) {
        this.fed = fed;
    }

    String getName() {
        return name;
    }
}