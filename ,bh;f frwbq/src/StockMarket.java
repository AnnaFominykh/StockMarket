import java.util.ArrayList;

public class StockMarket {
    ArrayList<Stock> stocks=new ArrayList<>();
    ArrayList<Company> companies=new ArrayList<>();
    ArrayList<StockHolder>stockHolders=new ArrayList<>();

    void addStock(String name, String type, Company company, int price){
        Stock stock = new Stock();
        stock.setName(name);
        stock.setType(type);
        stock.setCompany(company.getName());
        stock.setPrice(price);
        boolean add = stocks.add(stock);

    }
    public void addComp(StockHolder holder,String name,String type, String stock)
    { Company comp=new Company();
        comp.setName(name);
        comp.setStock(stock);
        comp.setType(type);
        companies.add(comp);
    }
    public void addStockHolder(String name){
        StockHolder holder = new StockHolder();
            holder.setName(name);
            holder.setStockComp(null);
            holder.setStockStatus(null);
            holder.setStockType(null);
            stockHolders.add(holder);
        }

    public void exchange(int price)
    {for (Stock St:stocks){
        int s;
        for (s=0;s<3;s++){
            price = (int) Math.random();}
        System.out.println(price);
        St.setPrice(price);
    }}

    public void watch(){
        


    }


}

