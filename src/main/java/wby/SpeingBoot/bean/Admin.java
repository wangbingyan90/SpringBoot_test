package wby.SpeingBoot.bean;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Admin {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    int id;
    @Column(unique = true, nullable = false)
    String name;
    @Column(nullable = false)
    String passow;
}
