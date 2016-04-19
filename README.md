# android_mvp_weather
android应用架构之MVP实现天气实例

我们知道，Android App 本质上抽象成两个层次：视图和数据。为了App在发展过程中快速的适应变化，方便维护和快速迭代，我们要将数据和视图解耦，而在解藕方面我们的前辈们在漫长的软件开发经验中为我们提供了两套流行的指导框架：MVC和MVP，其中MVP近年来在Android应用开发上逐渐流行。最近在开发群里有小伙伴也问道了这个问题，本章我将结合具体例子根据自己的理解用MVP进行实现。

先看下最后的效果：



最后的效果很简单吧，那么我们就来梳理一下整个思路：


MVP流程，大概可以分成四步：
1.UI引用Presenter来实现View的方法；
2.Presenter调用Model，走Model里边的逻辑；
3.Model具体逻辑实现，并且回调Presenter；
4.Presenter回调View，即回到UI，回调View方法



gradle文件

compile 'com.loopj.android:android-async-http:1.4.9'
compile 'com.google.code.gson:gson:2.3.1'


说明：1.网络请求使用了async-http;

2.json解析使用的gson；

3.本实例数据来源于聚合数据：https://www.juhe.cn/ 有需要的可自取。






其他也没什么了，集合项目来看应该会很清晰：

1.项目结构：




2.MVP之M



CityResultModelBean.java
 本实例的bean比较复杂，字段较多，主要是根据聚合接口返回的response而定的，可以忽略，纯bean，无他。



CityWeatherModel.java
 具体业务的处理，此处就是数据的获取，检索和解析等操作；


3.MVP之V


WeatherView.java
 处理业务需要哪些方法；


MainActivity.java
 只关心本层的数据和ui展示；


3.MVP之P:


WeatherPresenter.java 是model和view的连接桥梁，从model检索到数据之后返回给view进行展示；




小结：




MVC模式

视图（View）：用户界面。

控制器（Controller）：业务逻辑

模型（Model）：数据保存

View 传送指令到 Controller

Controller 完成业务逻辑后，要求 Model 改变状态

Model 将新的数据发送到 View，用户得到反馈

在传统的mvc模式中，可能activity和fragment更多扮演了view和controller的双重身份，数据和视图的耦合程度较高。




MVP模式

在MVP中，Activity和Fragment扮演View层，Presenter相当于MVC模式中Controller层，处理业务逻辑。

一般一个Activity都有一个相应的presenter通过model来处理数据。




最后，推荐一个公众号 anything_android

包括但不局限于android前沿火热技术快送，干货分享，职场焦点，IT、数码3C业界头条咨询，当然偶尔也会有段子和鸡汤。

