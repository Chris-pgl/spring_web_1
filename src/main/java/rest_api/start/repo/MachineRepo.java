package rest_api.start.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import rest_api.start.entity.Machine;

@Repository
public interface  MachineRepo extends JpaRepository<Machine, Integer>{
    
}
