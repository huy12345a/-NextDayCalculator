package tests;

import day.NextDayCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class tests {

    @Test
    public void testNextDay() {
        assertEquals("2/12/2020", NextDayCalculator.calculateNextDay(1, 12, 2020));
        assertEquals("23/3/2024", NextDayCalculator.calculateNextDay(22, 3, 2024));
    }
    @Test
    public void testNextDay1() {
        assertEquals("1/1/2021", NextDayCalculator.calculateNextDay(31, 12, 2020));
    }
    @Test
    public void testNextDaymonth2() {
        assertEquals("1/3/2024", NextDayCalculator.calculateNextDay(29, 2, 2024));

    }

}