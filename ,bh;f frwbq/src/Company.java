public class Company {
    private String Stockholder;
    private String Stock;
    private String name;
    private String type;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setStock(String stock) {
        Stock = stock;
    }

    public String getStock() {
        return Stock;
    }
    public String getStockholder() {
        return Stockholder;
    }

    public void setStockholder(String stockholder) {
        Stockholder = stockholder;
    }
}
