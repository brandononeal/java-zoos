package com.lambdaschool.zoos.models;

import javax.persistence.*;

@Entity
@Table(name = "telephones")
public class Telephone
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long phoneid;

    private String phonetype;
    private String phonenumber;
}
