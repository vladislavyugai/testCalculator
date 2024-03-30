package ru.vacpay.vacationpaycalculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.vacpay.vacationpaycalculator.service.VacationPayService;

@Controller
@ResponseBody
@RequestMapping("/calculate")
public class VacationPayController {

    private final VacationPayService vacationPayService;
    public VacationPayController (VacationPayService service){
        this.vacationPayService = service;
    }

    @GetMapping
    public Double amountOfVacationPay(@RequestParam Double avgSalary, @RequestParam Integer vacationDays){
        return vacationPayService.amountOfVacationPay(avgSalary, vacationDays);
    }
}
