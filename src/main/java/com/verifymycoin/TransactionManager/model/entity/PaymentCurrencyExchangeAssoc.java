package com.verifymycoin.TransactionManager.model.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
@Table(name = "payment_currency_exchange_assoc")
public class PaymentCurrencyExchangeAssoc {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(targetEntity = PaymentCurrency.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "symbol", nullable = false)
    private PaymentCurrency paymentCurrency;

    @ManyToOne(targetEntity = Exchange.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "exchange_id", nullable = false)
    private Exchange exchange;
}
