package com.example.university.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document
public class Staff {
    @Id
    private Integer id;

    private Person member;

    public Staff(Integer id, Person member) {
        this.id = id;
        this.member = member;
    }

    public Integer getId() {
        return id;
    }

    public Person getMember() {
        return member;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", member=" + member +
                '}';
    }
}
