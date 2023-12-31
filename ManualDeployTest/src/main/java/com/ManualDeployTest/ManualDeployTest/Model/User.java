package com.ManualDeployTest.ManualDeployTest.Model;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Data
@Builder(toBuilder = true)
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "created_time")
    private Date createdTime;
}
