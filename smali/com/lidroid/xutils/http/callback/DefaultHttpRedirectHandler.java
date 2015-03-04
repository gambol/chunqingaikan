package com.lidroid.xutils.http.callback; class DefaultHttpRedirectHandler { void a() { int a;
a=0;// .class public Lcom/lidroid/xutils/http/callback/DefaultHttpRedirectHandler;
a=0;// .super Ljava/lang/Object;
a=0;// .source "DefaultHttpRedirectHandler.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/lidroid/xutils/http/callback/HttpRedirectHandler;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/http/callback/DefaultHttpRedirectHandler;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public getDirectRequest(Lorg/apache/http/HttpResponse;)Lorg/apache/http/client/methods/HttpRequestBase;
a=0;//     .locals 4
a=0;//     .param p1, "response"    # Lorg/apache/http/HttpResponse;
a=0;// 
a=0;//     .prologue
a=0;//     .line 31
a=0;//     const-string v3, "Location"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p1, v3}, Lorg/apache/http/HttpResponse;->containsHeader(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_1
a=0;// 
a=0;//     .line 32
a=0;//     const-string v3, "Location"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p1, v3}, Lorg/apache/http/HttpResponse;->getFirstHeader(Ljava/lang/String;)Lorg/apache/http/Header;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-interface {v3}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 33
a=0;//     .local v1, "location":Ljava/lang/String;
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Lorg/apache/http/client/methods/HttpGet;
a=0;// 
a=0;//     #v2=(UninitRef,Lorg/apache/http/client/methods/HttpGet;);
a=0;//     invoke-direct {v2, v1}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 34
a=0;//     .local v2, "request":Lorg/apache/http/client/methods/HttpGet;
a=0;//     #v2=(Reference,Lorg/apache/http/client/methods/HttpGet;);
a=0;//     const-string v3, "Set-Cookie"
a=0;// 
a=0;//     invoke-interface {p1, v3}, Lorg/apache/http/HttpResponse;->containsHeader(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 35
a=0;//     const-string v3, "Set-Cookie"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p1, v3}, Lorg/apache/http/HttpResponse;->getFirstHeader(Ljava/lang/String;)Lorg/apache/http/Header;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-interface {v3}, Lorg/apache/http/Header;->getValue()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 36
a=0;//     .local v0, "cookie":Ljava/lang/String;
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "Cookie"
a=0;// 
a=0;//     invoke-virtual {v2, v3, v0}, Lorg/apache/http/client/methods/HttpGet;->addHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 40
a=0;//     .end local v0    # "cookie":Ljava/lang/String;
a=0;//     .end local v1    # "location":Ljava/lang/String;
a=0;//     .end local v2    # "request":Lorg/apache/http/client/methods/HttpGet;
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);
a=0;//     return-object v2
a=0;// 
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Boolean);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     goto :goto_0
a=0;// .end method
}}
