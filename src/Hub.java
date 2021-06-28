package src;

// nem sabia que dava pra extender em outro arquivo
public class Hub extends Equipamento {
  public Hub(int umasPortas) {
    super(umasPortas);
  }

  public String toString() {
    return "Sou um hub, " + super.toString();
  }
}
