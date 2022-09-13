public class ClassTest {
    public static void main(String[] args) {
        Animal[] animals = getAnimals();
        for (int i = 0; i < animals.length; i++) {
            animals[i].say();
        }


    }
    public static Animal[] getAnimals(){
        return new Animal[]{new Dog(),new Cat(),new Pig()};
    }
}
class Animal extends Object {
    protected void say(){}

}
class Dog extends Animal {
    @Override
    public void say() {
        System.out.println("wang wang wang");
    }
}
class Cat extends Animal {
    @Override
    public void say() {
        System.out.println("miao miao miao");
    }
}

class Pig extends Animal {
    @Override
    public void say() {
        System.out.println("heng heng heng");
    }
}

