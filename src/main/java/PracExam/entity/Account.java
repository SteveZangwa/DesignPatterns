package PracExam.entity;

import java.util.Locale;

public class Account {
    private String accId, accName,accountType;
// constructor that handles
    private Account(Builder builder){
        this.accId = builder.accId;
        this.accName=builder.accName;
        this.accountType = builder.accountType;

    }

    @Override
    public String toString() {
        return "Account{" +
                "accId='" + accId + '\'' +
                ", accName='" + accName + '\'' +
                ", accountType='" + accountType + '\'' +
                '}';
    }

    public String getAccId() {
        return accId;
    }

    public String getAccName() {
        return accName;
    }

    public String getAccountType() {
        return accountType;
    }


    //inner class
    public class Builder {
        private String accId, accName,accountType;

        public Builder setAccId(String accId){
            this.accId = accId;
            return this;
        }


        public Builder setAccName(String accName) {
            this.accName = accName;
            return this;
        }

        public Builder setAccountType(String accountType) {
            this.accountType = accountType;
            return this;
        }
        // returns instance of a class account
        public Account build(){
            return new Account(this);
        }
        public Builder copy(Account account){
            this.accId = account.accId;
            this.accName =account.accName;
            this.accountType =account.accountType;
            return this;
        }

    }
}
