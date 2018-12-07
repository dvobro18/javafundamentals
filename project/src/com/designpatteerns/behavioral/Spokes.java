package com.designpatteerns.behavioral;

public class Spokes implements Visitable{
@Override
public void acceptVisitor(WheelVisitorInterface visitor) {
	visitor.visit(this);
}
}
