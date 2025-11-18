package com.unipaulistana.TeaSigns.domainmodel;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "TBL_PERSON_TCA")
@PrimaryKeyJoinColumn(name = "user_id")
public class PersonTCA extends User{

    private @Getter @Setter String suportLevel;

    @ManyToOne
    @JoinColumn(name = "guardian_id")
    private @Getter @Setter Guardian guardian;

    @ManyToMany
    @JoinTable(name = "TBL_PERSONTCA_THERAPISTS",
            joinColumns = @JoinColumn(name = "person_tca_id"),
            inverseJoinColumns = @JoinColumn(name = "therapist_id"))
    private @Getter @Setter List<PersonTCA> therapists;

    @OneToMany(mappedBy = "user")
    private @Getter @Setter Set<Device> device;

    @OneToMany(mappedBy = "user")
    private @Getter @Setter Set<Crisis> crisis;

    @OneToMany(mappedBy = "personTCA")
    private @Getter @Setter List<Alert> alert;
}
