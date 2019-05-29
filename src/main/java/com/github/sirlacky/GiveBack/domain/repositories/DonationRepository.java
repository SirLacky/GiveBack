package com.github.sirlacky.GiveBack.domain.repositories;

import com.github.sirlacky.GiveBack.domain.model.Donation;
import com.github.sirlacky.GiveBack.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DonationRepository extends JpaRepository<Donation,Long> {

}
