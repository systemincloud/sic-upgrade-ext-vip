package com.systemincloud.ext.vip.modeler.upgrade.common;

public interface IExtExecute {
	boolean executeOnRoot(String root);
	String  executeOnFile(String xml);
}
