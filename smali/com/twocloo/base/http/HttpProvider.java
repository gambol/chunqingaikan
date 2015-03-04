package com.twocloo.base.http; class HttpProvider { void a() { int a;
a=0;// .class public Lcom/twocloo/base/http/HttpProvider;
a=0;// .super Ljava/lang/Object;
a=0;// .source "HttpProvider.java"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private client:Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method private constructor <init>(II)V
a=0;//     .locals 3
a=0;//     .param p1, "conTimeout"    # I
a=0;//     .param p2, "soTimeout"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 26
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 27
a=0;//     #p0=(Reference,Lcom/twocloo/base/http/HttpProvider;);
a=0;//     new-instance v0, Lorg/apache/http/params/BasicHttpParams;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/apache/http/params/BasicHttpParams;);
a=0;//     invoke-direct {v0}, Lorg/apache/http/params/BasicHttpParams;-><init>()V
a=0;// 
a=0;//     .line 29
a=0;//     .local v0, "httpParams":Lorg/apache/http/params/HttpParams;
a=0;//     #v0=(Reference,Lorg/apache/http/params/BasicHttpParams;);
a=0;//     invoke-static {v0, p1}, Lorg/apache/http/params/HttpConnectionParams;->setConnectionTimeout(Lorg/apache/http/params/HttpParams;I)V
a=0;// 
a=0;//     .line 30
a=0;//     invoke-static {v0, p2}, Lorg/apache/http/params/HttpConnectionParams;->setSoTimeout(Lorg/apache/http/params/HttpParams;I)V
a=0;// 
a=0;//     .line 31
a=0;//     const-string v1, "http.protocol.handle-redirects"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     invoke-interface {v0, v1, v2}, Lorg/apache/http/params/HttpParams;->setBooleanParameter(Ljava/lang/String;Z)Lorg/apache/http/params/HttpParams;
a=0;// 
a=0;//     .line 33
a=0;//     const-wide/16 v1, 0x7d0
a=0;// 
a=0;//     #v1=(LongLo);v2=(LongHi);
a=0;//     invoke-static {v0, v1, v2}, Lorg/apache/http/conn/params/ConnManagerParams;->setTimeout(Lorg/apache/http/params/HttpParams;J)V
a=0;// 
a=0;//     .line 34
a=0;//     const/16 v1, 0x1770
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     invoke-static {v0, v1}, Lorg/apache/http/params/HttpConnectionParams;->setConnectionTimeout(Lorg/apache/http/params/HttpParams;I)V
a=0;// 
a=0;//     .line 35
a=0;//     const/16 v1, 0x7530
a=0;// 
a=0;//     invoke-static {v0, v1}, Lorg/apache/http/params/HttpConnectionParams;->setSoTimeout(Lorg/apache/http/params/HttpParams;I)V
a=0;// 
a=0;//     .line 37
a=0;//     new-instance v1, Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     #v1=(UninitRef,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     invoke-direct {v1, v0}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>(Lorg/apache/http/params/HttpParams;)V
a=0;// 
a=0;//     #v1=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     iput-object v1, p0, Lcom/twocloo/base/http/HttpProvider;->client:Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     .line 40
a=0;//     iget-object v1, p0, Lcom/twocloo/base/http/HttpProvider;->client:Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     new-instance v2, Lcom/twocloo/base/http/BaseHttpRequestInterceptor;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/base/http/BaseHttpRequestInterceptor;);
a=0;//     invoke-direct {v2}, Lcom/twocloo/base/http/BaseHttpRequestInterceptor;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/base/http/BaseHttpRequestInterceptor;);
a=0;//     invoke-virtual {v1, v2}, Lorg/apache/http/impl/client/DefaultHttpClient;->addRequestInterceptor(Lorg/apache/http/HttpRequestInterceptor;)V
a=0;// 
a=0;//     .line 41
a=0;//     iget-object v1, p0, Lcom/twocloo/base/http/HttpProvider;->client:Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     new-instance v2, Lcom/twocloo/base/http/BaseHttpResponseInterceptor;
a=0;// 
a=0;//     #v2=(UninitRef,Lcom/twocloo/base/http/BaseHttpResponseInterceptor;);
a=0;//     invoke-direct {v2}, Lcom/twocloo/base/http/BaseHttpResponseInterceptor;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Lcom/twocloo/base/http/BaseHttpResponseInterceptor;);
a=0;//     invoke-virtual {v1, v2}, Lorg/apache/http/impl/client/DefaultHttpClient;->addResponseInterceptor(Lorg/apache/http/HttpResponseInterceptor;)V
a=0;// 
a=0;//     .line 43
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static newInstance()Lcom/twocloo/base/http/HttpProvider;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     new-instance v0, Lcom/twocloo/base/http/HttpProvider;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/base/http/HttpProvider;);
a=0;//     const/16 v1, 0x1770
a=0;// 
a=0;//     #v1=(PosShort);
a=0;//     const/16 v2, 0x7530
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     invoke-direct {v0, v1, v2}, Lcom/twocloo/base/http/HttpProvider;-><init>(II)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/base/http/HttpProvider;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public static newInstance(II)Lcom/twocloo/base/http/HttpProvider;
a=0;//     .locals 1
a=0;//     .param p0, "conTimeout"    # I
a=0;//     .param p1, "soTimeout"    # I
a=0;// 
a=0;//     .prologue
a=0;//     .line 62
a=0;//     new-instance v0, Lcom/twocloo/base/http/HttpProvider;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/base/http/HttpProvider;);
a=0;//     invoke-direct {v0, p0, p1}, Lcom/twocloo/base/http/HttpProvider;-><init>(II)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/twocloo/base/http/HttpProvider;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public get(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;)Lcom/twocloo/base/http/HttpResult;
a=0;//     .locals 2
a=0;//     .param p1, "url"    # Ljava/lang/String;
a=0;//     .param p4, "encoding"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;",
a=0;//             "Ljava/lang/String;",
a=0;//             ")",
a=0;//             "Lcom/twocloo/base/http/HttpResult;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/Throwable;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 78
a=0;//     .local p2, "headers":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     .local p3, "params":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     iget-object v1, p0, Lcom/twocloo/base/http/HttpProvider;->client:Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     #v1=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     invoke-static {p1, p2, p3, p4, v1}, Lcom/twocloo/base/util/HttpUtils;->get(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Lorg/apache/http/impl/client/DefaultHttpClient;)Lcom/twocloo/base/http/HttpResult;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 80
a=0;//     .local v0, "result":Lcom/twocloo/base/http/HttpResult;
a=0;//     #v0=(Reference,Lcom/twocloo/base/http/HttpResult;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public post(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;)Lcom/twocloo/base/http/HttpResult;
a=0;//     .locals 2
a=0;//     .param p1, "url"    # Ljava/lang/String;
a=0;//     .param p4, "encoding"    # Ljava/lang/String;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;",
a=0;//             "Ljava/lang/String;",
a=0;//             ")",
a=0;//             "Lcom/twocloo/base/http/HttpResult;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/Throwable;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 96
a=0;//     .local p2, "headers":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     .local p3, "params":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     iget-object v1, p0, Lcom/twocloo/base/http/HttpProvider;->client:Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     #v1=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     invoke-static {p1, p2, p3, p4, v1}, Lcom/twocloo/base/util/HttpUtils;->post(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Lorg/apache/http/impl/client/DefaultHttpClient;)Lcom/twocloo/base/http/HttpResult;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 98
a=0;//     .local v0, "result":Lcom/twocloo/base/http/HttpResult;
a=0;//     #v0=(Reference,Lcom/twocloo/base/http/HttpResult;);
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public shutdown()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 105
a=0;//     iget-object v0, p0, Lcom/twocloo/base/http/HttpProvider;->client:Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/impl/client/DefaultHttpClient;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 106
a=0;//     iget-object v0, p0, Lcom/twocloo/base/http/HttpProvider;->client:Lorg/apache/http/impl/client/DefaultHttpClient;
a=0;// 
a=0;//     invoke-virtual {v0}, Lorg/apache/http/impl/client/DefaultHttpClient;->getConnectionManager()Lorg/apache/http/conn/ClientConnectionManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Lorg/apache/http/conn/ClientConnectionManager;->shutdown()V
a=0;// 
a=0;//     .line 107
a=0;//     :cond_0
a=0;//     return-void
a=0;// .end method
}}
