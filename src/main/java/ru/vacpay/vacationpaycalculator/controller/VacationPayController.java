package ru.vacpay.vacationpaycalculator.controller;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.vacpay.vacationpaycalculator.service.VacationPayService;
import java.time.LocalDate;


@Controller
@ResponseBody
@RequestMapping("/calculate")
public class VacationPayController {

    private final VacationPayService vacationPayService;
    public VacationPayController (VacationPayService service){
        this.vacationPayService = service;
    }

    @GetMapping
    public Double amountOfVacationPay(@RequestParam Double avgSalary,
                                      @RequestParam @DateTimeFormat(pattern = "yyyy-mm-dd") LocalDate startVacation,
                                      @RequestParam @DateTimeFormat(pattern = "yyyy-mm-dd") LocalDate endVacation){
        return vacationPayService.amountOfVacationPay(avgSalary, startVacation, endVacation);
    }
}
