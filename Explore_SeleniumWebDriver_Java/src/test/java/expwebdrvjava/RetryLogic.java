package expwebdrvjava;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryLogic implements IRetryAnalyzer {
	int retryLimit = 2;
	int failureCount = 0;
	@Override
	public boolean retry(ITestResult result) {

		

		if (failureCount<retryLimit) {
			failureCount++;
			
			return true;		
		}
		return false;
	}

}
