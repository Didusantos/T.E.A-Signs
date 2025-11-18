package com.unipaulistana.TeaSigns.domainmodel;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "TBL_DEVICE")
public class Device {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private @Getter @Setter UUID id;

    @Column(name = "NAME")
    private @Getter @Setter String name;

    @Column(name = "DESCRIPTION")
    private @Getter @Setter String description;

    @Column(name = "CATEGORY")
    private @Getter @Setter String category;

    @ManyToOne
    private @Getter @Setter User user;
}
