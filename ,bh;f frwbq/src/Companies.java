import java.util.ArrayList;

public class Companies {
    ArrayList<Company> companies=new ArrayList<>();

    public void sell(StockHolder holder,String name,String type, Stock stock)
    { Company comp=new Company();
        comp.setName(name);
        comp.setStock(stock.getName());
        comp.setType(type);
        comp.setStockholder(holder.getName());
        companies.add(comp);
    }

    public void  out(int out)
        {
            System.out.println(companies.get(out).getName()+" "+companies.get(out).getStock()+" "+
                    companies.get(out).getType()+" "+companies.get(out).getStockholder());

    }

}
