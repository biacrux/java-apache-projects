/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projeto_2;

/**
 *
 * @author cruzb
 */
public class CreditCard {

    private String customer;
    private String bank;
    private String account;
    private int limit ;
    protected double balance;
    
    public CreditCard(String cust, String bk, String acnt, int lim, double initialBal){ // contrutor 1 
        customer=cust;
        bank= bk;
        account= acnt;
        limit= lim;
        balance= initialBal;
    }
    
    public CreditCard(String cust, String bk , String acnt, int lim){// construtor 2
        this(cust, bk, acnt, lim , 0.0);//utiliza um outri construtor defenido na classe
    }
    
    public String getCustumer(){// quero saber o nome do cliente
        return customer;
    }
    
    public String getBank(){// quero saber o nome do cliente
        return bank;
    }
    
    public String getAccount(){// quero saber o nome do cliente
        return account;
    }
    
    public String getLimit(){// quero saber o nome do cliente
        return limit;
    }
    
    1
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
