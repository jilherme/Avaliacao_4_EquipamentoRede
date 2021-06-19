package develop;
//package Avaliação4;

class EquipamentoVLAN extends Equipamento { // tentei fazer o negócio de extender pra fazer uma classe intermediária
                                            // como tu tinha me dito no exercício dos instrumentos mas to recebendo null
                                            // no terminal qnd digito o valor da vlan
  // private String VLAN = "s"; // a ideia inicial qnd me toquei desse detalhe era
  // deixar como valor padrão pro
  // roteador e substituir pro switch mas ja nao
  // sei mais oq to fazendo

  private String suportaVLANs;
  private String suportaVlanTrunk;

  public EquipamentoVLAN(int umasPortas, String umaVLAN, String vlanTrunk) {
    super(umasPortas);
    this.suportaVLANs = umaVLAN;
    this.suportaVlanTrunk = vlanTrunk;
  }

  /*
   * public String temSuporteAVLANs() { return this.suportaVLANs; }
   */
  boolean suportaV = (this.suportaVLANs == "s");
  boolean suportaVT = (this.suportaVlanTrunk == "s");

  // toString
  public String toString() {
    if (suportaV && suportaVT) {
      return super.toString() + ", com suporte a VLANs e VLAN Trunks";
    } else if (suportaV && !suportaVT) {
      return super.toString() + ", com suporte somente a VLANs.";
    } else {
      return super.toString() + ", sem suporte a VLANs";
    }
  }
}
