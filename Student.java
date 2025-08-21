package com.sa;

import jakarta.persistence.*;

@Entity
@Table(name="student_data")
public class Student {
    @Id
    @Column(name = "s_id")
    private int id;
    @Column(name = "s_name")
    private String name;
    private String loc;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", loc='" + loc + '\'' +
                '}';
    }
}
