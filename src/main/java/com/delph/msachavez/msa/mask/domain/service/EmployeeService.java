package com.delph.msachavez.msa.mask.domain.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.delph.msachavez.msa.mask.domain.dto.EmployeeDTO;

@Service
public class EmployeeService {

    @Autowired
    RestTemplate restTemplate;

    final String urlServicio = "http://localhost:8080/api/v1/empleado/";

    public List<EmployeeDTO> getEmployees() {
        ResponseEntity<EmployeeDTO[]> resp        = restTemplate.getForEntity(urlServicio, EmployeeDTO[].class);
        EmployeeDTO[]                 employeeDTO = resp.getBody();
        List<EmployeeDTO>             listEmp     = Arrays.asList(employeeDTO);

        return listEmp;
    }

    public List<EmployeeDTO> getEmployeesByPosition(String position) {
        EmployeeDTO reqBody = new EmployeeDTO();
        reqBody.setPosition(position);

        HttpEntity<EmployeeDTO>       request     = new HttpEntity<>(reqBody);
        ResponseEntity<EmployeeDTO[]> resp        = restTemplate.postForEntity(urlServicio + "/getByCargos", request, EmployeeDTO[].class);
        EmployeeDTO[]                 employeeDTO = resp.getBody();
        List<EmployeeDTO>             listEmp     = Arrays.asList(employeeDTO);

        return listEmp;
    }
}
