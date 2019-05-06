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
    private String type;
    private Integer numberOfBags;
    private String localizationOfDonation;
    private String [] donationReciver;
    private String pickUpStreet;
    private String pickUpCity;
    private String pickUpZIP;
    private Integer pickUpPhoneNumber;
    private String pickUpDate;
    private String pickUpHour;
    private String pickUpObjectives;
    @ManyToOne
    private User users;
    @ManyToOne
    private Company company;

}
