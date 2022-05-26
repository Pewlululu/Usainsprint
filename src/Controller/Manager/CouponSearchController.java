package Controller.Manager;

import java.util.ArrayList;
import java.util.Iterator;
import model.Coupon;

public class CouponSearchController {

    public String txtinput;

    public Iterator<Coupon> Search() {
        ArrayList<Coupon> list = Coupon.Search(txtinput);
        Iterator<Coupon> itr = list.iterator();
        return itr;
    }
}
