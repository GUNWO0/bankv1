package com.metacoding.bankv1.account;

import lombok.Data;

public class AccountRequest {

    @Data
    public static class TransferDTO {
        private Integer amount;
        private Integer withdrawNumber;
        private Integer depositNumber;
        private String withdrawPassword;
    }

    @Data
    public static class SaveDTO {
        private Integer number;
        private String password;
        private Integer balance;
    }
}
