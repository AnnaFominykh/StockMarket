import java.util.ArrayList;

public class Main {
    void addS(String name, String type, Company company, int price){

    }
    public void main(String []args){
        ArrayList<Stock> stocks=new ArrayList<>();
        ArrayList<Company> companies=new ArrayList<>();
        ArrayList<StockHolder>stockHolders=new ArrayList<>();

        StockMarket S = new StockMarket();
        StockHolders H = new StockHolders();
        Companies C = new Companies();
        c_market M = new c_market();

        S.addStockHolder("SH1");
        S.addStockHolder("SH1");
 S.addComp("comp1","private","A");
 S.addComp("comp2","public","B");
 S.addStock("A","Usual", companies.get(), 100);
S.addStock("B","Privileged", companies.get(1).getName(),100);

        M.prAllS();
        M.prAllH();
        M.prAllC();
  H.buy_S(stocks.get(0).getName(),stockHolders.get(0).getName(),"Bought",companies.get(0).getName(),);

    }
}
