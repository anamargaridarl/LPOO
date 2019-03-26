import java.util.ArrayList;
import java.util.List;

public class Event {

    private String title;
    private String date;
    private String description;
    private List<Person> people;
    private int audienceCount;


    public Event(String title) {
        this.title = title;
        date = "";
        description ="";
        audienceCount = 0;
        people =  new ArrayList<>();
    }

    public Event(Event e) {
        this.title = e.getTitle();
        this.description = e.getDescription();
        this.date = e.getDate();
        audienceCount = 0;
        people =  new ArrayList<>();
    }

    public Event(String title, String date, String description) {
        this.title = title;
        this.date = date;
        this.description = description;
        audienceCount = 0;
        people =  new ArrayList<>();
    }

    public Event(String title, String date) {
        this.title = title;
        this.date = date;
        description = "";
        audienceCount = 0;
        people =  new ArrayList<>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString()
    {
        return title + " is a " + description + " and will be held at " + date + ".";
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;

        if (o == null) return false;

        if (getClass() != o.getClass()) return false;

        Event p = (Event) o;
        if(title == p.getTitle()) {
            if (date == p.getDate()) {
                if (description == p.getDescription())
                    return true;
            }
        }

        return false;
    }

    public void addPerson(Person a) {

        for(Person people: people)
        {
            if(people.getName() == a.getName())
                return;

        }

        System.out.printf("ola \n");
        audienceCount += 1;
        people.add(a);
    }


    public void addAudience(int nmb)
    {
        audienceCount += nmb ;
    }

    public int getAudienceCount() {
        return audienceCount;
    }


}
