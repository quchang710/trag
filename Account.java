public class Account {
        private String id;
        private String name;
        private double balance;

        public Account(String id, String name, double balance) {
            this.id = id;
            this.name = name;
            this.balance = balance;
        }


        public String getId() {
            return id;
        }


        public String getName() {
            return name;
        }


        public double getBalance() {
            return balance;
        }


        public void credit(double amount) {
            balance += amount;
        }


        public void debit(double amount) {
            if (amount <= balance) {
                balance -= amount;
            } else {
                System.out.println("Số dư không đủ");
            }
        }


        public void transferTo(Account anotherAccount, double amount) {
            if (amount <= balance) {
                this.debit(amount);
                anotherAccount.credit(amount);
            } else {
                System.out.println("Số dư không đủ để chuyển");
            }
        }


        @Override
        public String toString() {
            return "Account[id=" + id + ", name=" + name + ", balance=" + balance + "]";
        }
    }


