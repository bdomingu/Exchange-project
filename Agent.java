class Agent extends Client {

    Client values = new Client();

    // remove the void and have it return a boolean
    // create an instance of client so the variables can be accessed.
    public void BuyBTC() {
        System.out.println("This is the buy option");
        System.out.println(values.updateBTCBalance(100, true));
        System.out.println(values.updateETHBalance(860, true));
        System.out.println(values.updateBNBBalance(80, true));
        System.out.println(values.updateUSDBalance(150, "buy"));

    }

    public void SellBTC() {
        System.out.println("This is the sell option");
        System.out.println(values.updateBTCBalance(1, false));
        System.out.println(values.updateETHBalance(.2, false));
        System.out.println(values.updateBNBBalance(.35, false));
        System.out.println(values.updateUSDBalance(.11, "sellBTC"));
        System.out.println(values.updateUSDBalance(.5, "sellETH"));
        System.out.println(values.updateUSDBalance(.02, "sellBNB"));

    }

}
