package com.msavenkov.patterns.behavioral.chain;

public class CompanyHelper {
    public static void main(String[] args) {
        Helper simpleHelper = new SimpleHelper(Priority.LINE1);
        Helper smartHelper = new SmartHelper(Priority.LINE2);
        Helper humanHelper = new HumanHelper(Priority.LINE3);

        simpleHelper.setHelper(smartHelper);
        smartHelper.setHelper(humanHelper);

        simpleHelper.notify("notify line1", Priority.LINE1);
        simpleHelper.notify("notify line2", Priority.LINE2);
        simpleHelper.notify("notify line3", Priority.LINE3);
    }
}
