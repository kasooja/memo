package edu.insight.wordvec.otdf;


import java.util.List;




/**
 *  
 * @author kasooja 
 */
public class OTDFFileWriter {	
	
	/*
	 * return true if written correctly
	 */
	public static boolean writeFile(OTDFFile file) {		
		BasicFileTools.writeFile(file.getAbsolutePath(), getFeaturesAsPropertyFileString(file.getFeatures()));
		return true;
	}

	/*
	 * convert the feature list into a string following properties file format
	 */
	private static String getFeaturesAsPropertyFileString(List<StringFeature> features) {
		StringBuffer  buffer = new StringBuffer();
		for(StringFeature feature : features) 
			buffer.append(feature.getFeatureName() + "=" + feature.getFeatureValue()+ "\n\n");			
		return buffer.toString().trim();
	}	
	
}
