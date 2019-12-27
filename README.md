# gmall本地修改版



## 服务说明
|       服务名称       | 服务端口号 | dubbo端口号 |            功能描述            |
| :------------------: | :--------: | :---------: | :----------------------------: |
|      gmall-user      |    8080    |     - -     | 用于测试、演示user整体执行流程 |
|  gmall-user-service  |    8080    |    20880    |           user提供方           |
|    gmall-user-web    |    8070    |     - -     |           user消费方           |
| gmall-manage-service |    8081    |    20881    |          manage提供方          |
|   gmall-manage-web   |    8071    |     - -     |          manage消费方          |
|                      |            |             |                                |
|                      |            |             |                                |
|                      |            |             |                                |
|                      |            |             |                                |

## 注意事项

1. 由于没有gmall-admin项目，为了方便测试，**此项目中大部分的请求都为GET**

2. 使用框架、插件方面的出入：

   ```
   MyBatis、tk-mybatis                 ---------------->                              Mybatis Plus
   ```

   

