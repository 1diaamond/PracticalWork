package com.alpha.view;

/*
класс InputDataView с методами получения данных от пользователя (действия, параметры и т.п);
 */

import java.util.Scanner;

public class InputDataView {
        Scanner sc ;

    public InputDataView() {
        this.sc = new Scanner(System.in);
    }

    public String getParams() {
        return sc.nextLine();
    }
}
