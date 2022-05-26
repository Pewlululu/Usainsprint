package Controller.Manager;

import model.Coupon;

public class ModifyCouponCodeController {

    public int Id;
    public String CouponName;
    public Float Discount;
    public String StarDate;
    public String EndDate;

    public void modifyCouponController() {
        Coupon coupon = new Coupon();
        coupon.setCouponId(Id);
        coupon.setCouponName(CouponName);
        coupon.setCouponDiscount(Discount);
        coupon.setStartDate(StarDate);
        coupon.setEndDate(EndDate);
        coupon.modify(coupon);
    }
}
