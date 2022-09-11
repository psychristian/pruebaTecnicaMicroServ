package com.PruebaTec.prueba.models;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.*;

@Entity
@Table (name="tiposidentificacion")
@ToString @EqualsAndHashCode

public class TipIdentif {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Getter @Setter @Column(name="id")
    private long id;

    @Getter @Setter @Column(name="codtpident")
    private String codtpident;

    @Getter @Setter @Column(name="desctpident")
    private String desctpident;
}