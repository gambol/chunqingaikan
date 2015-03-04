package com.lidroid.xutils; class HttpUtils$2 { void a() { int a;
a=0;// .class Lcom/lidroid/xutils/HttpUtils$2;
a=0;// .super Ljava/lang/Object;
a=0;// .source "HttpUtils.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lorg/apache/http/HttpRequestInterceptor;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingMethod;
a=0;//     value = Lcom/lidroid/xutils/HttpUtils;-><init>(I)V
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x0
a=0;//     name = null
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic this$0:Lcom/lidroid/xutils/HttpUtils;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcom/lidroid/xutils/HttpUtils;)V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     iput-object p1, p0, Lcom/lidroid/xutils/HttpUtils$2;->this$0:Lcom/lidroid/xutils/HttpUtils;
a=0;// 
a=0;//     .line 89
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/HttpUtils$2;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public process(Lorg/apache/http/HttpRequest;Lorg/apache/http/protocol/HttpContext;)V
a=0;//     .locals 2
a=0;//     .param p1, "httpRequest"    # Lorg/apache/http/HttpRequest;
a=0;//     .param p2, "httpContext"    # Lorg/apache/http/protocol/HttpContext;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lorg/apache/http/HttpException;,
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 92
a=0;//     const-string v0, "Accept-Encoding"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p1, v0}, Lorg/apache/http/HttpRequest;->containsHeader(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 93
a=0;//     const-string v0, "Accept-Encoding"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const-string v1, "gzip"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {p1, v0, v1}, Lorg/apache/http/HttpRequest;->addHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 95
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
}}
