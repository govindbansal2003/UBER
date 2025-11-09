package com.govindbansal.project.uber.uberApp.services;

import com.govindbansal.project.uber.uberApp.dto.WalletTransactionDto;
import com.govindbansal.project.uber.uberApp.entities.WalletTransaction;

public interface WalletTransactionService {

    void createNewWalletTransaction(WalletTransaction walletTransaction);

}
