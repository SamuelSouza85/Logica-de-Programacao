package Dia025.Dates.Teste;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjusterTeste {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        now = now.with(ChronoField.DAY_OF_MONTH, 4);
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        System.out.println("--------------------------");

        now = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.WEDNESDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        System.out.println("--------------------------");

        now = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        System.out.println("--------------------------");

        now = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.WEDNESDAY));
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        System.out.println("--------------------------");

        now = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        System.out.println("--------------------------");

        now = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        System.out.println("--------------------------");

        now = LocalDate.now().with(TemporalAdjusters.firstDayOfNextYear());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        System.out.println("--------------------------");

        now = LocalDate.now().with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
    }
}
