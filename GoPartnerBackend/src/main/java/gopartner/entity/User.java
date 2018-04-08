package gopartner.entity;

import com.sun.javafx.beans.IDProperty;
import gopartner.enums.AgeGroup;
import gopartner.enums.Gender;
import gopartner.enums.Tag;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class User implements Serializable{
    @Getter
    @Id
    private long id;
    @Getter
    @Setter
    @Column
    private String name;
    @Getter
    @Setter
    @Enumerated
    @Column
    private Gender gender;
    @Getter
    @Setter
    @ElementCollection(targetClass = Tag.class)
    @Enumerated(EnumType.ORDINAL)
    @OrderColumn
    private Tag[] tags;
    @Getter
    @Setter
    @Enumerated
    @Column
    private AgeGroup ageGroup;
    @Getter
    @Setter
    @ManyToMany
    @OrderColumn
    private Movie[] perspectiveMovie;
    @Getter
    @Setter
    @OneToOne
    @JoinColumn
    private LatLong latLong;
    @Getter
    @Setter
    @OneToOne
    private PreferredUser preferredUser;
}
