package com.dao;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.model.AccountInfo;


public interface AccountInfoDAO {
    public AccountInfo accountValue(String gameName, String tagLine) throws JsonProcessingException;

    public AccountInfo accountValue(String puuid) throws JsonProcessingException;
}