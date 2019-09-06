import java.lang.reflect.Method;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import org.junit.Test;

 
public class ModelTest {
	
	@Test
	public void test() {
		invokeModelMethods();
	}
	
	@Test
	public void testEntityCollectionResponses() {
		EntityCollectionRequest request=null;
		List<RiskResults> entries=null;
		List<Results> Resultsentries=null;
		List<Extra> extraEntries=null;
		List<DeviceFingerprintResponse> DeviceFingerprintResponseEntries=null;
		List<DeviceFingerprintRequest>  DeviceFingerprintRequestEntries=null;
		RiskResultsEntityCollectionResponse riskResultsEntityCollectionResponse=new RiskResultsEntityCollectionResponse(request, entries);
	    ResultsEntityCollectionResponse resultsEntityCollectionResponse=new ResultsEntityCollectionResponse(request, Resultsentries);
	    ExtraEntityCollectionResponse ExtraEntityCollectionResponse=new ExtraEntityCollectionResponse(request, extraEntries);
	    DeviceFingerprintResponseEntityCollectionResponse deviceFingerprintResponseEntityCollectionResponse=new DeviceFingerprintResponseEntityCollectionResponse(request, DeviceFingerprintResponseEntries);
	    DeviceFingerprintRequestEntityCollectionResponse deviceFingerprintRequestEntityCollectionResponse=new  DeviceFingerprintRequestEntityCollectionResponse(request,  DeviceFingerprintRequestEntries) ;
	}
	
	@Test
	public void testDeviceFingerPrintRequest() {
		DeviceFingerprintRequest deviceFingerprintRequest=new DeviceFingerprintRequest();
		List<HttpHeaders> httpHeadersList=new ArrayList<>();
		HttpHeaders httpHeaders=new HttpHeaders();
		httpHeaders.setName("name");
		httpHeadersList.add(httpHeaders);
		deviceFingerprintRequest.setHttpHeaders(httpHeadersList);
		deviceFingerprintRequest.isRules();
		deviceFingerprintRequest.setRules(true);
	}
	
	@Test
	public void testResults() {
		Results results=new Results();
		List<String> errors=new ArrayList<>();
		errors.add("errors");
		results.setErrors(errors);
		Extra extra=new Extra();
		extra.setHits("hits");
		results.setExtra(extra);
	}
	
	@Test
	public void testRiskResults() {
		RiskResults riskResults=new RiskResults();
		List<Results> resultsList=new ArrayList<>();
		Results results=new Results();
		results.setScore("score");
		resultsList.add(results);
		riskResults.setResults(resultsList);	
	}
	
	@Test
	public void testDeviceInfoRequest() {
		DeviceInfoRequest deviceInfoRequest=new DeviceInfoRequest();
		deviceInfoRequest.setIncludeDeviceData(true);
		deviceInfoRequest.setIncludeFontPlugins(true);
	}
	
	@Test
	public void testDeviceFingerprintResponse() {
		DeviceFingerprintResponse deviceFingerprintResponse=new DeviceFingerprintResponse();
		deviceFingerprintResponse.setStatusCode(0);
		RiskResults riskResults=new RiskResults();
		riskResults.setScore("score");
		deviceFingerprintResponse.setRiskResults(riskResults);
	}
	
	@Test
	public void testDeviceInfoResponse() {
		DeviceInfoResponse deviceInfoResponse=new DeviceInfoResponse();
		RiskResults riskResults=new RiskResults();
		riskResults.setScore("score");
		deviceInfoResponse.setRiskResults(riskResults);
	}
	
	@Test
	public void testDeviceFingerPrintStreamResponse() {
		DeviceFingerPrintStreamResponse deviceFingerPrintStreamResponse=new DeviceFingerPrintStreamResponse();
		deviceFingerPrintStreamResponse.setStatusCd(0);
	}
	
	@Test
	public void testDeviceFingerPrintStreamRequest() {
		DeviceFingerPrintStreamRequest deviceFingerPrintStreamRequest=new DeviceFingerPrintStreamRequest();
		List<String> platformCodes=new ArrayList<>();
		platformCodes.add("COS");
		deviceFingerPrintStreamRequest.setPlatformCodes(platformCodes);
	}
	
	private void invokeModelMethods() {

		try {
			String[] modelClasses= {
					"Results","RiskResults",
					"DeviceFingerprintRequest", "DeviceFingerprintRequestEntityCollectionResponse",
					"DeviceFingerprintResponse", "DeviceFingerprintResponseEntityCollectionResponse",
					"DeviceFingerPrintStreamRequest", "DeviceFingerPrintStreamResponse",
					"DeviceInfoRequest", "DeviceInfoResponse", "Extra",
					"ExtraEntityCollectionResponse", "HttpHeaders",
					"ResultsEntityCollectionResponse",
					"RiskResultsEntityCollectionResponse","ObjectFactory"
				};
			for(String model:modelClasses) {
				
			Class cls = Class.forName("com.device.fingerprint.model.v3."+model);

			Object obj = cls.newInstance();
			Method[] methods = cls.getMethods();
				for (Method method : methods) {
					if (method.getName().startsWith("set")) {
						Class<?>[] parameterTypes = method.getParameterTypes();
						for (Class<?> class1 : parameterTypes) {
							if (StringUtils.contains(class1.getName(), "String")) {
								method.invoke(obj, "StringValue");
							}
						}
					}
	
					if (method.getName().startsWith("get")) {
						method.invoke(obj);
					}
	
				}
				obj.toString();
				obj.hashCode();
				obj.equals(obj);

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
