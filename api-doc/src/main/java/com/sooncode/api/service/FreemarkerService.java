package com.sooncode.api.service;

import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import freemarker.template.Configuration;
import freemarker.template.DefaultObjectWrapper;
import freemarker.template.Template;

public class FreemarkerService {
	private Configuration configuration;
	private static Log logger = LogFactory.getLog(FreemarkerService.class);

	public FreemarkerService(String templateFilePath) {

		File tempfile = new File(templateFilePath);
		try {
			configuration = new Configuration();
			configuration.setDirectoryForTemplateLoading(tempfile);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public String getString(Map<String, Object> map, String templaeFileName) {

		configuration.setObjectWrapper(new DefaultObjectWrapper());
		configuration.setDefaultEncoding("UTF-8");
		Template template;
		try {
			template = configuration.getTemplate(templaeFileName);
			Writer writer = new StringWriter();
			// Writer riter = new BufferedWriter(new OutputStreamWriter(new
			// FileOutputStream(file), "UTF-8"));
			template.process(map, writer);
			writer.flush();
			String str = writer.toString();
			writer.close();
			
			
			
			
			
			return str;
		} catch (Exception e) {

			e.printStackTrace();
			return null;
		}
	}

}
