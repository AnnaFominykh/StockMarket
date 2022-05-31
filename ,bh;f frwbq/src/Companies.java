import java.util.ArrayList;

public class Companies {
    ArrayList<Company> companies=new ArrayList<>();

    public void sell(StockHolder holder,String name,String type, String stock)
    { Company comp=new Company();
        comp.setName(name);
        comp.setStock(stock);
        comp.setType(type);
        comp.setStockholder(holder.getName());
        companies.add(comp);
    }
}
