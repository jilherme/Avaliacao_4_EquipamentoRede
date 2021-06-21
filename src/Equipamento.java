package src;

// Número de portas:
// Suporta VLANs? (s/n): criar na sub-sub-classe
// Tem firewall stateful? (s/n): criar na sub-sub-classe
public class Equipamento {
  private int portas;

  public Equipamento(int umasPortas) {
    this.portas = umasPortas;
  }

  // toString
  public String toString() {
    return "número de portas: " + this.portas;
  }
}
