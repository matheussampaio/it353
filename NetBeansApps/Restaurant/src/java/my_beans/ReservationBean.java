/*
 NOT USED
 */

package my_beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
/**
 *
 * @author Chris
 */

@ManagedBean(name = "ReservationBean")
@SessionScoped
public class ReservationBean {
    private String store ="";
    private String name="";
    private String date="";
    private String hour="";
    private String minute="";
    private String numGuest="";
    private String time="";

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    public String getMinute() {
        return minute;
    }

    public void setMinute(String minute) {
        this.minute = minute;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumGuest() {
        return numGuest;
    }

    public void setNumGuest(String numGuest) {
        this.numGuest = numGuest;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    

}
