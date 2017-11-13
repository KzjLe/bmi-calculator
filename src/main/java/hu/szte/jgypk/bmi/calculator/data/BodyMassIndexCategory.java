package hu.szte.jgypk.bmi.calculator.data;

import hu.szte.jgypk.bmi.calculator.mapper.BodyMassIndexCategoryMapper;

/**
 * Enum for body mass category for {@link BodyMassIndexCategoryMapper} to return.
 * @author Szabó Tamás
 */
public enum BodyMassIndexCategory {
    INVALID_CATEGORY,
    SEVERE_THINNESS,
    MODERATE_THINNESS,
    MILD_THINNESS,
    NORMAL,
    OVERWEIGHT,
    OBESE_CLASS_I,
    OBESE_CLASS_II,
    OBESE_CLASS_III
}
