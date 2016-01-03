<?xml version="1.0"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="2.0">
    <xsl:param name="version"/>
    
	<xsl:template match="@*|node()">
		<xsl:copy>
			<xsl:apply-templates select="@*|node()" />
		</xsl:copy>
	</xsl:template>
	
	<xsl:template match="path[parent::pydev_pathproperty[@name='org.python.pydev.PROJECT_EXTERNAL_SOURCE_PATH']][last()]">
		<xsl:copy>
			<xsl:apply-templates select="@*|node()" />
		</xsl:copy>
		<xsl:element name="path">${M2_HOME}/com/systemincloud/ext/vip/modeler/tasks/pythontask/com.systemincloud.ext.vip.modeler.tasks.pythontask.process/<xsl:value-of select="$version" />/com.systemincloud.ext.vip.modeler.tasks.pythontask.process-<xsl:value-of select="$version" />.jar</xsl:element>
	</xsl:template>
</xsl:stylesheet>
