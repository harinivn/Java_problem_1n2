package Interface;


import java.util.ArrayList;
import java.util.List;

class Bank {
    private List accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void removeAccount(Account account) {
        accounts.remove(account);
    }

    public void deposit(Account account, double amount) {
        account.deposit(amount);
    }

   public void withdraw(Account account, double amount) {
        account.withdraw(amount);
    }

    
}

