package com.designpatterns.base;

import com.designpatteerns.behavioral.WheelDiagnostics;
import com.designpatteerns.behavioral.WheelInventory;

public interface WheelInterface extends Visitable {
	public int getSize(); 
		public boolean isWide();
		public void acceptVisitor(WheelInventory wheelInventory);
		public void acceptVisitor(WheelDiagnostics wheelDiagnostics); 
		
		}


