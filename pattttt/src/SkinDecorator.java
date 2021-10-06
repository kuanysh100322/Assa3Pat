public class SkinDecorator extends CreationDecorator{
    public SkinDecorator(Creation creation) {
        super(creation);
    }
    public String pickSkin(){
        return "Skin is selected"+"\n";
    }

    @Override
    public String newCreation() {
        return super.newCreation() + pickSkin();
    }
}
