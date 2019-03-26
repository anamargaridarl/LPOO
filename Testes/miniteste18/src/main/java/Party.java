import java.util.ArrayList;
import java.util.List;

public class Party extends Event {

    private List<Event> events;

    public Party(String title) {
        super(title);
        events =  new ArrayList<>();
    }

    public Party(Event e) {
        super(e);
        events =  new ArrayList<>();
    }

    public Party(String title, String date, String description) {
        super(title, date, description);
        events =  new ArrayList<>();
    }

    public Party(String title, String date) {
        super(title, date);
        events =  new ArrayList<>();
    }

    public void addEvent(Event e) {
        events.add(e);
        addAudience(e.getAudienceCount());
    }


}
