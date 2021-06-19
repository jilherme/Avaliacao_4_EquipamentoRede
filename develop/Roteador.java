//package Avaliação4;

class Roteador extends EquipamentoVLAN {
  private boolean firewall;

  public Roteador(int umasPortas, String fw) {
    super(umasPortas, fw);
    this.firewall = fw;
  }

  // toString
  public String toString() {
    if (this.firewall) {
      return "Sou um roteador, " + super.toString() + ", tem firewall stateful";
    } else {
      return "Sou um roteador, " + super.toString() + ", não tem firewall stateful";
    }
  }
}
