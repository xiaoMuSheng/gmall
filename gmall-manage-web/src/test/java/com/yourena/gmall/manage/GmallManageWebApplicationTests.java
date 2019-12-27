package com.yourena.gmall.manage;

import org.csource.common.MyException;
import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
class GmallManageWebApplicationTests {

    private String path;

    @Test
    void contextLoads() throws IOException, MyException {

        path = GmallManageWebApplication.class.getResource("/tracker.conf").getPath();
        ClientGlobal.init(path);
        TrackerClient trackerClient = new TrackerClient();
        TrackerServer trackerServer = trackerClient.getConnection();
        StorageClient storageClient = new StorageClient(trackerServer, null);
        String organFilename = "C:/Users/Administrator/Desktop/1.png";
        String[] uploadFile = storageClient.upload_file(organFilename, "png", null);
        for (String s : uploadFile) {
            System.out.println("s=" + s);
        }

    }

}
