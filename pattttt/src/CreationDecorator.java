public class CreationDecorator implements Creation{

    private Creation creation;

    public CreationDecorator(Creation creation){
        this.creation = creation;
    }



    @Override
    public String newCreation() {
        return creation.newCreation();
    }
}
