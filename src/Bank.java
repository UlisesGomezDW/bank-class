class Bank{
  private Account[] accounts;

  public Bank(){}

  public Bank(int length){
    this.accounts = new Account[length];
  }

  public void addAccount(Account item, int position){
    this.accounts[position] = item;
  }
  
  public Account[] getAccounts(){
    return this.accounts;
  }

  public void convertToString(){
    int max = this.accounts.length;
    if(max > 0){
       for(int i = 0; i<max; i++){
        this.accounts[i].convertToString();
       } 
    }else {
        System.out.println("No hay cuentas disponibles.");
    }
  }
}