import java.util.ArrayList;

public class ThemePark {

    private ArrayList<IReviewed> reviews;

    public ThemePark() {
        this.reviews = new ArrayList<IReviewed>();
    }

    public ArrayList<IReviewed> getAllReviewed(){
        return this.reviews;
    }

    public void addReview(IReviewed reviewed){
        IReviewed rating = reviewed.getRating();
        reviews.add(rating);

    }


}
