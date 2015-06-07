package com.systemincloud.ext.vip.modeler.upgrade.v0_3_4.to.v0_3_5;

import java.io.IOException;

import javax.xml.transform.TransformerException;

import org.apache.commons.io.IOUtils;

import com.systemincloud.ext.vip.modeler.upgrade.common.AbstractVipExecute;
import com.systemincloud.modeler.upgrade.common.AbstractExecute;
import com.systemincloud.modeler.upgrade.common.IExtExecute;

public class VipExecute extends AbstractVipExecute implements IExtExecute {
	
	@Override
	public String executeOnFile(String xml) {
		try {
			xml = super.executeOnSic(xml);
			xml = updateTaskVerColorMap     (xml, "0.1.3");
			xml = updateTaskVerImageFromFile(xml, "0.1.4");
			xml = updateTaskVerImageFromUrl (xml, "0.1.4");
			xml = updateTaskVerImageToFile  (xml, "0.1.4");
			xml = updateTaskVerTv           (xml, "0.1.5");
			xml = updateTaskVerVideoFromFile(xml, "0.1.4");
			xml = updateTaskVerVideoFromUrl (xml, "0.1.4");
			xml = updateTaskVerVideoToFile  (xml, "0.1.5");
			xml = updateTaskVerWebcam       (xml, "0.1.5");
			
			xml = addOnlyLocalAttribute(xml);
			
		} catch (TransformerException | IOException e) { }
		return xml;
	}
	
	public String addOnlyLocalAttribute(String xml) throws TransformerException, IOException {
		return AbstractExecute.transform(xml, IOUtils.toString(VipExecute.class.getResourceAsStream("only-local.xsl"), "UTF-8"), null);
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
