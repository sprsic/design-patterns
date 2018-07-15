package adapter;

public class XpayToWpayConvertor implements WPay {
    private XPay xpay;

    public XpayToWpayConvertor(XPay xpay, String cvv) {
        this.xpay = xpay;
        setProp(cvv);
    }

    @Override
    public String getCreditCardNo() {
        return this.getCreditCardNo();
    }

    @Override
    public String getCustomerName() {
        return this.getCustomerName();
    }

    @Override
    public int getCardExpMonth() {
        return this.xpay.getCardExpMonth();
    }

    @Override
    public Double getAmount() {
        return this.getAmount();
    }

    @Override
    public void setCreditCardNo(String creditCardNo) {
        this.xpay.setCreditCardNo(creditCardNo);
    }

    @Override
    public void setCustomerName(String customerName) {
        this.xpay.setCustomerName(customerName);
    }

    @Override
    public void setCardExpMonth(int cardExpMonth) {
        this.xpay.setCardExpMonth(cardExpMonth);
    }

    @Override
    public void setAmount(Double amount) {
        this.xpay.setAmount(amount);
    }

    // build nececery props for the xply object
    private void setProp(String cvv) {
        this.xpay.setCvv(cvv);
        this.xpay.setCustomerFullName(this.xpay.getCustomerName() + " " + this.xpay.getCustomerLastName());
    }
}
