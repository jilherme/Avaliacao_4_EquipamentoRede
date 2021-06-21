package src;

import java.util.*;

// Implemente um programa de teste que cria um objeto de cada classe e armazena todos em um mesmo array.
// Em seguida, os dados de cada um devem ser mostrados na tela.
public class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    String[] EquipamentoArray = new String[3]; // array de Strings com 3 "slots" que será utilizado para 3 equips.

    System.out.println("Vamos criar um hub! 🐱‍👓");
    System.out.println("Digite a quantidade de portas do hub :");
    int portas = teclado.nextInt(); // var portas recebe valor de portas
    teclado.nextLine(); // pra pegar o scanner que foi skipped, mas ñ lembro pq acontece isso nem
    Hub h = new Hub(portas); // cria instância um objeto de nome h que será um hub e recebe 1 param integer
    EquipamentoArray[0] = String.valueOf(h); // O hub ficará na primeira posição do array de equipamentos

    System.out.println("Vamos criar um switch! 🐱‍👤");
    System.out.println("Digite a quantidade de portas do Switch: ");
    portas = teclado.nextInt(); // vai sobrepor a variável portas local
    teclado.nextLine();

    /*
     * System.out.println("Suporta VLANs? (s/n): "); String vlans =
     * teclado.nextLine(); // nextChar doesn't exists :O
     * System.out.println("Suporta VLANs Trunk? (s/n): "); String vlanTrunk =
     * teclado.nextLine();
     */

    // funcionando de algum jeito
    while (true) {
      System.out.println("Suporta VLANs? (s/n): ");
      String vlans = teclado.nextLine();// nao tinha me tocado de colocar ela antes dos ifs pros booleans poderem
      // funcionar no escopo tb
      boolean simVlan = vlans.equalsIgnoreCase("s");
      boolean naoVlan = vlans.equalsIgnoreCase("n");
      if (simVlan) {
        System.out.println("Suporta VLANs Trunk? (s/n): ");
        String vlanTrunk = teclado.nextLine();
        boolean simVlanTrunk = vlanTrunk.equalsIgnoreCase("s");
        boolean naoVlanTrunk = vlanTrunk.equalsIgnoreCase("n");
        if (simVlanTrunk) {
          Switch s = new Switch(portas, true, simVlanTrunk);
          EquipamentoArray[1] = String.valueOf(s);
          break;
        } else if (naoVlanTrunk) {
          Switch s = new Switch(portas, true, simVlanTrunk);
          EquipamentoArray[1] = String.valueOf(s);
          break;
        } else {
          System.out.println("Entrada inválida de Vlan Trunk inválida😿.");
          continue; // vai voltar ao pedido de vlan tb
        }
      } else if (naoVlan) {
        Switch s = new Switch(portas, false, naoVlan);
        EquipamentoArray[1] = String.valueOf(s);
        break;
      } else {
        System.out.println("Entrada inválida de VLAN 😿.");
        continue;
      }
    }
    // https://bit.ly/2SzQ5GZ - inspiração while, if e equalsIgnoreCase

    System.out.println("Vamos criar um roteador!");
    System.out.println("Digite a quantidade de portas do Roteador: ");
    portas = teclado.nextInt();
    teclado.nextLine();
    while (true) {
      System.out.println("Tem firewall stateful? (s/n): ");
      String firewall = teclado.nextLine();
      boolean simFw = firewall.equalsIgnoreCase("s");
      boolean naoFw = firewall.equalsIgnoreCase("n");
      if (simFw) {
        Roteador r = new Roteador(portas, true, true, simFw);
        EquipamentoArray[2] = String.valueOf(r);
        break;
      } else if (naoFw) {
        Roteador r = new Roteador(portas, true, true, false);
        EquipamentoArray[2] = String.valueOf(r);
        break;
      } else {
        System.out.println("Entrada inválida 😿.");
        continue;
      }
    }

    for (int i = 0; i < EquipamentoArray.length; i++) {
      // o for vai percorrer a quantidade de objetos que existem dentro do array e
      // print cada objeto respectivamente
      System.out.println(EquipamentoArray[i]);
      System.lineSeparator();
    }
    teclado.close(); // sublinhado me incomoda muito;
  }
}