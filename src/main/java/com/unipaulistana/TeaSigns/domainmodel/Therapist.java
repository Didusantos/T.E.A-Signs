package com.unipaulistana.TeaSigns.domainmodel;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "TBL_THERAPIST")
@PrimaryKeyJoinColumn(name = "user_id")
public class Therapist extends User{

    private @Getter @Setter String specialty;
    private @Getter @Setter String crp;

    @ManyToMany(mappedBy = "therapists")
    private @Getter @Setter List<PersonTCA> personTCA;


}
