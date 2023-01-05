public class Question36 {

    public static void main(String[] args) {
        Time time = Time.of("05:50");
        Time outputTime = time.add(Duration.of("01:31"));
        System.out.println(outputTime);
    }

    private static class Time {
        private final int hours;
        private final int minutes;
        private final String time;
        private static final int MAX_HOURS=24;
        private static final int MAX_MINUTES=60;

        private Time(int hours, int minutes) {
            this.hours = hours;
            this.minutes = minutes;
            time = hours + ":" + minutes;
        }

        private Time(String time) {
            this.time = time;
            hours = Integer.parseInt(time.split(":")[0]);
            minutes = Integer.parseInt(time.split(":")[1]);
            verifyHours(hours);
            verifyMinutes(minutes);
        }

        private void verifyMinutes(int minutes) {
            if (minutes<0 || minutes>= MAX_MINUTES)
                throw new IllegalArgumentException("Minutes must be between 0 and 60");
        }

        public static Time of(String time) {
            return new Time(time);
        }

        public static Time of(int hours, int minutes) {
            return new Time(hours, minutes);
        }

        private void verifyHours(int hours) {
            if (hours<0 || hours>= MAX_HOURS)
                throw new IllegalArgumentException("Hours must be between 0 and 24");
        }

        public Time add(Duration duration) {
            int outputHours = ((this.minutes + duration.minutes) / 60) + this.hours + duration.hours;
            int outputMinutes = (this.minutes + duration.minutes) %60 ;
            return new Time(outputHours, outputMinutes);
        }

        @Override
        public String toString() {
            return String.format("%02d:%02d", hours, minutes);
        }
    }

    private static class Duration {

        private final int hours;
        private final int minutes;
        private final String time;

        private Duration(int hours, int minutes) {
            this.hours = hours;
            this.minutes = minutes;
            this.time = hours + ":" + minutes;
        }

        private Duration(String time){
            this.time = time;
            hours = Integer.parseInt(time.split(":")[0]);
            minutes = Integer.parseInt(time.split(":")[1]);
        }

        public static Duration of(String time){
            return new Duration(time);
        }

        public static Duration of(int hours, int minutes){
            return new Duration(hours, minutes);
        }

        @Override
        public String toString() {
            return String.format("%02d:%02d", hours, minutes);
        }
    }
}
