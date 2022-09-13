package com.PruebaTec.prueba.models;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table (name="clientes")
@ToString @EqualsAndHashCode

public class Clientes {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Getter @Setter @Column(name="id")
    private long id;

    @Getter @Setter @Column(name="idtpidentcliente")
    private long idtpidentcliente;

    @Getter @Setter @Column(name="numidentcliente")
    private String numidentcliente;

    @Getter @Setter @Column(name="nombre1")
    private String nombre1;

    @Getter @Setter @Column(name="nombre2")
    private String nombre2;

    @Getter @Setter @Column(name="apellido1")
    private String apellido1;

    @Getter @Setter @Column(name="apellido2")
    private String apellido2;

    @Getter @Setter @Column(name="direccionresid")
    private String direccionresid;

    @Getter @Setter @Column(name="numcelular")
    private String numcelular;

    @Getter @Setter @Column(name="email")
    private String email;

    @Getter @Setter @Column(name="idplan")
    private long idplan;

    @Getter @Setter @Column(name="fecnacimiento")
    private LocalDate fecnacimiento;
}