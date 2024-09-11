public class HistoricalEvent {
    private String description;
    private Date date;

    public HistoricalEvent() {
        this.description = "None";
        this.date = new Date();
    }

    public HistoricalEvent(String description, Date date) {
        this.description = description;
        this.date = date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return this.date;
    }

    public String getDescription() {
        return this.description;
    }

    public String toString() {
        return this.date.toString() + " --- " + this.description;
    }

    public void teach() {
        System.out.println("====================================================");
        System.out.println("HISTORICAL EVENT EXAMPLE:");
        System.out.println("====================================================");
        System.out.println(this.toString());
    }
    
    public int compareTo(Object object) {
        if (object instanceof HistoricalEvent) {
            HistoricalEvent event = (HistoricalEvent) object;
            if (this.date.precedes(event.date)) {
                return -1;
            } else if (this.date.equals(event.date)) {
                return 0;
            } else {
                return 1;
            }
        }

        return -1;
    }

    
 
}