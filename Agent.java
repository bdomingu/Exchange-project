class Agent extends Client {

    Client values = new Client();

    public void BuyBTC() {
        System.out.println("This is the buy option");
        System.out.println("Purchases $100 of BTC:" + ' ' + values.updateBTCBalance(100, true));
        System.out.println("Purchases $860 of ETH:" + ' ' + values.updateETHBalance(860, true));
        System.out.println("Purchases $80 of BNB:" + ' ' + values.updateBNBBalance(80, true));
        System.out.println("Subtracts $150 off the USD Balance:" + values.updateUSDBalance(150, "buy"));

    }

    public void SellBTC() {
        System.out.println("This is the sell option");
        System.out.println("Sells 1 bitcoin:" + ' ' + values.updateBTCBalance(1, false));
        System.out.println("Sells .2 Ethereum:" + ' ' + values.updateETHBalance(.2, false));
        System.out.println("Sells .35 BNB:" + ' ' + values.updateBNBBalance(.35, false));
        System.out.println(
                "Sells .11 BTC and adds it to the USD Wallet:" + ' ' + values.updateUSDBalance(.11, "sellBTC"));
        System.out
                .println("Sells .5 ETH and adds it to the USD Wallet:" + ' ' + values.updateUSDBalance(.5, "sellETH"));
        System.out.println(
                "Sells .02 BNB and adds it to the USD Wallet:" + ' ' + values.updateUSDBalance(.02, "sellBNB"));

    }

}
