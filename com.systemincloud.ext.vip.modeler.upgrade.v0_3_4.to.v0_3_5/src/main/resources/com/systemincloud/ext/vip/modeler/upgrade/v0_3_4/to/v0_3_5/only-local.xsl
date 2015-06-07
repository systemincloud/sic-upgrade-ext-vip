<?xml version="1.0"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="2.0"
                xmlns:xmi="http://www.omg.org/XMI" 
                xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
                xmlns:al="http://eclipse.org/graphiti/mm/algorithms" 
                xmlns:dt="http://systemincloud.com/dt" 
                xmlns:pi="http://eclipse.org/graphiti/mm/pictograms" 
                xmlns:sic="http://systemincloud.com/sic">

	<xsl:template match="@*|node()">
		<xsl:copy>
			<xsl:apply-templates select="@*|node()" />
		</xsl:copy>
	</xsl:template>
	<xsl:template match="task[@bundleName='com.systemincloud.ext.vip.modeler.tasks.imagefromfile' and not(@onlyLocal)]">
		<xsl:copy>
			<xsl:attribute name="onlyLocal">true</xsl:attribute>
      		<xsl:apply-templates select="@*|node()" />
    	</xsl:copy>
	</xsl:template>
	<xsl:template match="task[@bundleName='com.systemincloud.ext.vip.modeler.tasks.imagefromurl' and not(@onlyLocal)]">
		<xsl:copy>
			<xsl:attribute name="onlyLocal">true</xsl:attribute>
      		<xsl:apply-templates select="@*|node()" />
    	</xsl:copy>
	</xsl:template>
	<xsl:template match="task[@bundleName='com.systemincloud.ext.vip.modeler.tasks.imagetofile' and not(@onlyLocal)]">
		<xsl:copy>
			<xsl:attribute name="onlyLocal">true</xsl:attribute>
      		<xsl:apply-templates select="@*|node()" />
    	</xsl:copy>
	</xsl:template>
	<xsl:template match="task[@bundleName='com.systemincloud.ext.vip.modeler.tasks.tv' and not(@onlyLocal)]">
		<xsl:copy>
			<xsl:attribute name="onlyLocal">true</xsl:attribute>
      		<xsl:apply-templates select="@*|node()" />
    	</xsl:copy>
	</xsl:template>
	<xsl:template match="task[@bundleName='com.systemincloud.ext.vip.modeler.tasks.videofromfile' and not(@onlyLocal)]">
		<xsl:copy>
			<xsl:attribute name="onlyLocal">true</xsl:attribute>
      		<xsl:apply-templates select="@*|node()" />
    	</xsl:copy>
	</xsl:template>
	<xsl:template match="task[@bundleName='com.systemincloud.ext.vip.modeler.tasks.videofromurl' and not(@onlyLocal)]">
		<xsl:copy>
			<xsl:attribute name="onlyLocal">true</xsl:attribute>
      		<xsl:apply-templates select="@*|node()" />
    	</xsl:copy>
	</xsl:template>
	<xsl:template match="task[@bundleName='com.systemincloud.ext.vip.modeler.tasks.videotofile' and not(@onlyLocal)]">
		<xsl:copy>
			<xsl:attribute name="onlyLocal">true</xsl:attribute>
      		<xsl:apply-templates select="@*|node()" />
    	</xsl:copy>
	</xsl:template>
	<xsl:template match="task[@bundleName='com.systemincloud.ext.vip.modeler.tasks.webcam' and not(@onlyLocal)]">
		<xsl:copy>
			<xsl:attribute name="onlyLocal">true</xsl:attribute>
      		<xsl:apply-templates select="@*|node()" />
    	</xsl:copy>
	</xsl:template>
</xsl:stylesheet>