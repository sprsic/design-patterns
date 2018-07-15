package adapter;

public class XPayImpl implements XPay {
    private String creditCardNo;
    private String customerName;
    private String customerLastName;
    private int cardExpMonth;
    private int cardExpYear;
    private Double amount;
    private String cvv;

    @Override
    public String getCreditCardNo() {
        return this.creditCardNo;
    }

    @Override
    public String getCustomerName() {
        return this.customerName;
    }

    @Override
    public String getCustomerLastName() {
        return this.customerLastName;
    }

    @Override
    public int getCardExpMonth() {
        return this.cardExpMonth;
    }

    @Override
    public String getCvv() {
        return this.cvv;
    }

    @Override
    public Double getAmount() {
        return this.amount;
    }

    @Override
    public void setCreditCardNo(String creditCardNo) {
        this.creditCardNo = creditCardNo;
    }

    @Override
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }


    @Override
    public void setCustomerFullName(String lastName) {
        this.customerLastName = lastName;
    }

    @Override
    public void setCardExpMonth(int cardExpMonth) {
        this.cardExpMonth = cardExpMonth;
    }

    @Override
    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    @Override
    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
