public class Client {

    public double bitcoinPrice = 41710.57d;
    public double usdWallet = 21000.00d;
    public double BTCWallet = .25;
    public double ETHPrice = 2400.87;
    public double BNBPrice = 384.85;

    public double updateBTCBalance(double x, boolean purchase) {
        boolean buy = purchase;

        if (buy) {
            double BTCBalance = x / bitcoinPrice;
            return BTCBalance;

        } else {
            double BTCSellPrice = x * bitcoinPrice;
            return BTCSellPrice;
        }
    }

    public double updateETHBalance(double x, boolean purchase) {
        boolean buy = purchase;

        if (buy) {
            double ETHBalance = x / ETHPrice;
            return ETHBalance;

        } else {
            double ETHSellPrice = x * ETHPrice;
            return ETHSellPrice;
        }

    }

    public double updateBNBBalance(double x, boolean purchase) {
        boolean buy = purchase;

        if (buy) {
            double BNBBalance = x / BNBPrice;
            return BNBBalance;

        } else {
            double BNBSellPrice = x * BNBPrice;
            return BNBSellPrice;
        }

    }

    public double updateUSDBalance(double y, String input) {

        String transaction = input;
        switch (transaction) {
            case "buy":
                double USDBal1 = usdWallet - y;
                return USDBal1;

            case "sellBTC":
                double USDBal2 = usdWallet + (y * bitcoinPrice);
                return USDBal2;

            case "sellETH":
                double USDBal3 = usdWallet + (y * ETHPrice);
                return USDBal3;

            case "sellBNB":
                double USDBal4 = usdWallet + (y * BNBPrice);
                return USDBal4;

        }

        return y;

    }

}
