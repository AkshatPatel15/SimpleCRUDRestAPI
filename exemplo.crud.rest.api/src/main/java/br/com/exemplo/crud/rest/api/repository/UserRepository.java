package br.com.exemplo.crud.rest.api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.exemplo.crud.rest.api.model.UserModel;
import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserModel, Integer> {

    Optional<UserModel> findByUsername(String username);

    Boolean existsByUsername(String username);

}
