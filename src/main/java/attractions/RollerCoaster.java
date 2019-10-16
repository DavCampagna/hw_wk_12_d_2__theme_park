package attractions;

import behaviours.IReviewed;
import behaviours.ISecurity;
import behaviours.ITicketed;
import people.Visitor;

public class RollerCoaster  extends Attraction implements ISecurity, ITicketed, IReviewed {

    public RollerCoaster(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedTo(Visitor visitor) {
        if (visitor.getAge() > 12 && visitor.getHeight() > 1.45) {
            return true;
        } else {
            return false;
        }
    }

    public double defaultPrice() {
        return 8.40;
    }

    public double priceFor(Visitor visitor) {
        if( visitor.getHeight() < 2.00) {
            return defaultPrice();
        } else {
            return defaultPrice() * 2;
        }
    }

//    public int getRating() {
//        return 5;
//    }
//
//    public String getName(Visitor) {
//
//    }
}
