class Card{
  private String number;
  private String expirationDate;
  private String type;

  public Card(){}

  public Card(String number, String expirationDate, String type){
    this.number = number;
    this.expirationDate = expirationDate;
    this.type = type;
  }

  public void setNumber(String number){
      this.number = number;
  }

  public void setExpirationDate(String expiration){
      this.expirationDate = expiration;
  }

  public void setType(String type){
      this.type = type;
  }

  public void convertToString(){
    System.out.println("* "+this.number + " - " + this.type + " - " + this.expirationDate);
  }
}