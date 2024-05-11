package org.example.entities;
import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name="persona")
@NoArgsConstructor//constructor vacio
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Persona implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="nombre")
    private String nombre;
    @Column(name="apellido")
    private String apellido;
    @Column(name="DNI")
    private int dni;
}