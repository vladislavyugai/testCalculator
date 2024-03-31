package ru.vacpay.vacationpaycalculator.service.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

class VacationPayServiceImplTest {
    @Test
    void amountOfVacationPay() {
        VacationPayServiceImpl vacationPayService = new VacationPayServiceImpl();
        double amount = vacationPayService.amountOfVacationPay(29.3d, LocalDate.of(2024,3,1), LocalDate.of(2024,3,10));
        Assertions.assertEquals(9, amount);
    }
}
