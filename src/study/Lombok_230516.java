package study;

import java.util.Date;

public class Lombok_230516 {

    private String lombok_id;

    private String lombok_name;

    private Date created_time;

    private int lombok_count;

    public String getLombok_id() {
        return lombok_id;
    }

    public void setLombok_id(String lombok_id) {
        this.lombok_id = lombok_id;
    }

    public String getLombok_name() {
        return lombok_name;
    }

    public void setLombok_name(String lombok_name) {
        this.lombok_name = lombok_name;
    }

    public Date getCreated_time() {
        return created_time;
    }

    public void setCreated_time(Date created_time) {
        this.created_time = created_time;
    }

    public int getLombok_count() {
        return lombok_count;
    }

    public void setLombok_count(int lombok_count) {
        this.lombok_count = lombok_count;
    }

    @Override
    public String toString() {
        return "Lombok_230516{" +
                "lombok_id='" + lombok_id + '\'' +
                ", lombok_name='" + lombok_name + '\'' +
                ", created_time=" + created_time +
                ", lombok_count=" + lombok_count +
                '}';
    }

}

