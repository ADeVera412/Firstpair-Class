class Chair1 {
  String name;
  private int legs;
  private String color;

  public void paint(String newColor) {
    color = newColor;
  }

  public void legPlacement(int legNum) {
    legs = legNum;
  }

  public Chair1(String name, int legs, String color) {
    this.name = name;
    this.legs = legs;
    this.color = color;
  }

  @Override
  public String toString() {
    return "Chair Name: " + name + ", Number of Legs: " + legs + ", Color: " + color;
  }

}

class ChairTester_DeVXav {
  public static void main(String[] args) {
    Chair1 chair = new Chair1("ClassChair", 4, "Brown");
    System.out.println(chair);
    chair.paint("red");
    System.out.println(chair);
    chair.legPlacement(3);
    System.out.println(chair);
  }

}
