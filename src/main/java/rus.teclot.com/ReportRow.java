package rus.teclot.com;

import java.lang.String;

public class ReportRow{
    private String tenderName;
    private String country;
    private String organizator;
    private String participant;
    private String billing;
    private String status;
    private String winner;
    private String amountStatus;
    private String currency;
    private String sellPrice;
    private String freeWithVat;
    private String incomeBalance;
    private String outcomeBalance;
    private String blockedAmount;
    private String discount;

    public String getTenderName() {
        return tenderName;
    }

    public void setTenderName(String tenderName) {
        this.tenderName = tenderName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getOrganizator() {
        return organizator;
    }

    public void setOrganizator(String organizator) {
        this.organizator = organizator;
    }

    public String getParticipant() {
        return participant;
    }

    public void setParticipant(String participant) {
        this.participant = participant;
    }

    public String getBilling() {
        return billing;
    }

    public void setBilling(String billing) {
        this.billing = billing;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getWinner() {
        return winner;
    }

    public void setWinner(String winner) {
        this.winner = winner;
    }

    public String getAmountStatus() {
        return amountStatus;
    }

    public void setAmountStatus(String amountStatus) {
        this.amountStatus = amountStatus;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(String sellPrice) {
        this.sellPrice = sellPrice;
    }

    public String getFreeWithVat() {
        return freeWithVat;
    }

    public void setFreeWithVat(String freeWithVat) {
        this.freeWithVat = freeWithVat;
    }

    public String getIncomeBalance() {
        return incomeBalance;
    }

    public void setIncomeBalance(String incomeBalance) {
        this.incomeBalance = incomeBalance;
    }

    public String getOutcomeBalance() {
        return outcomeBalance;
    }

    public void setOutcomeBalance(String outcomeBalance) {
        this.outcomeBalance = outcomeBalance;
    }

    public String getBlockedAmount() {
        return blockedAmount;
    }

    public void setBlockedAmount(String blockedAmount) {
        this.blockedAmount = blockedAmount;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "ReportRow{" +
                "tenderName='" + tenderName + '\'' +
                ", country='" + country + '\'' +
                ", organizator='" + organizator + '\'' +
                ", participant='" + participant + '\'' +
                ", billing='" + billing + '\'' +
                ", status='" + status + '\'' +
                ", winner='" + winner + '\'' +
                ", amountStatus='" + amountStatus + '\'' +
                ", currency='" + currency + '\'' +
                ", sellPrice='" + sellPrice + '\'' +
                ", freeWithVat='" + freeWithVat + '\'' +
                ", incomeBalance='" + incomeBalance + '\'' +
                ", outcomeBalance='" + outcomeBalance + '\'' +
                ", blockedAmount='" + blockedAmount + '\'' +
                ", discount='" + discount + '\'' +
                '}';
    }
}