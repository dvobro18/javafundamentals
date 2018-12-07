package com.designpatteerns.behavioral;

import java.util.EventListener;

public interface SpeedometerListener extends EventListener {
public void speedChange(SpeedometerEvent event);
}
