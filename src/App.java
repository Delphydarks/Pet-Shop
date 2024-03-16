public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, wELCOME to Pocky Petshop!");

        Dog Azul = new Dog();
        Azul.setName("Azul");
        Azul.setAge(2);
        // Azul.no_of_limbs = 3;
        System.out.println("Name: "+ Azul.getName()+ " Age: " + Azul.getAge() + " No. of Limbs: " + Azul.no_of_limbs); 


        Dog Chip =new Dog();
        Chip.setName("Chip");
        Chip.setAge(3);
        Chip.hasAccident();
        Chip.hasAgeIncrease();
        System.out.println("Name: "+ Chip.getName()+ " Age: " + Chip.getAge() + " No. of Limbs: " + Chip.no_of_limbs);
    }


}
