package com.android.volley.toolbox; class HttpClientStack { void a() { int a;
a=0;// .class public Lcom/android/volley/toolbox/HttpClientStack;
a=0;// .super Ljava/lang/Object;
a=0;// .source "HttpClientStack.java"
a=0;// 
a=0;// # interfaces
a=0;// .implements Lcom/android/volley/toolbox/HttpStack;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static final HEADER_CONTENT_TYPE:Ljava/lang/String; = "Content-Type"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field protected final mClient:Lorg/apache/http/client/HttpClient;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Lorg/apache/http/client/HttpClient;)V
a=0;//     .locals 0
a=0;//     .param p1, "client"    # Lorg/apache/http/client/HttpClient;
a=0;// 
a=0;//     .prologue
a=0;//     .line 51
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 52
a=0;//     #p0=(Reference,Lcom/android/volley/toolbox/HttpClientStack;);
a=0;//     iput-object p1, p0, Lcom/android/volley/toolbox/HttpClientStack;->mClient:Lorg/apache/http/client/HttpClient;
a=0;// 
a=0;//     .line 53
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private static addHeaders(Lorg/apache/http/client/methods/HttpUriRequest;Ljava/util/Map;)V
a=0;//     .locals 3
a=0;//     .param p0, "httpRequest"    # Lorg/apache/http/client/methods/HttpUriRequest;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lorg/apache/http/client/methods/HttpUriRequest;",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 56
a=0;//     .local p1, "headers":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     invoke-interface {p1}, Ljava/util/Map;->keySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/util/Set;);
a=0;//     invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Reference,Ljava/util/Iterator;);
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 59
a=0;//     return-void
a=0;// 
a=0;//     .line 56
a=0;//     :cond_0
a=0;//     invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     .line 57
a=0;//     .local v0, "key":Ljava/lang/String;
a=0;//     invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {p0, v0, v1}, Lorg/apache/http/client/methods/HttpUriRequest;->setHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method static createHttpRequest(Lcom/android/volley/Request;Ljava/util/Map;)Lorg/apache/http/client/methods/HttpUriRequest;
a=0;//     .locals 6
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/android/volley/Request",
a=0;//             "<*>;",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;)",
a=0;//             "Lorg/apache/http/client/methods/HttpUriRequest;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lcom/android/volley/AuthFailureError;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 92
a=0;//     .local p0, "request":Lcom/android/volley/Request;, "Lcom/android/volley/Request<*>;"
a=0;//     .local p1, "additionalHeaders":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     invoke-virtual {p0}, Lcom/android/volley/Request;->getMethod()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     packed-switch v4, :pswitch_data_0
a=0;// 
a=0;//     .line 126
a=0;//     new-instance v4, Ljava/lang/IllegalStateException;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/IllegalStateException;);
a=0;//     const-string v5, "Unknown request method."
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v4, v5}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/IllegalStateException;);
a=0;//     throw v4
a=0;// 
a=0;//     .line 97
a=0;//     :pswitch_0
a=0;//     #v4=(Integer);v5=(Uninit);
a=0;//     invoke-virtual {p0}, Lcom/android/volley/Request;->getPostBody()[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 98
a=0;//     .local v1, "postBody":[B
a=0;//     #v1=(Reference,[B);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 99
a=0;//     new-instance v2, Lorg/apache/http/client/methods/HttpPost;
a=0;// 
a=0;//     #v2=(UninitRef,Lorg/apache/http/client/methods/HttpPost;);
a=0;//     invoke-virtual {p0}, Lcom/android/volley/Request;->getUrl()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v4}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 100
a=0;//     .local v2, "postRequest":Lorg/apache/http/client/methods/HttpPost;
a=0;//     #v2=(Reference,Lorg/apache/http/client/methods/HttpPost;);
a=0;//     const-string v4, "Content-Type"
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/android/volley/Request;->getPostBodyContentType()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4, v5}, Lorg/apache/http/client/methods/HttpPost;->addHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 102
a=0;//     new-instance v0, Lorg/apache/http/entity/ByteArrayEntity;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/apache/http/entity/ByteArrayEntity;);
a=0;//     invoke-direct {v0, v1}, Lorg/apache/http/entity/ByteArrayEntity;-><init>([B)V
a=0;// 
a=0;//     .line 103
a=0;//     .local v0, "entity":Lorg/apache/http/HttpEntity;
a=0;//     #v0=(Reference,Lorg/apache/http/entity/ByteArrayEntity;);
a=0;//     invoke-virtual {v2, v0}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V
a=0;// 
a=0;//     .line 123
a=0;//     .end local v0    # "entity":Lorg/apache/http/HttpEntity;
a=0;//     .end local v1    # "postBody":[B
a=0;//     .end local v2    # "postRequest":Lorg/apache/http/client/methods/HttpPost;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v3=(Conflicted);v5=(Conflicted);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 106
a=0;//     .restart local v1    # "postBody":[B
a=0;//     :cond_0
a=0;//     #v0=(Uninit);v1=(Reference,[B);v2=(Uninit);v3=(Uninit);v4=(Integer);v5=(Uninit);
a=0;//     new-instance v2, Lorg/apache/http/client/methods/HttpGet;
a=0;// 
a=0;//     #v2=(UninitRef,Lorg/apache/http/client/methods/HttpGet;);
a=0;//     invoke-virtual {p0}, Lcom/android/volley/Request;->getUrl()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v4}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Lorg/apache/http/client/methods/HttpGet;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 110
a=0;//     .end local v1    # "postBody":[B
a=0;//     :pswitch_1
a=0;//     #v1=(Uninit);v2=(Uninit);v4=(Integer);
a=0;//     new-instance v2, Lorg/apache/http/client/methods/HttpGet;
a=0;// 
a=0;//     #v2=(UninitRef,Lorg/apache/http/client/methods/HttpGet;);
a=0;//     invoke-virtual {p0}, Lcom/android/volley/Request;->getUrl()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v4}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Lorg/apache/http/client/methods/HttpGet;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 112
a=0;//     :pswitch_2
a=0;//     #v2=(Uninit);v4=(Integer);
a=0;//     new-instance v2, Lorg/apache/http/client/methods/HttpDelete;
a=0;// 
a=0;//     #v2=(UninitRef,Lorg/apache/http/client/methods/HttpDelete;);
a=0;//     invoke-virtual {p0}, Lcom/android/volley/Request;->getUrl()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v4}, Lorg/apache/http/client/methods/HttpDelete;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Lorg/apache/http/client/methods/HttpDelete;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 114
a=0;//     :pswitch_3
a=0;//     #v2=(Uninit);v4=(Integer);
a=0;//     new-instance v2, Lorg/apache/http/client/methods/HttpPost;
a=0;// 
a=0;//     #v2=(UninitRef,Lorg/apache/http/client/methods/HttpPost;);
a=0;//     invoke-virtual {p0}, Lcom/android/volley/Request;->getUrl()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v4}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 115
a=0;//     .restart local v2    # "postRequest":Lorg/apache/http/client/methods/HttpPost;
a=0;//     #v2=(Reference,Lorg/apache/http/client/methods/HttpPost;);
a=0;//     const-string v4, "Content-Type"
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/android/volley/Request;->getBodyContentType()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v4, v5}, Lorg/apache/http/client/methods/HttpPost;->addHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 116
a=0;//     invoke-static {v2, p0}, Lcom/android/volley/toolbox/HttpClientStack;->setEntityIfNonEmptyBody(Lorg/apache/http/client/methods/HttpEntityEnclosingRequestBase;Lcom/android/volley/Request;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 120
a=0;//     .end local v2    # "postRequest":Lorg/apache/http/client/methods/HttpPost;
a=0;//     :pswitch_4
a=0;//     #v2=(Uninit);v4=(Integer);v5=(Uninit);
a=0;//     new-instance v3, Lorg/apache/http/client/methods/HttpPut;
a=0;// 
a=0;//     #v3=(UninitRef,Lorg/apache/http/client/methods/HttpPut;);
a=0;//     invoke-virtual {p0}, Lcom/android/volley/Request;->getUrl()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v3, v4}, Lorg/apache/http/client/methods/HttpPut;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 121
a=0;//     .local v3, "putRequest":Lorg/apache/http/client/methods/HttpPut;
a=0;//     #v3=(Reference,Lorg/apache/http/client/methods/HttpPut;);
a=0;//     const-string v4, "Content-Type"
a=0;// 
a=0;//     invoke-virtual {p0}, Lcom/android/volley/Request;->getBodyContentType()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v4, v5}, Lorg/apache/http/client/methods/HttpPut;->addHeader(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 122
a=0;//     invoke-static {v3, p0}, Lcom/android/volley/toolbox/HttpClientStack;->setEntityIfNonEmptyBody(Lorg/apache/http/client/methods/HttpEntityEnclosingRequestBase;Lcom/android/volley/Request;)V
a=0;// 
a=0;//     move-object v2, v3
a=0;// 
a=0;//     .line 123
a=0;//     #v2=(Reference,Lorg/apache/http/client/methods/HttpPut;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 92
a=0;//     #v0=(Unknown);v1=(Unknown);v2=(Unknown);v3=(Unknown);v4=(Unknown);v5=(Unknown);p0=(Unknown);p1=(Unknown);
a=0;//     nop
a=0;// 
a=0;//     :pswitch_data_0
a=0;//     .packed-switch -0x1
a=0;//         :pswitch_0
a=0;//         :pswitch_1
a=0;//         :pswitch_3
a=0;//         :pswitch_4
a=0;//         :pswitch_2
a=0;//     .end packed-switch
a=0;// .end method
a=0;// 
a=0;// .method private static getPostParameterPairs(Ljava/util/Map;)Ljava/util/List;
a=0;//     .locals 5
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;)",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lorg/apache/http/NameValuePair;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 63
a=0;//     .local p0, "postParams":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     new-instance v1, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-interface {p0}, Ljava/util/Map;->size()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V
a=0;// 
a=0;//     .line 64
a=0;//     .local v1, "result":Ljava/util/List;, "Ljava/util/List<Lorg/apache/http/NameValuePair;>;"
a=0;//     #v1=(Reference,Ljava/util/ArrayList;);
a=0;//     invoke-interface {p0}, Ljava/util/Map;->keySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/Set;);
a=0;//     invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v3=(Reference,Ljava/util/Iterator;);v4=(Conflicted);
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-nez v2, :cond_0
a=0;// 
a=0;//     .line 67
a=0;//     return-object v1
a=0;// 
a=0;//     .line 64
a=0;//     :cond_0
a=0;//     invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     .line 65
a=0;//     .local v0, "key":Ljava/lang/String;
a=0;//     new-instance v4, Lorg/apache/http/message/BasicNameValuePair;
a=0;// 
a=0;//     #v4=(UninitRef,Lorg/apache/http/message/BasicNameValuePair;);
a=0;//     invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v2, Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v4, v0, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Lorg/apache/http/message/BasicNameValuePair;);
a=0;//     invoke-interface {v1, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static setEntityIfNonEmptyBody(Lorg/apache/http/client/methods/HttpEntityEnclosingRequestBase;Lcom/android/volley/Request;)V
a=0;//     .locals 2
a=0;//     .param p0, "httpRequest"    # Lorg/apache/http/client/methods/HttpEntityEnclosingRequestBase;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lorg/apache/http/client/methods/HttpEntityEnclosingRequestBase;",
a=0;//             "Lcom/android/volley/Request",
a=0;//             "<*>;)V"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lcom/android/volley/AuthFailureError;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 132
a=0;//     .local p1, "request":Lcom/android/volley/Request;, "Lcom/android/volley/Request<*>;"
a=0;//     invoke-virtual {p1}, Lcom/android/volley/Request;->getBody()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 133
a=0;//     .local v0, "body":[B
a=0;//     #v0=(Reference,[B);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 134
a=0;//     new-instance v1, Lorg/apache/http/entity/ByteArrayEntity;
a=0;// 
a=0;//     #v1=(UninitRef,Lorg/apache/http/entity/ByteArrayEntity;);
a=0;//     invoke-direct {v1, v0}, Lorg/apache/http/entity/ByteArrayEntity;-><init>([B)V
a=0;// 
a=0;//     .line 135
a=0;//     .local v1, "entity":Lorg/apache/http/HttpEntity;
a=0;//     #v1=(Reference,Lorg/apache/http/entity/ByteArrayEntity;);
a=0;//     invoke-virtual {p0, v1}, Lorg/apache/http/client/methods/HttpEntityEnclosingRequestBase;->setEntity(Lorg/apache/http/HttpEntity;)V
a=0;// 
a=0;//     .line 137
a=0;//     .end local v1    # "entity":Lorg/apache/http/HttpEntity;
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected onPrepareRequest(Lorg/apache/http/client/methods/HttpUriRequest;)V
a=0;//     .locals 0
a=0;//     .param p1, "request"    # Lorg/apache/http/client/methods/HttpUriRequest;
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 146
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public performRequest(Lcom/android/volley/Request;Ljava/util/Map;)Lorg/apache/http/HttpResponse;
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Lcom/android/volley/Request",
a=0;//             "<*>;",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;)",
a=0;//             "Lorg/apache/http/HttpResponse;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;,
a=0;//             Lcom/android/volley/AuthFailureError;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 73
a=0;//     .local p1, "request":Lcom/android/volley/Request;, "Lcom/android/volley/Request<*>;"
a=0;//     .local p2, "additionalHeaders":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;"
a=0;//     invoke-static {p1, p2}, Lcom/android/volley/toolbox/HttpClientStack;->createHttpRequest(Lcom/android/volley/Request;Ljava/util/Map;)Lorg/apache/http/client/methods/HttpUriRequest;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 74
a=0;//     .local v1, "httpRequest":Lorg/apache/http/client/methods/HttpUriRequest;
a=0;//     #v1=(Reference,Lorg/apache/http/client/methods/HttpUriRequest;);
a=0;//     invoke-static {v1, p2}, Lcom/android/volley/toolbox/HttpClientStack;->addHeaders(Lorg/apache/http/client/methods/HttpUriRequest;Ljava/util/Map;)V
a=0;// 
a=0;//     .line 75
a=0;//     invoke-virtual {p1}, Lcom/android/volley/Request;->getHeaders()Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/Map;);
a=0;//     invoke-static {v1, v3}, Lcom/android/volley/toolbox/HttpClientStack;->addHeaders(Lorg/apache/http/client/methods/HttpUriRequest;Ljava/util/Map;)V
a=0;// 
a=0;//     .line 76
a=0;//     invoke-virtual {p0, v1}, Lcom/android/volley/toolbox/HttpClientStack;->onPrepareRequest(Lorg/apache/http/client/methods/HttpUriRequest;)V
a=0;// 
a=0;//     .line 77
a=0;//     invoke-interface {v1}, Lorg/apache/http/client/methods/HttpUriRequest;->getParams()Lorg/apache/http/params/HttpParams;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 78
a=0;//     .local v0, "httpParams":Lorg/apache/http/params/HttpParams;
a=0;//     #v0=(Reference,Lorg/apache/http/params/HttpParams;);
a=0;//     invoke-virtual {p1}, Lcom/android/volley/Request;->getTimeoutMs()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 81
a=0;//     .local v2, "timeoutMs":I
a=0;//     #v2=(Integer);
a=0;//     const/16 v3, 0x1388
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     invoke-static {v0, v3}, Lorg/apache/http/params/HttpConnectionParams;->setConnectionTimeout(Lorg/apache/http/params/HttpParams;I)V
a=0;// 
a=0;//     .line 82
a=0;//     invoke-static {v0, v2}, Lorg/apache/http/params/HttpConnectionParams;->setSoTimeout(Lorg/apache/http/params/HttpParams;I)V
a=0;// 
a=0;//     .line 83
a=0;//     iget-object v3, p0, Lcom/android/volley/toolbox/HttpClientStack;->mClient:Lorg/apache/http/client/HttpClient;
a=0;// 
a=0;//     #v3=(Reference,Lorg/apache/http/client/HttpClient;);
a=0;//     invoke-interface {v3, v1}, Lorg/apache/http/client/HttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     return-object v3
a=0;// .end method
}}
