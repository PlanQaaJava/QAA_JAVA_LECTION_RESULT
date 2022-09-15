import org.testng.Assert;
import org.testng.annotations.Test;
import page.CalendarPage;

public class CalendarTest extends BaseTest{

    @Test
    public void choose9thSeptemberCurrentYear() {

        String result = new CalendarPage(getDriver())
                .clickChangeViewButton()
                .clickYearlyViewCheckbox()
                .clickSeptemberBlock()
                .click9DayOfMonth()
                .getTextMonthDayDayByWeek();

        Assert.assertEquals(result, "September 9 (Fri)");
    }
}
