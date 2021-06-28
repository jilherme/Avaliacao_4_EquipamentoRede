package src;

class EquipamentoVLAN extends Equipamento {

  private Boolean suportaVLANs;
  private Boolean suportaVlanTrunk;

  public EquipamentoVLAN(int umasPortas, Boolean umaVLAN, Boolean vlanTrunk) {
    super(umasPortas);
    this.suportaVLANs = umaVLAN;
    this.suportaVlanTrunk = vlanTrunk;
  }

  /*
   * public String temSuporteAVLANs() { return this.suportaVLANs; }
   */

  // toString
  public String toString() {
    if (suportaVLANs && suportaVlanTrunk) {
      return super.toString() + ", com suporte a VLANs e VLAN Trunks";
    } else if (suportaVLANs && !suportaVlanTrunk) {
      return super.toString() + ", com suporte somente a VLANs.";
    } else {
      return super.toString() + ", sem suporte a VLANs";
    }
  }
}
