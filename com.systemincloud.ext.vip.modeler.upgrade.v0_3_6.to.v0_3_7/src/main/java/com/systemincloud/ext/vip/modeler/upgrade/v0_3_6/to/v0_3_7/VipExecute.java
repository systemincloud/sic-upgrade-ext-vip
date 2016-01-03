package com.systemincloud.ext.vip.modeler.upgrade.v0_3_6.to.v0_3_7;

import java.io.IOException;

import org.apache.commons.io.IOUtils;

import com.systemincloud.ext.vip.modeler.upgrade.common.AbstractVipExecute;
import com.systemincloud.modeler.upgrade.common.AbstractExecute;
import com.systemincloud.modeler.upgrade.common.IExtExecute;

import net.sf.saxon.s9api.SaxonApiException;

public class VipExecute extends AbstractVipExecute implements IExtExecute {
	
	@Override
	public String executeOnFile(String xml) {
		try {
			xml = super.executeOnSic(xml);
			xml = updateTaskVerColorMap     (xml, "0.1.5");
			xml = updateTaskVerImageFromFile(xml, "0.1.6");
			xml = updateTaskVerImageFromUrl (xml, "0.1.6");
			xml = updateTaskVerImageToFile  (xml, "0.1.6");
			xml = updateTaskVerTv           (xml, "0.1.7");
			xml = updateTaskVerVideoFromFile(xml, "0.1.6");
			xml = updateTaskVerVideoFromUrl (xml, "0.1.6");
			xml = updateTaskVerVideoToFile  (xml, "0.1.7");
			xml = updateTaskVerWebcam       (xml, "0.1.7");
			
		} catch (SaxonApiException e) { }
		return xml;
	}
	
	@Override
	public boolean executeOnRoot(String root) {
		return super.executeOnRoot(root);
	}
	
	@Override
	public String executeOnPom(String pom) throws SaxonApiException {
		String ret = AbstractExecute.addDependency(pom, DEP_PYTHON_API, "0.1.0");
		return ret;
	}
	
	@Override
    public String executeOnPyDevProjectFile(String file) {
        String ret = null;
		try {
			String xsl = IOUtils.toString(VipExecute.class.getResourceAsStream("add-external-lib.xsl"), "UTF-8");
			ret = AbstractExecute.transform2(file, xsl, "version", "0.1.0");
		} catch (SaxonApiException | IOException e) { }
        return ret;
    }
}
