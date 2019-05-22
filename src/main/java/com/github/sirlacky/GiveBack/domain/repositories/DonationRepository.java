package com.github.sirlacky.GiveBack.domain.repositories;

import com.github.sirlacky.GiveBack.domain.model.Donation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DonationRepository extends JpaRepository<Donation,Long> {

    @Query(value = "SELECT localization_of_donation, number_of_bags, pick_up_city, pick_up_date, pick_up_hour, pick_up_objectives, pick_up_phone_number, pick_up_street, pick_upzip FROM donation JOIN users_donations ON users_donations.donations_id = donation.id JOIN users ON users.id = users_donations.user_id WHERE users.id = ?;", nativeQuery = true)
    String [] showUserDonations();

}
