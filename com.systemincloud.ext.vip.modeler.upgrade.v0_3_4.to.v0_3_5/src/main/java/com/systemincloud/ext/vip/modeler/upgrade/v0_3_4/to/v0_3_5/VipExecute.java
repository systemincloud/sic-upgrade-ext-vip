package com.systemincloud.ext.vip.modeler.upgrade.v0_3_4.to.v0_3_5;

import javax.xml.transform.TransformerException;

import com.systemincloud.ext.vip.modeler.upgrade.common.AbstractVipExecute;
import com.systemincloud.modeler.upgrade.common.IExtExecute;

public class VipExecute extends AbstractVipExecute implements IExtExecute {
	
	@Override
	public String executeOnFile(String xml) {
		try {
			xml = super.executeOnSic(xml);
			xml = updateTaskVerImageFromFile(xml, "0.1.4");
			xml = updateTaskVerImageFromUrl (xml, "0.1.4");
			xml = updateTaskVerImageToFile  (xml, "0.1.4");
			xml = updateTaskVerTv           (xml, "0.1.5");
			xml = updateTaskVerVideoFromFile(xml, "0.1.4");
			xml = updateTaskVerVideoFromUrl (xml, "0.1.4");
			xml = updateTaskVerVideoToFile  (xml, "0.1.5");
			xml = updateTaskVerWebcam       (xml, "0.1.5");
			
			
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
