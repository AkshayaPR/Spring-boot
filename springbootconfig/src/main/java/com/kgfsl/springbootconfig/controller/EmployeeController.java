package com.kgfsl.springbootconfig.controller;

import com.kgfsl.springbootconfig.model.Employee;
import com.kgfsl.springbootconfig.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = {"/employee"})
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;
    //private AgendaRepository agendaRepository;

    // public EmployeeController(EmployeeRepository employeeRepository) {
    //     this.employeeRepository = employeeRepository;
    // }

    // @RequestMapping(method = RequestMethod.GET)
    // public List<Employee> allEvents() {
    //     return employeeRepository.findAll();
    // }

    @RequestMapping(value = {"all"})   
    public String index(Model model) {
        System.out.println(employeeRepository.findAll());
        model.addAttribute("employees", employeeRepository.findAll());
        return "employee/index";
    }

    @RequestMapping(value = "create")
    public String create(){
        return "employee/create";
    }

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public String save(Employee employee){
        employeeRepository.save(employee);
        return "redirect:all";
        //return "employee/index";
    }

    @RequestMapping(value = "edit/{id}")
    public String edit(@PathVariable Integer id, Model model){
        model.addAttribute("employee",employeeRepository.findOne(id));
        return "employee/edit";
    }

    @RequestMapping(value = "update",method = RequestMethod.POST)
    public String update(Employee employee){
        employeeRepository.save(employee);
        return "redirect:all";
    }
   /* @RequestMapping(value = "delete/{id}",method = RequestMethod.DELETE)
    public String delete(@PathVariable Integer id)
    {   employeeRepository.delete(id);
        return "redirect:all";
    }*/

    /*@RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Employee findone(@PathVariable Integer id) {
        return employeeRepository.findOne(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Employee addItem(@RequestBody Employee employee) {
        employee.setId(null);
        return employeeRepository.saveAndFlush(employee);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Employee updateemployee(@RequestBody Employee updatedemployee, @PathVariable Integer id) {
        updatedemployee.setId(id);
        return employeeRepository.saveAndFlush(updatedemployee);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteEmployee(@PathVariable Integer id) {
        employeeRepository.delete(id);
    }*/

}