### 日志框架
- 定制输入目标
- 定制输出格式
- 携带上下文信息
- 运行时选择性输出

> 常见的日志框架
- logback
- SLF4j

**如何使用日志**

```
logging:
  pattern:
    console: "%msg"
可以自定义一个logback-spring.xml 优先级高于application.yml
log.info("name :{} ,password : {}",name,password);

```
### 买家端开发 
#### dao层设计

