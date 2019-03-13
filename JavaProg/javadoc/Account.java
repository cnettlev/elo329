///////    Account.java    ///////

/**
 * Superclass of bank account hierarchy.
 * @author Paul S. Wang
 */
public class Account     // class name
{   public Account() {}
/** 
 * Constructor Account.  Initializes a new account.  
 * @param id 	Account number
 * @param amt 	Initial balance amount
 * @param ss  	Social security number as string
 */
    public Account(int id, double amt,
                   String ss)
    {  acct_no = id; 
       acct_bal = amt;
       this.ss = ss;
    }
/**
 * Retrieves the account balance.  
 * @return the <tt>balance</tt>
 */
    public double balance()
    {    return(acct_bal);   }
/**
 * Deposits into account.  
 * @param amt   the amount to deposit, if <tt>amt <=0</tt> no effect
 */
    public void deposit(double amt)
    {   if ( amt > 0 )
	   acct_bal += amt;
    }
/** 
 * Withdraw from account.  
 * @param amt 	 the amount to deposit
 * @return       <tt>false</tt> if <tt>amt <=0</tt>
 *               or insufficient balance
 */
    public boolean withdraw(double amt)
    {    if( amt <= 0 || amt > acct_bal )
             return(false);   // failure
         acct_bal -= amt;
         return(true);
    }
/**
 * The account number de hoy.
 */
    protected int  acct_no;     // account number
/**
*  The social security number of owner.
*/
    protected String ss;        // owner ss no.

// private fields
/**
*  The account balance.
*/
    private double    acct_bal; // current balance
}
