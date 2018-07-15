package adapter;

public interface WPay {

    String getCreditCardNo();

    String getCustomerName();

    int getCardExpMonth();

    Double getAmount();

    void setCreditCardNo(String creditCardNo);

    void setCustomerName(String customerName);

    void setCardExpMonth(int cardExpMonth);

    void setAmount(Double amount);
}
