import java.util.ArrayList;

public class StockHolders{
    ArrayList<StockHolder>stockHolders=new ArrayList<>();
    ArrayList<Stock>stocks=new ArrayList<>();
    ArrayList<Company> companies=new ArrayList<>();

    public  void buy_S(Stock stock, StockHolder S_holder, String S_status, Company company){
        StockHolder holder = new StockHolder();
        holder.setS_name(stock.getName());
        holder.setName(S_holder.getName());
        holder.setStockComp(company.getName());
        holder.setStockStatus(S_status);
        holder.setStockType(stock.getType());
holder.setComp_type(company.getType());
        stockHolders.add(holder);
    }
    public void watch(Company Comp,int w){

if (Comp.getType().equals("private")){

System.out.println("You cant watch exchange in private company  "+stockHolders.get(w).getName()+" "+companies.get(w).getName()+" "+companies.get(w).getType()
        +" "+stocks.get(w).getName()+" "+stocks.get(w).getType() +" "+ stocks.get(w).getPrice());

}
if (Comp.getType().equals("public")){

    System.out.println(stockHolders.get(w).getName()+" "+companies.get(w).getName()+" "+companies.get(w).getType()
            +" "+stocks.get(w).getName()+" "+stocks.get(w).getType() +" "+ stocks.get(w).getPrice()+" "+
            stocks.get(w).getExchange());

}

    }

    public void  out(int out)
    {
        System.out.println(stockHolders.get(out).getName()+" "+stockHolders.get(out).getStockComp()
                +" "+stockHolders.get(out).getStockStatus()+" "+stockHolders.get(out).getStockType());

    }

}
