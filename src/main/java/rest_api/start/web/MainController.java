package rest_api.start.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import rest_api.start.entity.Machine;
import rest_api.start.service.MachineService;
import rest_api.start.web.dto.MachineDTO;



@RestController
@RequestMapping("/api/")
public class MainController {
    

    @Autowired
    MachineService service;

    //Create(aggiungere pre-compilato)
    @GetMapping("machine/add")
    public ResponseEntity<Void> addMachine(){
        Machine m1 = new Machine("Ford Mustang", "Fastback 2.3", 25000);
        Machine m2 = new Machine("BMW", "xDrive M-Sport ", 23000);
        Machine m3 = new Machine("Alfa Romeo", "Giulietta", 22000);

        service.saveMachine(m1);
        service.saveMachine(m2);
        service.saveMachine(m3);

        return ResponseEntity.ok().build();

    }

    //Create 
    @PostMapping("post")
    public ResponseEntity<Machine> addMachine(
            @RequestBody MachineDTO machineDto) {

        Machine machine = new Machine(machineDto);
        service.saveMachine(machine);

        return ResponseEntity.ok(machine);
    }

    //Read
    @GetMapping("machines")
    public ResponseEntity<List<Machine>> getAllMachine(){
        List<Machine> machines = service.getAllMachines();
        return ResponseEntity.ok().body(machines);
    }


    //Update
    @PatchMapping("update/{id}")
    public ResponseEntity<Machine> updateMachine(
            @PathVariable int id,
            @RequestBody MachineDTO machineDto) {

        Optional<Machine> optMachine = service.getMachineByID(id);

        if (optMachine.isEmpty())
            return ResponseEntity.notFound().build();

        Machine machine = optMachine.get();
        machine.update(machineDto);

        service.saveMachine(machine);

        return ResponseEntity.ok(machine);
    }

   //Delete
    @GetMapping("machine/delete/{id}")
    public ResponseEntity<String> deleteByID(@PathVariable int id){
        Optional<Machine> optMachine = service.getMachineByID(id);
        if(optMachine.isEmpty())
            return ResponseEntity.notFound().build();
        
        Machine machine = optMachine.get();
        service.deleteMachine(machine);

        return ResponseEntity.ok("Deletete machine!");
    }
    

    
    

    


    
    
}
