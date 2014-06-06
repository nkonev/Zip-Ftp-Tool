package uploader;

import java.io.File;
import java.io.IOException;
import java.util.Observer;

import org.apache.commons.net.ftp.FTPFile;

import timeout.annotation.Timeout;

public interface Uploadable {

	public abstract void doStart();

	public abstract void doEnd();

	public abstract boolean uploadToFTP(File file, String ftpFolder);
	
	public abstract String getServer();
	
	public abstract void addObserver(Observer o);

	public void checkCompleted() throws IOException;

	public abstract FTPFile[] getListOfFile(String filePath) throws IOException;
}