package com.systemincloud.ext.vip.modeler.upgrade.v0_3_3.to.v0_3_4;

import javax.xml.transform.TransformerException;

import com.systemincloud.ext.vip.modeler.upgrade.common.AbstractVipExecute;
import com.systemincloud.modeler.upgrade.common.IExtExecute;

public class VipExecute extends AbstractVipExecute implements IExtExecute {
	
	@Override
	public String executeOnFile(String xml) {
		try {
			xml = super.executeOnSic(xml);
			xml = updateTaskVerColorMap     (xml, "0.1.2");
			xml = updateTaskVerImageFromFile(xml, "0.1.3");
			xml = updateTaskVerImageFromUrl (xml, "0.1.3");
			xml = updateTaskVerImageToFile  (xml, "0.1.3");
			xml = updateTaskVerTv           (xml, "0.1.4");
			xml = updateTaskVerVideoFromFile(xml, "0.1.3");
			xml = updateTaskVerVideoFromUrl (xml, "0.1.3");
			xml = updateTaskVerVideoToFile  (xml, "0.1.4");
			xml = updateTaskVerWebcam       (xml, "0.1.4");
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
