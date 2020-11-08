import java.util.Date;
public class EVENTOBJECT {
    private int id;
    private String message;
    private Date date;
    public EVENTOBJECT(String message, Date date) {
        this.message = message;
        this.date = date;
    }
    public EVENTOBJECT(int id, String message, Date date) {
        this.date = date;
        this.message = message;
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public String getMessage() {
        return message;
    }
    public Date getDate() {
        return date;
    }
}