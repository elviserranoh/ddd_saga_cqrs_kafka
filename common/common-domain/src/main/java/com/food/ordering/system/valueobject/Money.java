package com.food.ordering.system.valueobject;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class Money {
    private final BigDecimal value;

    public static final Money ZERO = new Money(BigDecimal.ZERO);

    public Money(BigDecimal value) {
        this.value = value;
    }

    public Boolean isGreaterThanZero() {
        return value != null && value.compareTo(BigDecimal.ZERO) > 0;
    }

    public Boolean isGreaterThan(Money mony) {
        return value != null && value.compareTo(mony.value()) >= 0;
    }

    public Money add(Money mony) {
        return new Money(setScale(this.value.add(mony.value())));
    }

    public Money subtract(Money mony) {
        return new Money(setScale(this.value.subtract(mony.value())));
    }

    public Money multiply(int multiplier) {
        return new Money(setScale(this.value.multiply(new BigDecimal(multiplier))));
    }

    private BigDecimal setScale(BigDecimal input) {
        return input.setScale(2, RoundingMode.HALF_EVEN);
    }

    public BigDecimal value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Money mony = (Money) o;
        return Objects.equals(value, mony.value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }

}
