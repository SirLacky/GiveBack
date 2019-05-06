package com.github.sirlacky.GiveBack.domain.model;


import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "donation")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Donation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToOne
    private User users;
    @ManyToOne
    private Company company;

}
