class Plate {
    private int food;

    Plate(int food){
        this.food = food;
    }

    public String toString() {
        return "There is " + food + " pieces in plate";
    }

    void decreaseFood(int food) {
        this.food -= food;
    }

    int getFood() {
        return food;
    }

    void setFood(int food) {
        this.food = food;
    }

}