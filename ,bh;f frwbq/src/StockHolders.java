import java.util.ArrayList;

public class StockHolders {
    ArrayList<StockHolder>stockHolders=new ArrayList<>();

    public  void buy_S(Stock stock, String S_status, Company company){
        StockHolder holder = new StockHolder();
        holder.setName(stock.getName());
        holder.setStockComp(company.getName());
        holder.setStockStatus(S_status);
        holder.setStockType(stock.getType());
        stockHolders.add(holder);
    }




}
