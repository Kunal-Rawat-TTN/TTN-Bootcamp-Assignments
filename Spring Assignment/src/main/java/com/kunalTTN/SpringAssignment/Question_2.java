//package com.kunalTTN;
//
//interface Developer
//{
//    void doWork();
//}
//
//class SoftwareDeveloper
//{
//    public void works(Developer developer)
//    {
//        developer.doWork();
//    }
//}
//
//class BackendDeveloper implements Developer
//{
//    @Override
//    public void doWork()
//    {
//        System.out.println("Developing backend of the website");
//    }
//}
//
//class FrontDeveloper implements Developer
//{
//    @Override
//    public void doWork()
//    {
//        System.out.println("Developing frontend of the website");
//    }
//}
//
//public class Question_2 {
//    public static void main(String[] args) {
//        SoftwareDeveloper softwareDeveloper = new SoftwareDeveloper();
//        softwareDeveloper.works(new BackendDeveloper());
//        softwareDeveloper.works(new FrontDeveloper());
//    }
//}
