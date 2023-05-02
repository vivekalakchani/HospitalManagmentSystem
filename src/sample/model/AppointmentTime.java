package sample.model;

public class AppointmentTime {
    private String hours;
    private String minutes;

    public AppointmentTime() {
    }

    public AppointmentTime(String hours, String minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

    public String getMinutes() {
        return minutes;
    }

    public void setMinutes(String minutes) {
        this.minutes = minutes;
    }

    @Override
    public String toString() {
        return hours+":"+minutes;
    }
}
