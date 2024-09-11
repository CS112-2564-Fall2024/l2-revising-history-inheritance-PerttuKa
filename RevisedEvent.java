public class RevisedEvent extends HistoricalEvent {
    private String revisedDescription;
    private String citation;

    public RevisedEvent() {
        super();
        this.revisedDescription = "None";
        this.citation = "None";
    }

    public RevisedEvent(String description, Date date, String revisedDescription, String citation) {
        super(description, date);
        
        this.revisedDescription = revisedDescription;
        this.citation = citation;
    }
    
    public void setCitation(String citation) {
        this.citation = citation;
    }

    public void setRevisedDescription(String revisedDescription) {
        this.revisedDescription = revisedDescription;
    }

    public String getCitation() {
        return this.citation;
    }

    public String getRevisedDescription() {
        return this.revisedDescription;
    }

    @Override
    public String toString() {
        String superString = super.toString();
        return superString + '\n' + this.revisedDescription + '\n' + this.citation;
    }

    @Override
    public void teach() {
        System.out.println("\n====================================================");
        System.out.println("REVISED HISTORICAL EVENT EXAMPLE:");
        System.out.println("====================================================");
        System.out.println(this.toString());
    }

}