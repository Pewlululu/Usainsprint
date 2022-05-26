package model;

import com.sun.tools.example.debug.expr.ExpressionParserConstants;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Orders {

    private int id;
    private String TableNumber;
    private String Phone;
    private String Date;
    private String FoodName;
    private int Quantity;
    private Float Total;
    private String createdBy;
    private Float Discount;
    private Float GrandTotal;
    private String Allergy;
    private String Status;
    private Float HightPrice;
    private String MaxItemName;
    private String MinItemName;
    private int MaxQuantity;
    private int LowerQuantity;
    private String Todate;
    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTableNumber() {
        return TableNumber;
    }

    public void setTableNumber(String TableNumber) {
        this.TableNumber = TableNumber;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getFoodName() {
        return FoodName;
    }

    public void setFoodName(String FoodName) {
        this.FoodName = FoodName;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }

    public Float getTotal() {
        return Total;
    }

    public void setTotal(Float Total) {
        this.Total = Total;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public Float getDiscount() {
        return Discount;
    }

    public void setDiscount(Float Discount) {
        this.Discount = Discount;
    }

    public Float getGrandTotal() {
        return GrandTotal;
    }

    public void setGrandTotal(Float GrandTotal) {
        this.GrandTotal = GrandTotal;
    }

    public String getAllergy() {
        return Allergy;
    }

    public void setAllergy(String Allergy) {
        this.Allergy = Allergy;
    }

    public Float getHightPrice() {
        return HightPrice;
    }

    public void setHightPrice(Float HightPrice) {
        this.HightPrice = HightPrice;
    }

    public String getMaxItemName() {
        return MaxItemName;
    }

    public void setMaxItemName(String MaxItemName) {
        this.MaxItemName = MaxItemName;
    }

    public String getMinItemName() {
        return MinItemName;
    }

    public void setMinItemName(String MinItemName) {
        this.MinItemName = MinItemName;
    }

    public int getMaxQuantity() {
        return MaxQuantity;
    }

    public void setMaxQuantity(int MaxQuantity) {
        this.MaxQuantity = MaxQuantity;
    }

    public int getLowerQuantity() {
        return LowerQuantity;
    }

    public void setLowerQuantity(int LowerQuantity) {
        this.LowerQuantity = LowerQuantity;
    }

    public String getTodate() {
        return Todate;
    }

    public void setTodate(String Todate) {
        this.Todate = Todate;
    }
    
    
    public static String getOrId() {
        int id = 1;
        try {
            ResultSet rs = DbOperations.getData("select max(OrderId) from Orders");
            if (rs.next()) {
                id = rs.getInt(1);
                id = id + 1;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return String.valueOf(id);
    }

    public static void save(Orders order) {
        String query = "insert into Orders (OrderId, TableNumber, PhoneNumber, date,quantity, Total, createdBy,Discount,GrandTotal,Allergy,OStatus) values('" + order.getId() + "','" + order.getTableNumber() + "','" + order.getPhone() + "','" + order.getDate() + "','" + order.getQuantity() + "','"
                + order.getTotal() + "','" + order.getCreatedBy() + "','" + order.getDiscount() + "','" + order.getGrandTotal() + "','" + order.getAllergy() + "','Unfulfilled')";
        DbOperations.setDataOrDelete(query, "Order Added Successfully");
    }

    public static ArrayList<Orders> getOrderStatus() {
        ArrayList<Orders> arraylist = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("select OrderId, OStatus from Orders");
            while (rs.next()) {
                Orders orders = new Orders();
                orders.setStatus(rs.getString("OStatus"));
                orders.setId(rs.getInt("OrderId"));
                arraylist.add(orders);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arraylist;
    }

    public void getOrdStatus(int id) {

        try {
            String sql = "select OStatus from Orders where OrderId='" + id + "'";
            ResultSet rs = DbOperations.getData(sql);
            while (rs.next()) {
                setStatus(rs.getString("OStatus"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static ArrayList<Orders> getAllRecords() {
        ArrayList<Orders> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("select OrderId,TableNumber, OStatus,date from Orders where DATE_SUB(CURDATE(), INTERVAL 1 DAY) <=DATE(date) order by date desc");
            //ResultSet rs = DbOperations.getData("select OrderId,TableNumber, OStatus,date from Orders where OrderId order by date desc");
            while (rs.next()) {
                Orders orders = new Orders();
                orders.setId(rs.getInt("OrderId"));
                orders.setTableNumber(rs.getString("TableNumber"));
                orders.setStatus(rs.getString("ostatus"));
                arrayList.add(orders);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }

    public static void fulfillOrder(Orders order) {
        String query = "update orders set ostatus = 'Fulfilled' where orderid = '" + order.getId() + "'";
        DbOperations.setDataOrDelete(query, "Order updated successfully");
    }

    public static void unfulfillOrder(Orders order) {
        String query = "update orders set ostatus = 'Unfulfilled' where orderid = '" + order.getId() + "'";
        DbOperations.setDataOrDelete(query, "Order updated successfully");
    }

    public static void cancelOrder(Orders order) {
        String query = "update orders set ostatus = 'Cancelled' where orderid = '" + order.getId() + "'";
        DbOperations.setDataOrDelete(query, "Order updated successfully");
    }

    public void ChecDateTo(String CurrDate, String DateString)
    {
        try {
            String sql = "select date_sub('"+CurrDate+"',interval  "+DateString+" )EndDate,'"+CurrDate+"' from Orders;";
            ResultSet rs = DbOperations.getData(sql);
            while (rs.next()) {
                setTodate(rs.getString("EndDate"));
            }
        } catch (Exception e) {
        }
        
    }
    
    
    public Float GetAvg(String CurrDate, String DateString) {
        Float AvrData = 0f;
        try {
            String sql = "select (select sum(Total) from Orders where OStatus= 'Fulfilled' And date between date_sub('"+CurrDate+"', interval  "+DateString+" ) and '"+CurrDate+"')/(select count(t.PhoneNumber)"
                    + "from (select distinct PhoneNumber from Orders where OStatus='Fulfilled') t) AvgPrice";
            ResultSet rs = DbOperations.getData(sql);
            while (rs.next()) {
                //setAvgData(rs.getFloat("AvgPrice"));
                AvrData = rs.getFloat("AvgPrice");
            }
        } catch (Exception e) {
        }
         
        return AvrData;
         
    }

    public void HighPrice(String CurrDate, String DateString) {
        try {
            String sql = "select PhoneNumber,sum(Total) Hprice from Orders where  OStatus='Fulfilled' AND date between date_sub('"+CurrDate+"', interval "+DateString+" ) and '"+CurrDate+"' group by PhoneNumber  order by sum(Total) desc limit 1";
            ResultSet rs = DbOperations.getData(sql);
            while (rs.next()) {
                setPhone(rs.getString("PhoneNumber"));
                setHightPrice(rs.getFloat("Hprice"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
      
    }

    public void MaxItem(String CurrDate, String DateString) {
        
        try {
            String sql = "select FoodItem,sum(FoodQuantity)TotalQuantity from OrderDetail d left join Orders O on d.OrderId = O.OrderId where OStatus='Fulfilled' AND "
                 + "OrderDate between date_sub('"+CurrDate+"', interval "+DateString+" ) and '"+CurrDate+"' group by FoodItem  order by sum(FoodQuantity) desc limit 1";
            ResultSet rs = DbOperations.getData(sql);
            while (rs.next()) {
                setMaxItemName(rs.getString("FoodItem"));
                setMaxQuantity(rs.getInt("TotalQuantity"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
   
    

    public void MinItem(String CurrDate, String DateString) {
       
        try {
            //String sql = "select FoodItem,sum(FoodQuantity)TotalQuantity from OrderDetail where OStatus='"+orStatus+"' AND OrderDate between '" + StartDate + "' and '" + EndDate + "' group by FoodItem  order by sum(FoodQuantity) asc limit 1;";
            String sql ="select FoodItem,sum(FoodQuantity)TotalQuantity from OrderDetail d left join Orders o on o.OrderId = d.OrderId "
                    + "where o.OStatus='Fulfilled' AND OrderDate between date_sub('"+CurrDate+"', interval "+DateString+" ) and '"+CurrDate+"' group by FoodItem  order by sum(FoodQuantity) asc limit 1";
            ResultSet rs = DbOperations.getData(sql);
            while (rs.next()) {
                setMinItemName(rs.getString("FoodItem"));
                setLowerQuantity(rs.getInt("TotalQuantity"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
                        }
    }

    public String CheckMaxDate() {
        String CheckMaxDate = "";
        try {
            String sql = "select MAX(Date)MaxD from Orders";
            ResultSet rs = DbOperations.getData(sql);
            while (rs.next()) {
                //setAvgData(rs.getFloat("AvgPrice"));
                CheckMaxDate = rs.getString("MaxD");
            }
        } catch (Exception e) {
        }
        return CheckMaxDate;
    }

    public String CheckMinDate() {
        String CheckMinDate = "";
        try {
            String sql = "select MIN(Date)MinD from Orders;";
            ResultSet rs = DbOperations.getData(sql);
            while (rs.next()) {
                //setAvgData(rs.getFloat("AvgPrice"));
                CheckMinDate = rs.getString("MinD");
            }
        } catch (Exception e) {
        }
        return CheckMinDate;
    }

    public static ArrayList<Orders> Search(String txtString) {
        String ConTxt = "%" + txtString + "%";
        ArrayList<Orders> arraylist = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("select * from Orders o where o.OrderId like '" + txtString + "' and DATE_SUB(CURDATE(), INTERVAL 1 DAY) <=DATE(o.Date) order by date desc ");
            while (rs.next()) {
                Orders orders = new Orders();
                orders.setId(rs.getInt("OrderId"));
                orders.setTableNumber(rs.getString("TableNumber"));
                orders.setStatus(rs.getString("ostatus"));
                arraylist.add(orders);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        return arraylist;
    }
    
    public static ArrayList<Orders> getAllStatus() {
        ArrayList<Orders> arrayList = new ArrayList<>();
        try {
            ResultSet rs = DbOperations.getData("select distinct OStatus from Orders");
            while (rs.next()) {
                Orders or = new Orders();
               
                or.setStatus(rs.getString("OStatus"));
                arrayList.add(or);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
}
