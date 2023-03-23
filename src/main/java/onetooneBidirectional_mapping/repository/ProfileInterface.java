package onetooneBidirectional_mapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import onetooneBidirectional_mapping.model.Profile;

@Repository
public interface ProfileInterface extends JpaRepository<Profile,Integer> {

}
