package hu.szte.jgypk.bmi.calculator;

import hu.szte.jgypk.bmi.calculator.data.UnitType;
import com.google.common.primitives.Doubles;

import java.text.DecimalFormat;

/**
 * Calculates a body mass index based on a person's mass and weight.
 * Two types of unit types can be set for the calculator.
 * The SI based calculates the index for
 *  - height: meters
 *  - mass: kilograms
 * The USC based calculates the index for
 *  - height: inch
 *  - mass: pounds
 *
 *  @author Szabó Tamás
 */
public class BodyMassIndexCalculator {


    private final DecimalFormat decimalFormat = new DecimalFormat("#.00");

    public double calculate(double height, double mass, UnitType unitType) {
        double bodyMassIndex = -1;
        if(validateParams(height, mass)) {
            bodyMassIndex = unitType == UnitType.SI ? calculateIndex(height, mass)
                    : calculateUscBasedIndex(height, mass);
        }
        return Doubles.tryParse(decimalFormat.format(bodyMassIndex));

    }

    private boolean validateParams(double height, double mass) {
        return height > 0 && mass > 0;
    }

    private double calculateIndex(double height, double mass) {
        return mass / (Math.pow(height, 2));
    }

    private double calculateUscBasedIndex(double height, double mass) {
        return 703 * (calculateIndex(height, mass));
    }
}
