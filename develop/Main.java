package develop;

import java.util.*;
// Implemente um programa de teste que cria um objeto de cada classe e armazena todos em um mesmo array.
// Em seguida, os dados de cada um devem ser mostrados na tela.

import Switch;

public class Main {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    String[] EquipamentoArray = new String[2]; // array de Strings com 3 "slots" que será utilizado para 3 equips.

    System.out.println("Vamos criar um hub!");
    System.out.println("Digite a quantidade de portas do hub :");
    int portas = teclado.nextInt(); // var portas recebe valor de portas
    teclado.nextLine(); // pra pegar o scanner que foi skipped, mas ñ lembro pq acontece isso nem
    Hub h = new Hub(portas); // cria instância um objeto de nome h que será um hub e recebe 1 param integer
    EquipamentoArray[0] = String.valueOf(h); // O hub ficará na primeira posição do array de equipamentos
    // gambiarra do "" + number eh boa pra entender a lógica, mas é ruim;
    // https://stackoverflow.com/a/22547954/15308621

    System.out.println("Vamos criar um switch!");
    System.out.println("Digite a quantidade de portas do Switch: ");
    portas = teclado.nextInt(); // vai sobrepor a variável portas local
    teclado.nextLine();
    System.out.println("Suporta VLANs? (s/n): ");
    String vlans = teclado.nextLine(); // nextChar doesn't exists :O
    System.out.println("Suporta VLANs Trunk? (s/n): ");
    String vlanTrunk = teclado.nextLine();
    boolean simVlan = vlans.equalsIgnoreCase("s"); /*
                                                    * tenho que especificar qual instância da variável teclado que está
                                                    * registrando os inputs, logo na minha lógica eu teria que fazer um
                                                    * desse pra cada sim/nao diferente de input pra vlan etc
                                                    */
    boolean naoVlan = vlans.equalsIgnoreCase("n"); /*
                                                    * acho que é uma function de String nao da pra usar char tb, mas
                                                    * aqui nao tem problema. Ou to confundindo com JS algum dos dois
                                                    * String é primário. JS tem os protos e talz
                                                    */
    // funcionando de algum jeito
    while (true) {
      // nn lembro como crio função pra encapsular isso e poder chamar qnd precisar e
      // se precisaria criar uma classe nova etc
      boolean simVlanTrunk = vlanTrunk.equalsIgnoreCase("s");
      if (simVlan) {
        vlans = "s";
        if (simVlanTrunk) {
          vlanTrunk = "s";
          break;
        } else {
          vlanTrunk = "n";
        }
        break; /*
                * acho que saio assim do statement true, normalmente uso algo tipo i++, mas vi
                * um ex. que usava condition true e usava o break que nunca tinha entendido seu
                * uso direito (até agora, acho).
                */
      } else if (naoVlan) {
        vlans = "n";
        break;
      } else {
        System.out.println("Entrada inválida 😿. Suporta VLANs? (S/N): ");
        vlans = teclado.nextLine(); // nextChar doesn't exists :O
      }
    }
    // https://bit.ly/2SzQ5GZ - inspiração while, if e equalsIgnoreCase
    /*
     * Switch sw = new Switch(24, true); System.out.println(sw);
     */

    Switch s = new Switch(portas, vlans, vlanTrunk);
    EquipamentoArray[1] = String.valueOf(s);

    for (int i = 0; i < EquipamentoArray.length; i++) {
      // o for vai percorrer a quantidade de objetos que existem dentro do array e
      // print cada objeto respectivamente
      System.out.println(EquipamentoArray[i]);
      System.lineSeparator();
    }
    teclado.close(); // sublinhado me incomoda muito;
  }
}
/*
 * EquipamentoVLAN e = new EquipamentoVLAN(16, true); System.out.println(e);
 * 
 * Switch sw = new Switch(24, true); System.out.println(sw);
 * 
 * Roteador r = new Roteador(8, false); System.out.println(r);
 */
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
// * System.out.println("Digite a quantidade de portas do Roteador: "); portas =
// * teclado.nextInt(); VLAN = "s";
// * System.out.println("Tem firewall stateful? (s/n): "); String firewall =
// * teclado.nextLine(); Equipamento r = new Equipamento(portas, firewall);
// * EquipamentoArray[2] = r + "";
// */
// for (int i = 0; i < EquipamentoArray.length; i++) {
// System.out.print(EquipamentoArray[i]);
// }
