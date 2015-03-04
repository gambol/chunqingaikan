package com.twocloo.base.http; class BaseHttpResponseInterceptor { void a() { int a;
a=0;// .class public Lcom/twocloo/base/http/BaseHttpResponseInterceptor;
a=0;// .super Ljava/lang/Object;
a=0;// .source "BaseHttpResponseInterceptor.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lorg/apache/http/HttpResponseInterceptor;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 22
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/twocloo/base/http/BaseHttpResponseInterceptor;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public process(Lorg/apache/http/HttpResponse;Lorg/apache/http/protocol/HttpContext;)V
a=0;//     .locals 8
a=0;//     .param p1, "response"    # Lorg/apache/http/HttpResponse;
a=0;//     .param p2, "context"    # Lorg/apache/http/protocol/HttpContext;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lorg/apache/http/HttpException;,
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 27
a=0;//     invoke-interface {p1}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 28
a=0;//     .local v2, "entity":Lorg/apache/http/HttpEntity;
a=0;//     #v2=(Reference,Lorg/apache/http/HttpEntity;);
a=0;//     invoke-interface {v2}, Lorg/apache/http/HttpEntity;->getContentEncoding()Lorg/apache/http/Header;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 31
a=0;//     .local v0, "ceheader":Lorg/apache/http/Header;
a=0;//     #v0=(Reference,Lorg/apache/http/Header;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 32
a=0;//     invoke-interface {v0}, Lorg/apache/http/Header;->getElements()[Lorg/apache/http/HeaderElement;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,[Lorg/apache/http/HeaderElement;);
a=0;//     array-length v5, v4
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v3=(Integer);v6=(Conflicted);v7=(Conflicted);
a=0;//     if-lt v3, v5, :cond_1
a=0;// 
a=0;//     .line 40
a=0;//     :cond_0
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 32
a=0;//     :cond_1
a=0;//     #v3=(Integer);v4=(Reference,[Lorg/apache/http/HeaderElement;);v5=(Integer);
a=0;//     aget-object v1, v4, v3
a=0;// 
a=0;//     .line 33
a=0;//     .local v1, "element":Lorg/apache/http/HeaderElement;
a=0;//     #v1=(Null);
a=0;//     invoke-interface {v1}, Lorg/apache/http/HeaderElement;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     const-string v7, "gzip"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v6, v7}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-eqz v6, :cond_2
a=0;// 
a=0;//     .line 34
a=0;//     new-instance v3, Lcom/twocloo/base/http/GzipDecompressingEntity;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/twocloo/base/http/GzipDecompressingEntity;);
a=0;//     invoke-interface {p1}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v3, v4}, Lcom/twocloo/base/http/GzipDecompressingEntity;-><init>(Lorg/apache/http/HttpEntity;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/twocloo/base/http/GzipDecompressingEntity;);
a=0;//     invoke-interface {p1, v3}, Lorg/apache/http/HttpResponse;->setEntity(Lorg/apache/http/HttpEntity;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 32
a=0;//     :cond_2
a=0;//     #v3=(Integer);
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
