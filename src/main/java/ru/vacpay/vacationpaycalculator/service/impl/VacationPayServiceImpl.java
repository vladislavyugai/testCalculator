package ru.vacpay.vacationpaycalculator.service.impl;

import org.springframework.stereotype.Service;

import ru.vacpay.vacationpaycalculator.service.VacationPayService;

@Service
public class VacationPayServiceImpl implements VacationPayService {
    @Override
    public Double amountOfVacationPay(Double avgSalary, Integer vacationDays)  { // Вычисляется среднесуточная зарплата, которая затем умножается на кол-во дней отпуска

        return avgSalary / 29.3 * vacationDays;
    }
}
