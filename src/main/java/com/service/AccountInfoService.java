package com.service;

import com.model.AccountInfo;
import com.fasterxml.jackson.core.JsonProcessingException;

public interface AccountInfoService {
    public AccountInfo accountValue(String gameName, String tagLine) throws JsonProcessingException;
    public AccountInfo accountValue(String puuid) throws JsonProcessingException;
}