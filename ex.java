button1 {
  onEvent(mouse.click()) {
    lastClickPosX = mouse.getCurrentPositionX();
    lastClickPosY = mouse.getCurrentPositionY();
  //210,110 383,219
  }
}




Mouse {
  public double getCurrentPositionX() {
  return (currentPositionX);
  }
}

import System.in.Mouse;
