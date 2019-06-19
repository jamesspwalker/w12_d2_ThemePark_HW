public class Rollercoaster extends Attraction {

    public Rollercoaster(String name, int rating){
        super(name, rating);
    }

    public boolean isAllowedTo(Visitor visitor) {
        if(visitor.getAge() > 12 & visitor.getHeight() > 145){return true;}
        return false;
    }

}
