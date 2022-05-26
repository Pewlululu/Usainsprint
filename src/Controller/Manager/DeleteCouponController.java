package Controller.Manager;

import model.Coupon;

public class DeleteCouponController {

    public String CouponName;

    public void deleteCouponController() {
        Coupon.delete(CouponName);
    }
}
