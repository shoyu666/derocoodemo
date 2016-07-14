# derocoodemo
<br>a demo depend rocoofix
#基于https://github.com/dodola/RocooFix 静态修复部分的demo

<br>demo 涉及：
<br>1抽象patch补丁包的路径（默认放在data/data/下，或者放在sdcard,可以自定义）
<br>2抽象patch下载(简单实现了个默认的，可以根据需要修改成自己的下载逻辑)


<br>效果:
 ![image](https://github.com/shoyu666/derocoodemo/blob/master/app/doc/QQ20160708-1.png)


| 问题        | 原因           | 建议  |
| ------------- |:-------------:| -----:|
| java.lang.IllegalAccessError: Class ref in pre-verified class resolved to unexpected implementation      | 插桩没有成功 | app反编译看看是否插桩成功，(之前用dex2jar出现看不到插庄，但实际已经插庄)这里推荐工具jadx-gui（从群友幽幽那里得知的工具，在此鸣谢）（derocoodemo/app/doc/QQ20160708-0.png是插庄成功的截图） |
| patch.jar生成不了|估计流程不对 |参考(derocoodemo/app/doc/77d89a39e481ed8c0cd5f4c8a2cfbe86f5bdf8b9_1.jpg)|


<br>mark:
<br>debug阶段建议设置成sdcard的，方便替换测试
<br>RocooFix的大大在561394234群里，包括其它热修复框架的大大
<br>需要增量补丁的可以使用bsdiff实现

<br>热修复相关文章:

<br>1 rocoo静态原理基于扣扣空间文章
<br>https://mp.weixin.qq.com/s?__biz=MzI1MTA1MzM2Nw==&mid=400118620&idx=1&sn=b4fdd5055731290eef12ad0d17f39d4a&scene=1&srcid=1106Imu9ZgwybID13e7y2nEi#wechat_redirect

<br>2微信的总结
http://mp.weixin.qq.com/s?__biz=MzAwNDY1ODY2OQ==&mid=2649286306&idx=1&sn=d6b2865e033a99de60b2d4314c6e0a25&scene=23&srcid=0705vd1zLzQEHZ9G6JyQSqTG#rd
