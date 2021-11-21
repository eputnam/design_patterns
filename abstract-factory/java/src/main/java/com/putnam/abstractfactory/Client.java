package com.putnam.abstractfactory;

import com.putnam.abstractfactory.factory.ClassicFlatwareFactory;
import com.putnam.abstractfactory.factory.FlatwareFactory;
import com.putnam.abstractfactory.factory.ModernFlatwareFactory;
import com.putnam.abstractfactory.factory.OrnateFlatwareFactory;

import java.util.Scanner;

public class Client {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Modern, ornate, or classic?");
    String type = scan.next();
    scan.close();

    FlatwareFactory flatwareFactory;
    switch (type.toLowerCase()) {
      case "modern":
        flatwareFactory = new ModernFlatwareFactory();
        break;
      case "ornate":
        flatwareFactory = new OrnateFlatwareFactory();
        break;
      case "classic":
        flatwareFactory = new ClassicFlatwareFactory();
        break;
      default:
        System.out.println("Not sure what you mean. Please re-run and pick modern, ornate, or classic.");
        return;
    }

    FlatwareApp app = new FlatwareApp(flatwareFactory);

    app.printConfig();
  }
}
