package gopartner.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
public class Movie implements Serializable {
    @Id
    private Long movieID;
    @Column
    private String name;
    @Column
    private String description;
}
