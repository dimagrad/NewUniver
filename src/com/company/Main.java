package com.company;

import java.util.concurrent.ExecutionException;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        UserDialog userDialog = new UserDialog();
        userDialog.startDialog();
    }
}
