package gopartner.entity;

import com.google.common.collect.Lists;
import com.sun.javafx.beans.IDProperty;
import gopartner.enums.AgeGroup;
import gopartner.enums.Gender;
import gopartner.enums.Tag;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class User implements Serializable{
    @Id
    private long id;
    @Column
    private String name;
    @Enumerated
    @Column
    private Gender gender;
    @ElementCollection(targetClass = Tag.class)
    @Enumerated(EnumType.STRING)
    @OrderColumn
    private List<Tag> tags;
    @Enumerated
    @Column
    private AgeGroup ageGroup;
    @ManyToMany(cascade = CascadeType.ALL)
    @OrderColumn
    private List<Movie> perspectiveMovie;
    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn
    private LatLong latLong;

    public Long calculateTagMatch(Tag[] tags) {
        List<Tag> inputTags = Lists.newArrayList(tags);
        List<Tag> thisTags = Lists.newArrayList(this.tags);
        return (Long) inputTags.stream().filter(thisTags::contains).count();
    }

}
