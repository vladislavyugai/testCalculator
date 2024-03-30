package ru.vacpay.vacationpaycalculator.service.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class VacationPayServiceImplTest {
    @Test
    void amountOfVacationPay() {
        VacationPayServiceImpl vacationPayService = new VacationPayServiceImpl();
        double amount = vacationPayService.amountOfVacationPay(29.3d, 10);
        Assertions.assertEquals(10, amount);
    }
}
