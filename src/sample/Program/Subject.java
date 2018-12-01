package sample.Program;

import java.util.ArrayList;

public class Subject {
    private String nameSubject;
    private String idSubject;
    private String status;
    private ArrayList<String> toNameSubject = new ArrayList<>();
    private ArrayList<String> toIDSubject = new ArrayList<>();
    private ArrayList<String> beforeThisSubject = new ArrayList<>();


    public Subject(String nameSubject, String idSubject, String status, ArrayList<String> toNameSubject,
                   ArrayList<String> toIDSubject, ArrayList<String> beforeThisSubject) {
        this.nameSubject = nameSubject;
        this.idSubject = idSubject;
        this.status = status;
        this.toNameSubject = toNameSubject;
        this.toIDSubject = toIDSubject;
        this.beforeThisSubject = beforeThisSubject;
    }

    public String getNameSubject() {
        return nameSubject;
    }

    public String getIdSubject() {
        return idSubject;
    }

    public String getStatus() {
        return status;
    }

    public ArrayList<String> getToNameSubject() {
        return toNameSubject;
    }

    public ArrayList<String> getToIDSubject() {
        return toIDSubject;
    }

    public ArrayList<String> getBeforeThisSubject() {
        return beforeThisSubject;
    }

    public void setNameSubject(String nameSubject) {
        this.nameSubject = nameSubject;
    }

    public void setIdSubject(String idSubject) {
        this.idSubject = idSubject;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setToNameSubject(ArrayList<String> toNameSubject) {
        this.toNameSubject = toNameSubject;
    }

    public void setToIDSubject(ArrayList<String> toIDSubject) {
        this.toIDSubject = toIDSubject;
    }

    public void setBeforeThisSubject(ArrayList<String> beforeThisSubject) {
        this.beforeThisSubject = beforeThisSubject;
    }
}
