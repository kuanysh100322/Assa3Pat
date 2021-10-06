public class HairDecorator extends CreationDecorator{
    public HairDecorator(Creation creation) {
        super(creation);
    }
    public String pickHair(){
        return "Hair are selected"+"\n";
    }

    @Override
    public String newCreation() {
        return super.newCreation() + pickHair();
    }
}
