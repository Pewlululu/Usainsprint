package Controller.Manager;

import model.Coupon;

public class CreateCouponCodeController {

    public String CouponName;
    public Float CouponDiscount;
    public String StartDate;
    public String EndDate;

    public void createCouponController() {
        Coupon coupon = new Coupon();
        coupon.setCouponName(CouponName);
        coupon.setCouponDiscount(CouponDiscount);
        coupon.setStartDate(StartDate);
        coupon.setEndDate(EndDate);
        coupon.add(coupon);
    }

    public boolean CheckCouponName() {
        boolean C = Coupon.isCouponNameTaken(CouponName);
        return C;
    }
}
