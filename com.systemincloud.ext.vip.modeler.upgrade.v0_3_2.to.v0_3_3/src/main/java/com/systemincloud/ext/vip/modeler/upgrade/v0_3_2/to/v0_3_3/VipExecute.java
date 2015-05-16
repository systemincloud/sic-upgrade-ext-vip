package com.systemincloud.ext.vip.modeler.upgrade.v0_3_2.to.v0_3_3;

import javax.xml.transform.TransformerException;

import com.systemincloud.ext.vip.modeler.upgrade.common.AbstractVipExecute;
import com.systemincloud.modeler.upgrade.common.IExtExecute;

public class VipExecute extends AbstractVipExecute implements IExtExecute {
	
	@Override
	public String executeOnFile(String xml) {
		try {
			xml = super.executeOnSic(xml);
			xml = updateTaskVerColorMap     (xml, "0.1.1");
			xml = updateTaskVerImageFromFile(xml, "0.1.2");
			xml = updateTaskVerImageFromUrl (xml, "0.1.2");
			xml = updateTaskVerImageToFile  (xml, "0.1.2");
			xml = updateTaskVerTv           (xml, "0.1.3");
			xml = updateTaskVerVideoFromFile(xml, "0.1.2");
			xml = updateTaskVerVideoFromUrl (xml, "0.1.2");
			xml = updateTaskVerVideoToFile  (xml, "0.1.3");
			xml = updateTaskVerWebcam       (xml, "0.1.3");
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
