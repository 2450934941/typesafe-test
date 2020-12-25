package app;

import app.typesafe.TypesafeTest;
import modle.AppConfigKotlin;

public class Main {
    public static void main(String[] args) {
        TypesafeTest typesafeTest = new TypesafeTest();
        typesafeTest.loadConf01();
        typesafeTest.loadConf02();
        AppConfigKotlin.Companion.loadConfKotlin01();
    }
}
