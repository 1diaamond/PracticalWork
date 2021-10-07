package com.alpha.model;

public class Validator {

    public static int validateYear(String year) {
        if (!isNull(year)) {
        int yy = Integer.parseInt(year);
        if (yy < 1800 || yy > 2021 ) {
            throw new IllegalArgumentException("Illegal year!");
        }
        return yy;} else throw new IllegalArgumentException("Year cannot be null!");
    }
    public static int validatePercent(String percent) {
        if (!isNull(percent)) {
        int pc = Integer.parseInt(percent);
        if (pc < 0 || pc > 100 ) {
            throw new IllegalArgumentException("Illegal percent!");
        }
        return pc;} else throw new IllegalArgumentException("Percent cannot be null!");
    }
    public static int validateId(String stringId) {
        if (!isNull(stringId)) {
        int id = Integer.parseInt(stringId);
        if (id < 0 || id > 1000000 ) {
            throw new IllegalArgumentException("Illegal id!");
        }
        return id;} else throw new IllegalArgumentException("Id cannot be null!");
    }
    public static String validateAuthor(String author) {
        if (!isNull(author)) {
            return author;
        }else throw new IllegalArgumentException("Author cannot be null!");
    }
    public static String validateTitle(String title) {
        if (!isNull(title)) {
            return title;
        }else throw new IllegalArgumentException("Title cannot be null!");
    }
    public static String validatePublisher(String publisher) {
        if (!isNull(publisher)) {
            return publisher;
        }else throw new IllegalArgumentException("Publisher cannot be null!");
    }
    public static String validateAction(String action) {
        if (!isNull(action)) {
            return action;
        }else throw new IllegalArgumentException("Action cannot be null!");
    }
    public static int validatePage(String page) {
        if (!isNull(page)) {
            int pg = Integer.parseInt(page);
            System.out.println(pg);
            if (pg < 1 || pg > 1000000 ) {
                throw new IllegalArgumentException("Illegal pages num!");
            }
            return pg;} else throw new IllegalArgumentException("Pages cannot be null!");
    }
    public static double validateCost(String cost) {
        if (!isNull(cost)) {
            double cst = Double.parseDouble(cost);
            System.out.println(cst);
            if (cst < 0.0 || cst > 1000000.0 ) {
                throw new IllegalArgumentException("Illegal cost num!");
            }
            return cst;} else throw new IllegalArgumentException("Cost cannot be null!");
    }
    public static boolean isNull (String param){
        if (param == null || param.trim().equals("") ) {
            return true;
        }return false;
    }


}
