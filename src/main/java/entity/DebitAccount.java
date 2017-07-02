package entity;

import javax.persistence.Entity;

@Entity
public class DebitAccount extends Account {
    private Integer overdraftFee;

    public Integer getOverdraftFee() {
        return overdraftFee;
    }

    public void setOverdraftFee(Integer overdraftFee) {
        this.overdraftFee = overdraftFee;
    }
}
