package com.yourena.gmall.manage;

import com.yourena.gmall.GlobalConstant;
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

    @Test
    void contextLoads() throws IOException, MyException {

        StringBuilder url = new StringBuilder(GlobalConstant.Public.FDFS_ADDRESS+"/");

        String tracker = GmallManageWebApplication.class.getResource("/tracker.conf").getPath();
        ClientGlobal.init(tracker);
        TrackerClient trackerClient = new TrackerClient();
        TrackerServer trackerServer = trackerClient.getConnection();
        StorageClient storageClient = new StorageClient(trackerServer, null);
        String[] uploadFile = storageClient.upload_file("C:/Users/Administrator/Desktop/1.png", "png", null);

        url.append(uploadFile[0]);
        url.append("/");
        url.append(uploadFile[1]);

        System.out.println(url);
    }

}
