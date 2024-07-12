package rest_api.start.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import rest_api.start.entity.Machine;
import rest_api.start.service.MachineService;


@RestController
@RequestMapping("/api/")
public class MainController {
    

    @Autowired
    MachineService service;


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
    @GetMapping("machines")
    public ResponseEntity<List<Machine>> getAllMachine(){
        List<Machine> machines = service.getAllMachines();
        return ResponseEntity.ok().body(machines);
    }

   
    

    
    
}
