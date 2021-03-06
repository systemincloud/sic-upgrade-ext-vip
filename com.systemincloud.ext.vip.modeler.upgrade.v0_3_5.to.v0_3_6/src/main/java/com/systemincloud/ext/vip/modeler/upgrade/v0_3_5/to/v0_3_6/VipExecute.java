package com.systemincloud.ext.vip.modeler.upgrade.v0_3_5.to.v0_3_6;

import javax.xml.transform.TransformerException;

import com.systemincloud.ext.vip.modeler.upgrade.common.AbstractVipExecute;
import com.systemincloud.modeler.upgrade.common.IExtExecute;

public class VipExecute extends AbstractVipExecute implements IExtExecute {
	
	@Override
	public String executeOnFile(String xml) {
		try {
			xml = super.executeOnSic(xml);
			xml = updateTaskVerColorMap     (xml, "0.1.4");
			xml = updateTaskVerImageFromFile(xml, "0.1.5");
			xml = updateTaskVerImageFromUrl (xml, "0.1.5");
			xml = updateTaskVerImageToFile  (xml, "0.1.5");
			xml = updateTaskVerTv           (xml, "0.1.6");
			xml = updateTaskVerVideoFromFile(xml, "0.1.5");
			xml = updateTaskVerVideoFromUrl (xml, "0.1.5");
			xml = updateTaskVerVideoToFile  (xml, "0.1.6");
			xml = updateTaskVerWebcam       (xml, "0.1.6");
			
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
