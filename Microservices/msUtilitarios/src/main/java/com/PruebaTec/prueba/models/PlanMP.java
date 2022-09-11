package com.PruebaTec.prueba.models;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.*;

@Entity
@Table (name="planesmp")
@ToString @EqualsAndHashCode
public class PlanMP {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Getter @Setter @Column(name="id")
    private long id;

    @Getter @Setter @Column(name="codigoplan")
    private String codigoplan;

    @Getter @Setter @Column(name="nombreplan")
    private String nombreplan;
}
