package projeto_2;

/**
 *
 * @author cruzb
 */
public class CreditCard {

    private String customer;
    private String bank;
    private String account;
    private int limit;
    protected double balance;
    
    public CreditCard(String cust, String bk, String acnt, int lim, double initialBal){ // construtor 1 
        customer = cust;
        bank = bk;
        account = acnt;
        limit = lim;
        balance = initialBal;
    }
    
    public CreditCard(String cust, String bk, String acnt, int lim){ // construtor 2
        this(cust, bk, acnt, lim, 0.0); // utiliza um outro construtor definido na classe
    }
    
    public String getCustumer(){ // devolve o nome do cliente
        return customer;
    }
    
    public String getBank(){ // devolve o banco
        return bank;
    }
    
    public String getAccount(){ // devolve a conta
        return account;
    }
    
    public int getLimit(){ // devolve o limite
        return limit;
    }
    
    public double getBalance(){ // devolve o saldo atual
        return balance;
    }
    
    // Faz uma compra/carrega o cartão, se não ultrapassar o limite
    public boolean charge(double price){
        if (balance + price > limit){
            System.out.println("Compra recusada: excede o limite de " + limit);
            return false;
        } else {
            balance += price;
            return true;
        }
    }
    
    // Faz um pagamento, reduzindo o saldo em dívida
    public void makePayment(double payment){
        balance -= payment;
    }
    
    @Override
    public String toString(){
        return "Cliente: " + customer + ", Banco: " + bank + ", Conta: " + account
                + ", Limite: " + limit + ", Saldo: " + balance;
    }
    
    public static void main(String[] args) {
        CreditCard cartao1 = new CreditCard("Beatriz Cruz", "CGD", "PT001", 1000, 100.0);
        CreditCard cartao2 = new CreditCard("João Silva", "Millennium", "PT002", 500);

        System.out.println(cartao1);
        System.out.println(cartao2);

        cartao1.charge(200.0);
        System.out.println("Depois de compra de 200: " + cartao1);

        cartao1.makePayment(50.0);
        System.out.println("Depois de pagamento de 50: " + cartao1);

        cartao2.charge(600.0); // deve ser recusado, excede o limite de 500
        System.out.println("Depois de tentativa de compra excessiva: " + cartao2);
    }
}