package ru.vacpay.vacationpaycalculator.service.impl;

import org.springframework.stereotype.Service;

import ru.vacpay.vacationpaycalculator.models.HolyDays;
import ru.vacpay.vacationpaycalculator.exception.DateException;
import ru.vacpay.vacationpaycalculator.exception.InvalidValuesException;
import ru.vacpay.vacationpaycalculator.service.VacationPayService;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class VacationPayServiceImpl implements VacationPayService {

    @Override
    public Double amountOfVacationPay(Double avgSalary, LocalDate startVacation, LocalDate endVacation)  {

        if(avgSalary <= 0){
            throw new InvalidValuesException("The value of the fields must be positive");
        }
        if(endVacation.isBefore(startVacation)){
            throw new DateException("An incorrect date was entered");
        }
        List<LocalDate> vacation = new ArrayList<>();                                                                 // заполняем список отпускными днями
        for(LocalDate i = startVacation; i.isBefore(endVacation.plusDays(1)); i = i.plusDays(1)){
            vacation.add(i);
        }

        vacation.removeAll(HolyDays.getHolyDays());                                                                     //удаляем из списка праздничные дни

        return avgSalary / 29.3 * vacation.size();                                                                      // среднесуточную зарплату умножаем на количество
    }                                                                                                                   // отпускных дней не выпадающих на праздники
}
