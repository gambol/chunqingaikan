package com.lidroid.xutils; class HttpUtils$3 { void a() { int a;
a=0;// .class Lcom/lidroid/xutils/HttpUtils$3;
a=0;// .super Ljava/lang/Object;
a=0;// .source "HttpUtils.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lorg/apache/http/HttpResponseInterceptor;
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
a=0;//     iput-object p1, p0, Lcom/lidroid/xutils/HttpUtils$3;->this$0:Lcom/lidroid/xutils/HttpUtils;
a=0;// 
a=0;//     .line 98
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/HttpUtils$3;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public process(Lorg/apache/http/HttpResponse;Lorg/apache/http/protocol/HttpContext;)V
a=0;//     .locals 8
a=0;//     .param p1, "response"    # Lorg/apache/http/HttpResponse;
a=0;//     .param p2, "httpContext"    # Lorg/apache/http/protocol/HttpContext;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lorg/apache/http/HttpException;,
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 101
a=0;//     invoke-interface {p1}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     .line 102
a=0;//     .local v2, "entity":Lorg/apache/http/HttpEntity;
a=0;//     #v2=(Reference,Lorg/apache/http/HttpEntity;);
a=0;//     if-nez v2, :cond_1
a=0;// 
a=0;//     .line 114
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 105
a=0;//     :cond_1
a=0;//     #v0=(Uninit);v1=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);
a=0;//     invoke-interface {v2}, Lorg/apache/http/HttpEntity;->getContentEncoding()Lorg/apache/http/Header;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 106
a=0;//     .local v1, "encoding":Lorg/apache/http/Header;
a=0;//     #v1=(Reference,Lorg/apache/http/Header;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 107
a=0;//     invoke-interface {v1}, Lorg/apache/http/Header;->getElements()[Lorg/apache/http/HeaderElement;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,[Lorg/apache/http/HeaderElement;);
a=0;//     array-length v5, v4
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v3=(Integer);v6=(Conflicted);v7=(Conflicted);
a=0;//     if-ge v3, v5, :cond_0
a=0;// 
a=0;//     aget-object v0, v4, v3
a=0;// 
a=0;//     .line 108
a=0;//     .local v0, "element":Lorg/apache/http/HeaderElement;
a=0;//     #v0=(Null);
a=0;//     invoke-interface {v0}, Lorg/apache/http/HeaderElement;->getName()Ljava/lang/String;
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
a=0;//     .line 109
a=0;//     new-instance v3, Lcom/lidroid/xutils/http/client/entity/GZipDecompressingEntity;
a=0;// 
a=0;//     #v3=(UninitRef,Lcom/lidroid/xutils/http/client/entity/GZipDecompressingEntity;);
a=0;//     invoke-interface {p1}, Lorg/apache/http/HttpResponse;->getEntity()Lorg/apache/http/HttpEntity;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {v3, v4}, Lcom/lidroid/xutils/http/client/entity/GZipDecompressingEntity;-><init>(Lorg/apache/http/HttpEntity;)V
a=0;// 
a=0;//     #v3=(Reference,Lcom/lidroid/xutils/http/client/entity/GZipDecompressingEntity;);
a=0;//     invoke-interface {p1, v3}, Lorg/apache/http/HttpResponse;->setEntity(Lorg/apache/http/HttpEntity;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 107
a=0;//     :cond_2
a=0;//     #v3=(Integer);
a=0;//     add-int/lit8 v3, v3, 0x1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
