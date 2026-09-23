package com.narravj.lab4db_migrationdomainmodel.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "profiles")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Profile {

    @Id
    private Long id;

    private String bio;

    @Column(name = "phone_number", length = 15)
    private String phoneNumber;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @Column(name = "loyality_points")
    private Integer loyalityPoints;

    @OneToOne
    @MapsId
    @JoinColumn(name = "id")
    private User user;
}