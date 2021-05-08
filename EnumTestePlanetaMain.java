public enum EnumTestePlanetaMain {
    MERCURIO (3.303e+23, 2.4397e6),
    VENUS (4.869e+24, 6.0518e6),
    TERRA (5.976e+24, 6.37814e6),
    MARTE (6.421e+23, 3.3972e6),
    JUPITER (1.9e+27,   7.1492e7),
    SATURNO (5.688e+26, 6.0268e7),
    URANO (8.686e+25, 2.5559e7),
    NETUNO (1.024e+26, 2.4746e7);

    private final double massa;
    private final double raio;

    EnumTestePlanetaMain(double massa, double raio) {
      this.massa = massa;
      this.raio = raio;
    }

    private double massa() { return this.massa; }
    private double raio() { return this.raio; }

    public static final double G = 6.67300E-11;

    double superficieGravitacional() {
      return G * massa / (raio * raio);
    }

    double pesoEmSuperficie(double outraMassa) {
      return outraMassa * superficieGravitacional();
    }

    public static void main(String args[]) {
      if (args.length != 1) {
        System.out.println("Usage: java Planet <earth_weight>");
        System.exit(-1);
      }
      double massaEmTerra = Double.parseDouble(args[0]);
      double mass = massaEmTerra/TERRA.superficieGravitacional();
      for (EnumTestePlanetaMain planet : EnumTestePlanetaMain.values())
      System.out.printf("Seu peso em %s é %f%n", planet, planet.pesoEmSuperficie(mass));
    }
}