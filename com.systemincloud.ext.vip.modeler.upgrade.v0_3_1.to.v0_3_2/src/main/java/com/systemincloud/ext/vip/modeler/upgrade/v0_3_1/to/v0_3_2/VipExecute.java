package com.systemincloud.ext.vip.modeler.upgrade.v0_3_1.to.v0_3_2;

import javax.xml.transform.TransformerException;

import com.systemincloud.ext.vip.modeler.upgrade.common.AbstractVipExecute;
import com.systemincloud.modeler.upgrade.common.IExtExecute;

public class VipExecute extends AbstractVipExecute implements IExtExecute {
	
	@Override
	public String executeOnFile(String xml) {
		try {
			xml = super.executeOnSic(xml);
			xml = super.updateTaskVerVideoToFile  (xml, "0.1.2");
			
		} catch (TransformerException e) { }
		return xml;
	}
	
	@Override
	public boolean executeOnRoot(String root) {
		return super.executeOnRoot(root);
	}
	
	@Override
	public String executeOnPom(String pom) throws TransformerException{
		return pom;
	}
}
