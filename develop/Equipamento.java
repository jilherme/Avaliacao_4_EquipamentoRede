package develop;
//package Avaliação4;

// Número de portas:
// Suporta VLANs? (s/n): criar na sub-sub-classe
// Tem firewall stateful? (s/n): criar na sub-sub-classe
public class Equipamento {
  private int portas;

  public Equipamento(int umasPortas) {
    this.portas = umasPortas;
  }

  public int getPortas() {
    return this.portas;
  }

  // toString
  public String toString() {
    return "número de portas: " + this.portas;
  }
}
