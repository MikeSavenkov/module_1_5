package com.msavenkov.patterns.behavioral.memento;

import java.util.Date;

public class File {
    private String version;
    private Date date;

    public void setVersionAndDate(String version) {
        this.version = version;
        this.date = new Date();
    }

    public Save save() {
        return new Save(version);
    }

    public void load(Save save) {
        version = save.getVersion();
        date = save.getDate();
    }

    @Override
    public String toString() {
        return "File:\n" +
                "\nVersion: " + version +
                "\nDate: " + date + "\n";
    }
}
