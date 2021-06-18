//package Avaliação4;

class Switch extends EquipamentoVLAN {

  public Switch(int umasPortas, boolean vlans) {
    super(umasPortas, vlans);
  }

  // toString
  public String toString() {
    return "Sou um switch, " + super.toString();
  }
}
