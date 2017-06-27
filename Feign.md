##Spring Cloud Feign
<li>Feign描述
<pre>
1、Feign是一种声明式、模板化的HTTP客户端，比Spring的RestTemplate使用起来更方便、优雅。<br/>使用Feign可以做到使用Http请求远程服务时能获得如同调用本地方法一样编码体验。
2、Spring Cloud应用启动时，Feign会扫描标有@FeignClient注解的接口，生成代理，并注册到Spring容器中。<br>生成代理时，Feign会为每个接口方法创建一个RequestTemplate对象，该对象封装了Http请求需要的全部信息
</pre>


<li>Feign知识点
>1、Feign默认情况下，使用的是JDK原生的URLConnection发送请求，没有连接池，会对每一个地址保持一个长连接，利用HTTP的persistence connection。<br/>可以使用Apache的HTTP Client替换Feign的默认配置，从而获取连接池、超时时间等与性能相关的控制能努力。Spring Cloud从Brixtion.SR5版本开始支持这种替换。<br>







<li>参考资料
>http://blog.csdn.net/neosmith/article/details/52449921（使用Spring Cloud Feign作为HTTP客户端调用远程HTTP服务）