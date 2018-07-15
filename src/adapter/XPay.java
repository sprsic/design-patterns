package adapter;

public interface XPay {

    String getCreditCardNo();

    String getCustomerName();

    String getCustomerLastName();

    int getCardExpMonth();

    String getCvv();

    Double getAmount();

    void setCreditCardNo(String creditCardNo);

    void setCustomerName(String customerName);

    void setCustomerFullName(String lastName);

    void setCardExpMonth(int cardExpMonth);

    void setCvv(String cvv);

    void setAmount(Double amount);
}
