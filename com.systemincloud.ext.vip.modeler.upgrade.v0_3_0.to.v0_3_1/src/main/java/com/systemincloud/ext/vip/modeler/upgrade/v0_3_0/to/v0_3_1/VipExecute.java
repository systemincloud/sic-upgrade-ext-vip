package com.systemincloud.ext.vip.modeler.upgrade.v0_3_0.to.v0_3_1;

import javax.xml.transform.TransformerException;

import com.systemincloud.ext.vip.modeler.upgrade.common.AbstractVipExecute;
import com.systemincloud.modeler.upgrade.common.AbstractExecute;
import com.systemincloud.modeler.upgrade.common.IExtExecute;

public class VipExecute extends AbstractVipExecute implements IExtExecute {
	
	@Override
	public String executeOnFile(String xml) {
		try {
			xml = super.executeOnSic(xml);
			xml = super.updateTaskVerImageFromFile(xml, "0.1.1");
			xml = super.updateTaskVerImageFromUrl (xml, "0.1.1");
			xml = super.updateTaskVerImageToFile  (xml, "0.1.1");
			xml = super.updateTaskVerTv           (xml, "0.1.2");
			xml = super.updateTaskVerVideoFromFile(xml, "0.1.1");
			xml = super.updateTaskVerVideoFromUrl (xml, "0.1.1");
			xml = super.updateTaskVerVideoToFile  (xml, "0.1.1");
			xml = super.updateTaskVerWebcam       (xml, "0.1.2");
			
			xml = super.executeTransform(this.getClass(), xml, "webcam-remove-generator.xsl");
		} catch (TransformerException e) { }
		return xml;
	}
	
	@Override
	public boolean executeOnRoot(String root) {
		return super.executeOnRoot(root);
	}
	
	@Override
	public String executeOnPom(String pom) throws TransformerException{
		String ret = AbstractExecute.updateDependencyVersion(pom, DEP_JAVA_API, "0.1.1");
		return ret;
	}
}
