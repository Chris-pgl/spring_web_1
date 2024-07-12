package rest_api.start.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import rest_api.start.entity.Machine;
import rest_api.start.repo.MachineRepo;

@Service
public class MachineService {
    
    @Autowired
    MachineRepo repo;


    public List<Machine> getAllMachines(){
        return repo.findAll();
    }

    public Optional<Machine> getMachineByID(int id){
        return repo.findById(id);
    }

    public void saveMachine(Machine m){
        repo.save(m);
    }

    public void deleteMachine(Machine m){
        repo.delete(m);
    }

    
}
