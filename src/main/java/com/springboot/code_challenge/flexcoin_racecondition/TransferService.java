package com.springboot.code_challenge.flexcoin_racecondition;

public interface  TransferService {

    boolean transfer(String fromIban, String toIban, long cents);
}
