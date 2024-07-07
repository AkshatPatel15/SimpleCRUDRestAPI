package br.com.exemplo.crud.rest.api.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.exemplo.crud.rest.api.model.RoleModel;
import br.com.exemplo.crud.rest.api.model.UserModel;

@Repository
public interface RoleRepository extends JpaRepository<RoleModel, Integer> {

    Optional<RoleModel> findByName(String name);

}
