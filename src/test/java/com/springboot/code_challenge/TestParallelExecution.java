package com.springboot.code_challenge;

import com.springboot.code_challenge.flexcoin_racecondition.AccountRepository;
import com.springboot.code_challenge.flexcoin_racecondition.TransferService;
import org.junit.jupiter.api.Test;

import java.util.concurrent.CountDownLatch;

import static org.hibernate.sql.ast.SqlTreeCreationLogger.LOGGER;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestParallelExecution {


    private final AccountRepository accountRepository;
    private final TransferService transferService;

    public TestParallelExecution(AccountRepository accountRepository, TransferService transferService) {
        this.accountRepository = accountRepository;
        this.transferService = transferService;
    }


    //La razón por la que obtuvimos esta condición de carrera es que el transfermétodo no se ejecuta en el contexto de una única transacción de base de datos.

    @Test
    public void testParallelExecution() throws InterruptedException {

        assertEquals(10L, accountRepository.getBalance("Alice-123"));
        assertEquals(0L, accountRepository.getBalance("Bob-456"));

        CountDownLatch startLatch = new CountDownLatch(1);
        CountDownLatch endLatch = new CountDownLatch(Thread.activeCount());

        for (int i = 0; i < Thread.activeCount(); i++) {
            new Thread(() -> {
                try {
                    startLatch.await();

                    transferService.transfer(
                            "Alice-123", "Bob-456", 5L
                    );
                } catch (Exception e) {
                    LOGGER.error("Transfer failed", e);
                } finally {
                    endLatch.countDown();
                }
            }).start();
        }
        startLatch.countDown();
        endLatch.await();

//        System.out.println(
//                "Alice's balance {}",
//                accountRepository.getBalance("Alice-123")
//        );
//        LOGGER.info(
//                "Bob's balance {}",
//                accountRepository.getBalance("Bob-456")
//        );
    }
}