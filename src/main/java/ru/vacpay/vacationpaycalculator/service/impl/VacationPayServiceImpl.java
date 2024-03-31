package ru.vacpay.vacationpaycalculator.service.impl;

import org.springframework.stereotype.Service;

import ru.vacpay.vacationpaycalculator.exception.InvalidValuesException;
import ru.vacpay.vacationpaycalculator.service.VacationPayService;

@Service
public class VacationPayServiceImpl implements VacationPayService {
    @Override
    public Double amountOfVacationPay(Double avgSalary, Integer vacationDays)  { // Вычисляется среднесуточная зарплата, которая затем умножается на кол-во дней отпуска

        if(avgSalary <= 0 || vacationDays <= 0){
            throw new InvalidValuesException("The value of the fields must be positive");
        }
        return avgSalary / 29.3 * vacationDays;
    }
}
