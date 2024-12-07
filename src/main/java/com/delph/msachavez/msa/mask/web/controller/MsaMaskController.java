package com.delph.msachavez.msa.mask.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.delph.msachavez.msa.mask.domain.dto.EmployeeDTO;
import com.delph.msachavez.msa.mask.domain.service.EmployeeService;

@RestController
@RequestMapping("api/v1/msaMask")
public class MsaMaskController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public ResponseEntity<List<EmployeeDTO>> getAllEmpleados() {
        return new ResponseEntity<>(employeeService.getEmployees(), HttpStatus.OK);
    }

    @GetMapping("{position}")
    public ResponseEntity<List<EmployeeDTO>> getEmpleadoByCargo(@PathVariable String position) {
        return new ResponseEntity<>(employeeService.getEmployeesByPosition(position), HttpStatus.OK);
    }
}
