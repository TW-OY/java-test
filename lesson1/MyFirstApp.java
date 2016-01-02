class Dog{
    int size;
    String breed;
    String name;
    void bark(){
        if (size > 60){
            System.out.println("bark bar");
        }else if (size > 14){
            System.out.println("huff huff");
        }else{
            System.out.println("YIP YIP");
        }
    }
    void count(){
        System.out.println(size);
    }
}
class Dogtestdrive{
    public static void main(String[] args){
        Dog [] some_dogs = new Dog[3];
        some_dogs[0] = new Dog();
        some_dogs[1] = new Dog();
        some_dogs[2] = new Dog();
        some_dogs[0].size = 80.32f;
        some_dogs[1].size = 10;
        some_dogs[2].size = 40;
        some_dogs[0].bark();
        some_dogs[1].bark();
        some_dogs[2].bark();
        some_dogs[2].count();
        some_dogs[1].count();
        some_dogs[0].count();
    }
}
