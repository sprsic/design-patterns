package adapter;

public class WpayImpl implements WPay {
    private String creditCardNo;
    private String customerName;
    private int cardExpMonth;
    private int cardExpYear;
    private Double amount;

    @Override
    public String getCreditCardNo() {
        return this.creditCardNo;
    }

    @Override
    public String getCustomerName() {
        return this.customerName;
    }

    @Override
    public int getCardExpMonth() {
        return this.cardExpMonth;
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
    public void setCardExpMonth(int cardExpMonth) {
        this.cardExpMonth = cardExpYear;
    }

    @Override
    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
