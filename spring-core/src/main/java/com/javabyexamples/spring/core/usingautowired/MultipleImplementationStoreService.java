package com.javabyexamples.spring.core.usingautowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MultipleImplementationStoreService {

    private final EmployeeService employeeService;
    private final ManagerService managerService;

    @Autowired
    public MultipleImplementationStoreService(EmployeeService employeeService,
                                              ManagerService managerService) {
        this.employeeService = employeeService;
        this.managerService = managerService;
    }

    public void start(){
        managerService.manage();
        employeeService.work();
    }
}
