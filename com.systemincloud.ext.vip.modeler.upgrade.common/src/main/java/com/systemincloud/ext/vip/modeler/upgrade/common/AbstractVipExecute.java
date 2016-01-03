package com.systemincloud.ext.vip.modeler.upgrade.common;

import java.io.IOException;

import org.apache.commons.io.IOUtils;

import com.systemincloud.modeler.upgrade.common.AbstractExecute;

import net.sf.saxon.s9api.SaxonApiException;

public abstract class AbstractVipExecute {

	private static String colorMapVersionXsl;
	private static String imageFromFileVersionXsl;
	private static String imageFromUrlVersionXsl;
	private static String imageToFileVersionXsl;
	private static String tvVersionXsl;
	private static String videoFromFileVersionXsl;
	private static String videoFromUrlVersionXsl;
	private static String videoToFileVersionXsl;
	private static String webcamVersionXsl;
	
	static {
		try {
			colorMapVersionXsl      = IOUtils.toString(AbstractVipExecute.class.getResourceAsStream("color-map-version.xsl"), "UTF-8");
			imageFromFileVersionXsl = IOUtils.toString(AbstractVipExecute.class.getResourceAsStream("image-from-file-version.xsl"), "UTF-8");
			imageFromUrlVersionXsl  = IOUtils.toString(AbstractVipExecute.class.getResourceAsStream("image-from-url-version.xsl"), "UTF-8");
			imageToFileVersionXsl   = IOUtils.toString(AbstractVipExecute.class.getResourceAsStream("image-to-file-version.xsl"), "UTF-8");
			tvVersionXsl            = IOUtils.toString(AbstractVipExecute.class.getResourceAsStream("tv-version.xsl"), "UTF-8");
			videoFromFileVersionXsl = IOUtils.toString(AbstractVipExecute.class.getResourceAsStream("video-from-file-version.xsl"), "UTF-8");
			videoFromUrlVersionXsl  = IOUtils.toString(AbstractVipExecute.class.getResourceAsStream("video-from-url-version.xsl"), "UTF-8");
			videoToFileVersionXsl   = IOUtils.toString(AbstractVipExecute.class.getResourceAsStream("video-to-file-version.xsl"), "UTF-8");
			webcamVersionXsl        = IOUtils.toString(AbstractVipExecute.class.getResourceAsStream("webcam-version.xsl"), "UTF-8");
		} catch (IOException e) { }
	}

	protected boolean executeOnRoot(String root) {
		return true;
	}
	
	public String updateTaskVerColorMap     (String xml, String version) throws SaxonApiException { return AbstractExecute.transform2(xml, colorMapVersionXsl,      "version", version); }
	public String updateTaskVerImageFromFile(String xml, String version) throws SaxonApiException { return AbstractExecute.transform2(xml, imageFromFileVersionXsl, "version", version); }
	public String updateTaskVerImageFromUrl (String xml, String version) throws SaxonApiException { return AbstractExecute.transform2(xml, imageFromUrlVersionXsl,  "version", version); }
	public String updateTaskVerImageToFile  (String xml, String version) throws SaxonApiException { return AbstractExecute.transform2(xml, imageToFileVersionXsl,   "version", version); }
	public String updateTaskVerTv           (String xml, String version) throws SaxonApiException { return AbstractExecute.transform2(xml, tvVersionXsl,            "version", version); }
	public String updateTaskVerVideoFromFile(String xml, String version) throws SaxonApiException { return AbstractExecute.transform2(xml, videoFromFileVersionXsl, "version", version); }
	public String updateTaskVerVideoFromUrl (String xml, String version) throws SaxonApiException { return AbstractExecute.transform2(xml, videoFromUrlVersionXsl,  "version", version); }
	public String updateTaskVerVideoToFile  (String xml, String version) throws SaxonApiException { return AbstractExecute.transform2(xml, videoToFileVersionXsl,   "version", version); }
	public String updateTaskVerWebcam       (String xml, String version) throws SaxonApiException { return AbstractExecute.transform2(xml, webcamVersionXsl,        "version", version); }
	
	public String executeTransform(Class<?> clazz, String xml, String xslName) throws SaxonApiException { return AbstractExecute.executeTransform(clazz, xml, xslName); }
	
	protected String executeOnSic(String xml) throws SaxonApiException {
		return xml;
	}
	
	protected static final String DEP_JAVA_API   = "com.systemincloud.ext.vip.modeler.tasks.javatask:com.systemincloud.ext.vip.modeler.tasks.javatask.api";
	protected static final String DEP_PYTHON_API = "com.systemincloud.ext.vip.modeler.tasks.pythontask:com.systemincloud.ext.vip.modeler.tasks.pythontask.process";

}
