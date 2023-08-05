package com.project.asanaAndAirtable.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "asana")
public class Asana {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "asanaId")
    private Integer asanaId;

    @Column(name = "name")
    private String name;

    @Column(name = "assignee")
    private String assignee;

    @Column(name = "dueDate")
    private String dueDate;

    @Column(name = "description")
    private String description;

}
