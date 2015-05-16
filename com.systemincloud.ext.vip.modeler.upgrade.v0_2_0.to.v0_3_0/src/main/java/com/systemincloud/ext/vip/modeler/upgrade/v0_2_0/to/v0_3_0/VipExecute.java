package com.systemincloud.ext.vip.modeler.upgrade.v0_2_0.to.v0_3_0;

import com.systemincloud.modeler.upgrade.common.IExtExecute;

public class VipExecute implements IExtExecute {

	@Override
	public String executeOnFile(String xml) {
		return xml;
	}
	
	@Override
	public boolean executeOnRoot(String root) {
		return true;
	}

	@Override
	public String executeOnPom(String pom) { return pom; }
	
}
