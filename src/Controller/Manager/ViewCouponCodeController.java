package Controller.Manager;

import java.util.ArrayList;
import java.util.Iterator;
import model.Coupon;

public class ViewCouponCodeController {

    public static Iterator<Coupon> getData() {
        ArrayList<Coupon> list = Coupon.getAllRecords();
        Iterator<Coupon> itr = list.iterator();
        return itr;
    }
}
