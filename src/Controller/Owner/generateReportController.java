package Controller.Owner;

import model.Orders;

public class generateReportController {

    public String toDate;
    public String DateString;

    public Float AveData() {
        Float avger = 0f;
        Orders Or = new Orders();
        avger = Or.GetAvg(toDate, DateString);
        return avger;
    }

    public Orders HighP() {
        Orders Or = new Orders();
        Or.HighPrice(toDate, DateString);
        Or.MaxItem(toDate, DateString);
        Or.MinItem(toDate, DateString);
        Or.ChecDateTo(toDate, DateString);
        return Or;
    }

}
