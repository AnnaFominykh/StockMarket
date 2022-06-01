import java.util.ArrayList;

public class StockMarket {
    ArrayList<Stock> stocks=new ArrayList<>();
    ArrayList<Company> companies=new ArrayList<>();
    ArrayList<StockHolder>stockHolders=new ArrayList<>();

       public void addComp(String name, String type, String stock)
    { Company comp=new Company();
        comp.setName(name);
        comp.setStock(stock);
        comp.setType(type);
        companies.add(comp);
    }
  public  void addStock(String name, String type, Company company, int price){
        Stock stock = new Stock();
        stock.setName(name);
        stock.setType(type);
        stock.setCompany(company.getName());
        stock.setPrice(price);
        boolean add = stocks.add(stock);

    }


    public void addStockHolder(String name){
        StockHolder holder = new StockHolder();
            holder.setName(name);
            holder.setStockComp(null);
            holder.setStockStatus(null);
            holder.setStockType(null);
            stockHolders.add(holder);
        }

    public void exchange(int price,int new_price, int exchange)
    {for (Stock St:stocks){
        int s;
        for (s=0;s<3;s++){
            new_price = (int) Math.random();}
        exchange=new_price-price;
        if (exchange>0){System.out.println("prise rise up"+exchange);}
        if (exchange<0){System.out.println("prise fell down"+exchange);}

        St.setPrice(new_price);
        St.setExchange(exchange);
    }}

    public void watch(int w){

        System.out.println(companies.get(w).getName()+" "+companies.get(w).getStock()+" "+
                stocks.get(w).getPrice()+" "+stocks.get(w).getExchange());

    }

    public void  out(int out)
    {System.out.println(stocks.get(out).getName()+" "+stocks.get(out).getType()+" "+stocks.get(out).getCompany()
            +" "+stocks.get(out).getPrice());

    }


}

