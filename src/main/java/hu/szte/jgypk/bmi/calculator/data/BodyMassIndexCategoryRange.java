package hu.szte.jgypk.bmi.calculator.data;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

/**
 * Domain object to represent a range of a {@link BodyMassIndexCategory}.
 * @author Szabó Tamás
 */
public class BodyMassIndexCategoryRange {

    private double minValue;
    private double maxValue;

    public BodyMassIndexCategoryRange(double minValue, double maxValue) {
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    public double getMinValue() {
        return minValue;
    }

    public double getMaxValue() {
        return maxValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BodyMassIndexCategoryRange that = (BodyMassIndexCategoryRange) o;
        return Double.compare(that.minValue, minValue) == 0 &&
                Double.compare(that.maxValue, maxValue) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(minValue, maxValue);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("minValue", minValue)
                .add("maxValue", maxValue)
                .toString();
    }
}
