package semester;


public class Semester {
    private EPOCH epoch;
    private Integer year;

    public Semester(EPOCH epoch, Integer year) {
        this.epoch = epoch;
        this.year = year;
    }

    @Override
    public int hashCode(){
        String epochString = (epoch == EPOCH.SUMMER) ? "summer" : "winter";
        String yearString = String.valueOf(year);
        return (epochString + yearString).hashCode();
    }

    @Override
    public String toString() {
        return "Semester{" +
                "epoch=" + epoch +
                ", year=" + year +
                '}';
    }
}
