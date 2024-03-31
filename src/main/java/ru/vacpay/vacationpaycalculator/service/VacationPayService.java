package ru.vacpay.vacationpaycalculator.service;


import java.time.LocalDate;

public interface VacationPayService {
   Double amountOfVacationPay(Double avgSalary, LocalDate startVacation, LocalDate endVacation);
}
