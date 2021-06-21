package src;

class Switch extends EquipamentoVLAN {
  public Switch(int umasPortas, Boolean umaVLAN, Boolean umaVlanTrunk) {
    super(umasPortas, umaVLAN, umaVlanTrunk);
  }

  // toString
  public String toString() {
    return "Sou um switch, " + super.toString();
  }
}
