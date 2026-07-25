import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

class AppointmentScheduler {
    private static final DateTimeFormatter DATE_TIME_FORMATTER = 
        DateTimeFormatter.ofPattern("M/dd/yyyy HH:mm:ss");
    
    private static final DateTimeFormatter DESCRIPTION_FORMATTER = 
        DateTimeFormatter.ofPattern(
            "'You have an appointment on' EEEE, MMMM d, yyyy, 'at' h:mm a.", 
            Locale.US
        );

    public LocalDateTime schedule(String appointmentDateDescription) {
        return LocalDateTime.parse(
            appointmentDateDescription,
            DATE_TIME_FORMATTER
        );
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        return LocalDateTime.now().isAfter(appointmentDate); 
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        int hour = appointmentDate.getHour();
        return  hour >= 12 && hour < 18;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        return appointmentDate.format(
            DESCRIPTION_FORMATTER
        );
    }

    public LocalDate getAnniversaryDate() {
        return LocalDate.now().withMonth(9)
                              .withDayOfMonth(15);
    }
}
