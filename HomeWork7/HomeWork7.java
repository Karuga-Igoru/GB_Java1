class HomeWork7 {
    public static void main(String[] args) {
        int fedCats = 0;
        int numberOfPlates = 1;
        Plate cutePlate = new Plate(10);
        Cat cat1 = new Cat("Fedor", 6);
        Cat cat2 = new Cat("Tom", 3);
        Cat cat3 = new Cat("Taisia", 4);
        Cat cat4 = new Cat("Behemoth", 7);
        Cat cat5 = new Cat("Triss", 5);
        Cat[] coupleOfCats = {cat1, cat2, cat3, cat4, cat5};
        
        for (Cat cats : coupleOfCats) {

        }
        while (fedCats != coupleOfCats.length) {
            System.out.println("There are " + cutePlate.getFood() + " in plate");
            for (Cat cats : coupleOfCats) {
                if (cats.getFed() == false && cutePlate.getFood() >= cats.getAppetite()) {
                    cats.eating(cutePlate);
                    cats.setFed(true);
                    System.out.println(cats.getName() +
                            " eating " + cats.getAppetite() + " pieces");
                    fedCats++;
                } else {
                    if (cats.getFed() == false) {
                        System.out.println((cats.getName() + " sees the bottom!\n" +
                cats.getName() + " needs " + cats.getAppetite() + " instead of " +
                cutePlate.getFood()));
                    }
                }
            }
            if (fedCats != coupleOfCats.length) {
                numberOfPlates++;
                System.out.println("We need MOAR FOOD!\nPut the new plate.\n");
                cutePlate.setFood(10);
            } else {
                System.out.println("All cats is fed! It takes " +
                        numberOfPlates + " plates");
            }
        }
    }
}