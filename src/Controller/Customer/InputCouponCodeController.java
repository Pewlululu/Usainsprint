package Controller.Customer;

import javax.swing.JOptionPane;
import model.Coupon;

public class InputCouponCodeController {

    public String CouponName;

    public Float CheckValidate() {
        Float Cvalues;
        Coupon coupon = new Coupon();
        Cvalues = coupon.CheckCoupon(CouponName);
        if (Cvalues.equals("")) {
            JOptionPane.showMessageDialog(null, "<html><b>Incorrect coupon code</b></html>", "Message", JOptionPane.ERROR_MESSAGE);
        }

        return Cvalues;
    }
}
