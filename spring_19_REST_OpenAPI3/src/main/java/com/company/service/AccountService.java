package com.company.service;

import com.company.dto.AccountDTO;
import com.company.dto.AccountDTO;

import java.util.List;

public interface AccountService {

    List<AccountDTO> getAccounts();

    AccountDTO getById(Long id) throws Exception;

}
