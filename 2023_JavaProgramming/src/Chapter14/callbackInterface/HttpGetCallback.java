package  Chapter14.callbackInterface;

public interface HttpGetCallback {
	void updateProgress(String line);
	void updateDate(String date);
}
