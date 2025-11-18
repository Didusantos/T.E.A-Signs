package com.unipaulistana.TeaSigns.domainmodel;


import jakarta.persistence.*;
import jakarta.validation.constraints.Pattern;
import lombok.*;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "TBL_ALERT")
public class Alert {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private @Getter @Setter UUID id;

    @Column(name = "TITTLE")
    private @Getter @Setter String title;

    @Column(name = "TYPE")
    @Pattern(regexp = "FISICO|COMPORTAMENTAL|AMBIENTAL")
    private @Getter @Setter String type;

    @Column(name = "STATUS")
    @Pattern(regexp = "PENDENTE|EM ANDAMENTO|FINALIZADO")
    private @Getter @Setter String status;

    @Column(name = "CREATED_AT")
    private @Getter @Setter LocalDate createdAt;

    @Column(name = "SUGGESTED_ACTION")
    private @Getter @Setter String suggestedAction;

    @ManyToOne
    @JoinColumn(name = "person_tca_id", nullable = false)
    private @Getter @Setter PersonTCA personTCA;

    @ManyToOne
    @JoinColumn(name = "device_id")
    private @Getter @Setter Device device;
}
