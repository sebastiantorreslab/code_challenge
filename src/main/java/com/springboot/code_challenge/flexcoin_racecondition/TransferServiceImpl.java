package com.springboot.code_challenge.flexcoin_racecondition;


import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;



@Service
public class TransferServiceImpl implements TransferService {

    @Autowired
    private AccountRepository accountRepository;

    //El objetivo principal de la capa de servicio es definir los límites de las transacciones de una unidad de trabajo determinada.
    //
    //Si el servicio está destinado a llamar a varios Repositorymétodos, es muy importante tener un único contexto de transacción que abarque toda la unidad de trabajo.


    //@Transactional(value = Isolation.REPEATABLE_READ)
    @Override
    public boolean transfer(
            String fromIban, String toIban, long cents) {
        boolean status = true;

        long fromBalance = accountRepository.getBalance(fromIban);

        if(fromBalance >= cents) {
            status &= accountRepository.addBalance(
                    fromIban, (-1) * cents
            ) > 0;

            status &= accountRepository.addBalance(
                    toIban, cents
            ) > 0;
        }

        return status;
    }
}
