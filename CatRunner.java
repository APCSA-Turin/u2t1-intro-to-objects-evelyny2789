public class CatRunner {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Bella", 5, 5 );
        cat1.printCatInfo();
        cat1.introduce(); 

        Cat cat2 = new Cat("Sophie", 13, 17);  
        cat2.introduce(); 
        cat2.printCatInfo();
    }

}
