//package Avaliação4;

class EquipamentoVLAN extends Equipamento { // tentei fazer o negócio de extender pra fazer uma classe intermediária
                                            // como tu tinha me dito no exercício dos instrumentos mas to recebendo null
                                            // no terminal qnd digito o valor da vlan
  //private String VLAN = "s"; // a ideia inicial qnd me toquei desse detalhe era deixar como valor padrão pro
  // roteador e substituir pro switch mas ja nao
  // sei mais oq to fazendo

  private boolean suportaVLANs;

  public EquipamentoVLAN(int umasPortas, boolean vlans) {
    super(umasPortas);
    this.suportaVLANs = vlans;
  }

  public boolean temSuporteAVLANs() {
    return this.suportaVLANs;
  }

  // toString
  public String toString() {
    if (this.suportaVLANs) {
      return super.toString() + ", com suporte a VLANs";
    } else {
      return super.toString() + ", sem suporte a VLANs";
    }
  }
}
