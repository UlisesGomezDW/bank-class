class Account{
  private String number;
  private double balance;
  private String startDate;
  private Card[] cards;

  public Account(){}

  public Account(String number, double balance, String startDate, int numberOfCards){
    this.number = number;
    this.balance = balance;
    this.startDate = startDate;
    this.cards = new Card[numberOfCards];
  }

  public void setNumber(String number){
      this.number = number;
  }

  public void setBalance(double balance){
      this.balance = balance;
  }

  public void setStartDate(String startDate){
      this.startDate = startDate;
  }

   public void setCards(Card[] card){
      this.cards = card;
  }
  
  public String getNumber(){
    return this.number;
  }

  public double getBalance(){
    return this.balance;
  }

  public String getStartDate(){
    return this.startDate;
  }

  public Card[] getCards(){
    return this.cards;
  }

  public void addCard(Card item, int position){
    this.cards[position] = item;
  }
  
  public void convertToString(){
    int max = this.cards.length;
    System.out.println("--");
    System.out.println("-Numero:" + this.number + "\n-Fecha de apertura" + this.startDate + "\n-Saldo:" + this.balance);
    if( max > 0){
      System.out.println("\nTiene ("+ max +") tarjetas.");
      for(int i = 0; i < max; i++){
          this.cards[i].convertToString();
      }
    }else{
      System.out.println("\nCuenta sin tarjetas.");
    }
    System.out.println("\n--");
  }
}