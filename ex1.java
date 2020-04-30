button1 = new Button() {
  button.Perimeter = Rectangle(210,110),(383,219);
  onEvent(mouse.click()) {
    lastClickPosX = mouse.getCurrentPositionX();
    lastClickPosY = mouse.getCurrentPositionY();
    if (lastClickPosX >= 210 && lastClickPosX <= 383 && lastClickPosY >= 110 && lastClickPosY <= 219) {
      button.click();
    }
  }
  click() {
    System.out.println("clicked");
  }
}




Mouse {
  public double getCurrentPositionX() {
  return (currentPositionX);
  }
}

import System.in.Mouse;
