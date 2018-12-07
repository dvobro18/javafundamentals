package com.designpatteerns.behavioral;

public class Bearings implements Visitable {
@Override
public void acceptVisitor(WheelVisitorInterface visitor) {
	visitor.visit(this);
}
}
