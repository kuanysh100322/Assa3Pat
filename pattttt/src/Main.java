public class Main {
    public static void main(String[] args){
        Creation creation = new HairDecorator(new SkinDecorator(new ClothesDecorator(new CharacterCreation())));
        System.out.println(creation.newCreation());
    }
}
