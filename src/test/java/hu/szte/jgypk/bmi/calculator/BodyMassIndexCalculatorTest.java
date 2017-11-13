package hu.szte.jgypk.bmi.calculator;

import hu.szte.jgypk.bmi.calculator.data.UnitType;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

/**
 * Unit test for {@link BodyMassIndexCalculator}.
 * @author Szabó Tamás
 */
public class BodyMassIndexCalculatorTest {

    private BodyMassIndexCalculator calculator = new BodyMassIndexCalculator();

    @DataProvider
    public static Object[][] unitTypeBasedDataProvider() {
        return new Object[][] {
                {1.8, 60.0, UnitType.SI, 18.52},
                {70.0, 160.0, UnitType.USC, 22.96},
                {-112.0, 50.0, UnitType.SI, -1},
                {10.0, -123.0, UnitType.USC, -1}
        };
    }

    @Test(dataProvider =  "unitTypeBasedDataProvider")
    public void shouldReturnBodyMassIndexForUnitType(double height, double mass, UnitType unitType, double expectedBodyMassIndex) {
        double actualBodyMassIndex = calculator.calculate(height, mass, unitType);
        assertEquals(actualBodyMassIndex, expectedBodyMassIndex);
    }

}