package develop;
//package Avaliação4;

class Switch extends EquipamentoVLAN {
  String suportaVlanTrunk;

  public Switch(int umasPortas, String umaVLAN, String umaVlanTrunk) {
    super(umasPortas, umaVLAN, umaVlanTrunk);
    this.suportaVlanTrunk = umaVlanTrunk;
  }

  // toString
  public String toString() {
    return "Sou um switch, " + super.toString();
  }
}
