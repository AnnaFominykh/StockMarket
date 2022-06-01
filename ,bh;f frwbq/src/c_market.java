import java.util.ArrayList;

public class c_market {

    ArrayList<Stock> stocks = new ArrayList<>();
    ArrayList<Company> companies = new ArrayList<>();
    ArrayList<StockHolder> stockHolders = new ArrayList<>();

    StockMarket S = new StockMarket();
    StockHolders H = new StockHolders();
    Companies C = new Companies();

    void addComp(StockHolder holder, String name, String type, String stock) {
        companies.add( S.addComp(name,type,stock);
    }

    void StockHolder(String name) {
        S.addStockHolder(name);
    }

    void addStock(String name, String type, Company company, int price) {
        S.addStock(name, type, company,price);
    }

    public void exchange(int price, int new_price, int exchange) {
        S.exchange(price, new_price ,exchange);
    }

    public void watch(int w) {
        S.watch(w);
    }

    public void buy_S(Stock stock, StockHolder S_holder, String S_status, Company company) {
        H.buy_S(stock, S_holder, S_status, company);
    }

    public void watch(Company Comp, int w) {

        H.watch(Comp, w);

    }

    public void sell(StockHolder holder, String name, String type, Stock stock) {
        C.sell(holder, name, type, stock);
    }


    public void prAllS() {
        for (int S = 0; S < stocks.size(); S++) {
            System.out.println(stocks.get(S).getName() + " " + stocks.get(S).getType() + " " + stocks.get(S).getCompany()
                    + " " + stocks.get(S).getPrice());
        }
    }

    public void prAllH() {
        for (int S = 0; S < stockHolders.size(); S++) {
            System.out.println(stockHolders.get(S).getName() + " " + stockHolders.get(S).getStockComp()
                    + " " + stockHolders.get(S).getStockStatus() + " " + stockHolders.get(S).getStockType());

        }
    }

    public void prAllC() {
        for (int S = 0; S < companies.size(); S++) {
            System.out.println(companies.get(S).getName() + " " + companies.get(S).getStock() + " " +
                    companies.get(S).getType() + " " + companies.get(S).getStockholder());

        }

    }
}





