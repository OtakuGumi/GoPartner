package gopartner.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Movie implements Serializable {
    @Getter
    @Id
    private long id;
    @Getter
    @Setter
    @Column
    private String name;
    @Getter
    @Setter
    @Column
    private String movieID;
    @Getter
    @Setter
    @ManyToMany
    @OrderColumn
    private User[] users;
}
