public class ClothesDecorator extends CreationDecorator{
    public ClothesDecorator(Creation creation) {
        super(creation);
    }

    public String pickClothes(){
        return "Clothes are selected"+"\n";
    }

    @Override
    public String newCreation() {
        return super.newCreation() + pickClothes();
    }
}
