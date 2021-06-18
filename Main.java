//package Avaliação4;

import java.util.*;
// Implemente um programa de teste que cria um objeto de cada classe e armazena todos em um mesmo array.
// Em seguida, os dados de cada um devem ser mostrados na tela.

public class Main {
  public static void main(String[] args) {

    Hub h = new Hub(8);
    System.out.println(h);

    EquipamentoVLAN e = new EquipamentoVLAN(16, true);
    System.out.println(e);

    Switch sw = new Switch(24, true);
    System.out.println(sw);

    Roteador r = new Roteador(8, false);
    System.out.println(r);

    // Scanner teclado = new Scanner(System.in);
    // String[] EquipamentoArray = new String[3];
    //
    // System.out.println("Vamos criar um hub");
    // System.out.println("Número de portas do Hub: ");
    // int portas = teclado.nextInt();
    // teclado.nextLine();
    // Hub hub = new Hub(portas);
    // EquipamentoArray[0] = "" + hub;
    //
    // System.out.println("Digite a quantidade de portas do Switch: ");
    // portas = teclado.nextInt();
    // teclado.nextLine();
    // System.out.println("Suporta VLANs? (s/n): ");
    // String VLAN = teclado.nextLine(); // nao sabia que nao tinha nextChar :O
    // Switch s = new Switch(portas, VLAN);
    // EquipamentoArray[1] = "" + s;
    //
    // /*
    //  * System.out.println("Digite a quantidade de portas do Roteador: "); portas =
    //  * teclado.nextInt(); VLAN = "s";
    //  * System.out.println("Tem firewall stateful? (s/n): "); String firewall =
    //  * teclado.nextLine(); Equipamento r = new Equipamento(portas, firewall);
    //  * EquipamentoArray[2] = r + "";
    //  */
    // for (int i = 0; i < EquipamentoArray.length; i++) {
    //   System.out.print(EquipamentoArray[i]);
    // }
  }
}
