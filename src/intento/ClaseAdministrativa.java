package intento;

import java.sql.SQLException;
import javax.swing.JOptionPane;


public class ClaseAdministrativa {

    public Object OrderID;
    public Object OrderDate;
    public Object ShipDate;
    public Object ShipMode;
    public Object CustomersID;
    public Object CustomersName;
    public Object Segment;
    public Object Country;
    public Object City;
    public Object State;
    public Object PostalCode;
    public Object Region;
    public Object ProductID;
    public Object Category;
    public Object SubCategory;
    public Object ProductName;
    public Object Sales;
    public Object Quantity;
    public Object Discount;
    public Object Profit;

    public ClaseAdministrativa() {
    }

    public ClaseAdministrativa(Object OrderID, Object OrderDate, Object ShipDate, Object ShipMode, Object CustomersID, Object CustomersName, Object Segment, Object Country, Object City, Object State, Object PostalCode, Object Region, Object ProductID, Object Category, Object SubCategory, Object ProductName, Object Sales, Object Quantity, Object Discount, Object Profit) {
        this.OrderID = OrderID;
        this.OrderDate = OrderDate;
        this.ShipDate = ShipDate;
        this.ShipMode = ShipMode;
        this.CustomersID = CustomersID;
        this.CustomersName = CustomersName;
        this.Segment = Segment;
        this.Country = Country;
        this.City = City;
        this.State = State;
        this.PostalCode = PostalCode;
        this.Region = Region;
        this.ProductID = ProductID;
        this.Category = Category;
        this.SubCategory = SubCategory;
        this.ProductName = ProductName;
        this.Sales = Sales;
        this.Quantity = Quantity;
        this.Discount = Discount;
        this.Profit = Profit;
    }

    public Object getOrderID() {
        return OrderID;
    }

    public void setOrderID(Object OrderID) {
        this.OrderID = OrderID;
    }

    public Object getOrderDate() {
        return OrderDate;
    }

    public void setOrderDate(Object OrderDate) {
        this.OrderDate = OrderDate;
    }

    public Object getShipDate() {
        return ShipDate;
    }

    public void setShipDate(Object ShipDate) {
        this.ShipDate = ShipDate;
    }

    public Object getShipMode() {
        return ShipMode;
    }

    public void setShipMode(Object ShipMode) {
        this.ShipMode = ShipMode;
    }

    public Object getCustomersID() {
        return CustomersID;
    }

    public void setCustomersID(Object CustomersID) {
        this.CustomersID = CustomersID;
    }

    public Object getCustomersName() {
        return CustomersName;
    }

    public void setCustomersName(Object CustomersName) {
        this.CustomersName = CustomersName;
    }

    public Object getSegment() {
        return Segment;
    }

    public void setSegment(Object Segment) {
        this.Segment = Segment;
    }

    public Object getCountry() {
        return Country;
    }

    public void setCountry(Object Country) {
        this.Country = Country;
    }

    public Object getCity() {
        return City;
    }

    public void setCity(Object City) {
        this.City = City;
    }

    public Object getState() {
        return State;
    }

    public void setState(Object State) {
        this.State = State;
    }

    public Object getPostalCode() {
        return PostalCode;
    }

    public void setPostalCode(Object PostalCode) {
        this.PostalCode = PostalCode;
    }

    public Object getRegion() {
        return Region;
    }

    public void setRegion(Object Region) {
        this.Region = Region;
    }

    public Object getProductID() {
        return ProductID;
    }

    public void setProductID(Object ProductID) {
        this.ProductID = ProductID;
    }

    public Object getCategory() {
        return Category;
    }

    public void setCategory(Object Category) {
        this.Category = Category;
    }

    public Object getSubCategory() {
        return SubCategory;
    }

    public void setSubCategory(Object SubCategory) {
        this.SubCategory = SubCategory;
    }

    public Object getProductName() {
        return ProductName;
    }

    public void setProductName(Object ProductName) {
        this.ProductName = ProductName;
    }

    public Object getSales() {
        return Sales;
    }

    public void setSales(Object Sales) {
        this.Sales = Sales;
    }

    public Object getQuantity() {
        return Quantity;
    }

    public void setQuantity(Object Quantity) {
        this.Quantity = Quantity;
    }

    public Object getDiscount() {
        return Discount;
    }

    public void setDiscount(Object Discount) {
        this.Discount = Discount;
    }

    public Object getProfit() {
        return Profit;
    }

    public void setProfit(Object Profit) {
        this.Profit = Profit;
    }

    public String toStringOders() {
        return "OrderID=" + OrderID + "\n"
                + "OrderDate= " + OrderDate + "\n"
                + "ShipDate= " + ShipDate + "\n"
                + "ShipMode= " + ShipMode + "\n"
                + "CustomersID= " + CustomersID;
    }

    public String toStringDetails() {
        return "OrderID= " + OrderID + "\n"
                + "ShipMode= " + ShipMode + "\n"
                + " CustomersID= " + CustomersID + "\n"
                + " ProductID= " + ProductID + "\n"
                + " Sales= " + Sales;
    }

    public String toStringCustomers() {
        return "CustomersID= " + CustomersID + "\n"
                + " CustomersName= " + CustomersName + "\n"
                + " Segment= " + Segment + "\n"
                + " Country= " + Country + "\n"
                + "City= " + City + "\n"
                + " State= " + State + "\n"
                + " PostalCode= " + PostalCode + "\n"
                + " Region= " + Region;
    }


    public String toStringProducts() {
        return "ProductID= " + ProductID + "\n"
                + "Category= " + Category + "\n"
                + "SubCategory=" + SubCategory + "\n"
                + "ProductName=" + ProductName;
    }

    public void agregar() {
        Dba data = new Dba("./Base_de_DATOS.accdb");
        data.conectar();
       try {
            data.query.execute("INSERT INTO [Base de datos]"
                    + "([Order ID],[Order Date],[Ship Date],[Ship Mode],[Customer ID],[Customer Name],[Segment],[Country],[City],[State],[Postal Code],[Region],[Product ID],[Category],[Sub-Category],[Product Name],[Sales],[Quantity],[Discount],[Profit])"
                    + " VALUES('"+ OrderID.toString() + "','" + OrderDate.toString() + "','" + ShipDate.toString() + "','" + ShipMode.toString() + "','" + CustomersID.toString() + "','" + CustomersName.toString() + "','" + Segment.toString() + "','" + Country.toString() + "','" + City.toString() + "','" + State.toString() + "','" + PostalCode.toString() + "','" + Region.toString() + "','" + ProductID.toString() + "','" + Category.toString() + "','" + SubCategory.toString() + "','" + ProductName.toString() + "','" + Sales.toString() + "','" + Quantity.toString() + "','" + Discount.toString() + "','" + Profit.toString() + "')");
            data.commit();
       } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Operacion Fallida");
        }
        data.desconectar();

    }
    public void delete(int id){
       Dba db = new Dba("./Base_de_DATOS.accdb");
        db.conectar();
        try {
            db.query.execute("delete from [Base de datos] where Id = " + id);
            db.commit();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        db.desconectar();
   }
    
}


