package com.twocloo.base.http; class BaseHttpRequestInterceptor { void a() { int a;
a=0;// .class public Lcom/twocloo/base/http/BaseHttpRequestInterceptor;
a=0;// .super Ljava/lang/Object;
a=0;// .source "BaseHttpRequestInterceptor.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lorg/apache/http/HttpRequestInterceptor;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 19
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/base/http/BaseHttpRequestInterceptor;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public process(Lorg/apache/http/HttpRequest;Lorg/apache/http/protocol/HttpContext;)V
a=0;//     .locals 2
a=0;//     .param p1, "request"    # Lorg/apache/http/HttpRequest;
a=0;//     .param p2, "context"    # Lorg/apache/http/protocol/HttpContext;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lorg/apache/http/HttpException;,
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 24
a=0;//     if-eqz p1, :cond_0
a=0;// 
a=0;//     .line 25
a=0;//     const-string v0, "Accept-Encoding"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "gzip"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p1, v0, v1}, Lorg/apache/http/HttpRequest;->setHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 27
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
