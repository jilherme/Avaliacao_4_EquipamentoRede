package src;

class Roteador extends EquipamentoVLAN {
  private boolean fw;

  public Roteador(int umasPortas, Boolean umaVLAN, Boolean umaVlanTrunk, Boolean firewall) {
    super(umasPortas, umaVLAN, umaVlanTrunk);
    this.fw = firewall;
  }

  // toString
  public String toString() {
    if (fw) {
      return "Sou um roteador, " + super.toString() + ", tem firewall stateful";
    } else {
      return "Sou um roteador, " + super.toString() + ", não tem firewall stateful";
    }
  }
}
