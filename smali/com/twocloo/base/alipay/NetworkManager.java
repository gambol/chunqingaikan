package com.twocloo.base.alipay; class NetworkManager { void a() { int a;
a=0;// .class public Lcom/twocloo/base/alipay/NetworkManager;
a=0;// .super Ljava/lang/Object;
a=0;// .source "NetworkManager.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field static final TAG:Ljava/lang/String; = "NetworkManager"
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private connectTimeout:I
a=0;// 
a=0;// .field mContext:Landroid/content/Context;
a=0;// 
a=0;// .field mProxy:Ljava/net/Proxy;
a=0;// 
a=0;// .field private readTimeout:I
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v0, 0x7530
a=0;// 
a=0;//     .line 45
a=0;//     #v0=(PosShort);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 40
a=0;//     #p0=(Reference,Lcom/twocloo/base/alipay/NetworkManager;);
a=0;//     iput v0, p0, Lcom/twocloo/base/alipay/NetworkManager;->connectTimeout:I
a=0;// 
a=0;//     .line 41
a=0;//     iput v0, p0, Lcom/twocloo/base/alipay/NetworkManager;->readTimeout:I
a=0;// 
a=0;//     .line 42
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     iput-object v0, p0, Lcom/twocloo/base/alipay/NetworkManager;->mProxy:Ljava/net/Proxy;
a=0;// 
a=0;//     .line 46
a=0;//     iput-object p1, p0, Lcom/twocloo/base/alipay/NetworkManager;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     .line 47
a=0;//     invoke-direct {p0}, Lcom/twocloo/base/alipay/NetworkManager;->setDefaultHostnameVerifier()V
a=0;// 
a=0;//     .line 48
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private detectProxy()V
a=0;//     .locals 7
a=0;// 
a=0;//     .prologue
a=0;//     .line 54
a=0;//     iget-object v5, p0, Lcom/twocloo/base/alipay/NetworkManager;->mContext:Landroid/content/Context;
a=0;// 
a=0;//     #v5=(Reference,Landroid/content/Context;);
a=0;//     const-string v6, "connectivity"
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v5, v6}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Landroid/net/ConnectivityManager;
a=0;// 
a=0;//     .line 55
a=0;//     .local v0, "cm":Landroid/net/ConnectivityManager;
a=0;//     invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 56
a=0;//     .local v1, "ni":Landroid/net/NetworkInfo;
a=0;//     #v1=(Reference,Landroid/net/NetworkInfo;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/net/NetworkInfo;->isAvailable()Z
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Boolean);
a=0;//     if-eqz v5, :cond_0
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/net/NetworkInfo;->getType()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     if-nez v5, :cond_0
a=0;// 
a=0;//     .line 57
a=0;//     invoke-static {}, Landroid/net/Proxy;->getDefaultHost()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 58
a=0;//     .local v3, "proxyHost":Ljava/lang/String;
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {}, Landroid/net/Proxy;->getDefaultPort()I
a=0;// 
a=0;//     move-result v2
a=0;// 
a=0;//     .line 59
a=0;//     .local v2, "port":I
a=0;//     #v2=(Integer);
a=0;//     if-eqz v3, :cond_0
a=0;// 
a=0;//     .line 60
a=0;//     new-instance v4, Ljava/net/InetSocketAddress;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/net/InetSocketAddress;);
a=0;//     invoke-direct {v4, v3, v2}, Ljava/net/InetSocketAddress;-><init>(Ljava/lang/String;I)V
a=0;// 
a=0;//     .line 61
a=0;//     .local v4, "sa":Ljava/net/InetSocketAddress;
a=0;//     #v4=(Reference,Ljava/net/InetSocketAddress;);
a=0;//     new-instance v5, Ljava/net/Proxy;
a=0;// 
a=0;//     #v5=(UninitRef,Ljava/net/Proxy;);
a=0;//     sget-object v6, Ljava/net/Proxy$Type;->HTTP:Ljava/net/Proxy$Type;
a=0;// 
a=0;//     invoke-direct {v5, v6, v4}, Ljava/net/Proxy;-><init>(Ljava/net/Proxy$Type;Ljava/net/SocketAddress;)V
a=0;// 
a=0;//     #v5=(Reference,Ljava/net/Proxy;);
a=0;//     iput-object v5, p0, Lcom/twocloo/base/alipay/NetworkManager;->mProxy:Ljava/net/Proxy;
a=0;// 
a=0;//     .line 64
a=0;//     .end local v2    # "port":I
a=0;//     .end local v3    # "proxyHost":Ljava/lang/String;
a=0;//     .end local v4    # "sa":Ljava/net/InetSocketAddress;
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private setDefaultHostnameVerifier()V
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 68
a=0;//     new-instance v0, Lcom/twocloo/base/alipay/NetworkManager$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/twocloo/base/alipay/NetworkManager$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/twocloo/base/alipay/NetworkManager$1;-><init>(Lcom/twocloo/base/alipay/NetworkManager;)V
a=0;// 
a=0;//     .line 74
a=0;//     .local v0, "hv":Ljavax/net/ssl/HostnameVerifier;
a=0;//     #v0=(Reference,Lcom/twocloo/base/alipay/NetworkManager$1;);
a=0;//     invoke-static {v0}, Ljavax/net/ssl/HttpsURLConnection;->setDefaultHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V
a=0;// 
a=0;//     .line 75
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public SendAndWaitResponse(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 11
a=0;//     .param p1, "strReqData"    # Ljava/lang/String;
a=0;//     .param p2, "strUrl"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 88
a=0;//     invoke-direct {p0}, Lcom/twocloo/base/alipay/NetworkManager;->detectProxy()V
a=0;// 
a=0;//     .line 90
a=0;//     const/4 v7, 0x0
a=0;// 
a=0;//     .line 91
a=0;//     .local v7, "strResponse":Ljava/lang/String;
a=0;//     #v7=(Null);
a=0;//     new-instance v6, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v6=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 92
a=0;//     .local v6, "pairs":Ljava/util/ArrayList;, "Ljava/util/ArrayList<Lorg/apache/http/message/BasicNameValuePair;>;"
a=0;//     #v6=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v9, Lorg/apache/http/message/BasicNameValuePair;
a=0;// 
a=0;//     #v9=(UninitRef,Lorg/apache/http/message/BasicNameValuePair;);
a=0;//     const-string v10, "requestData"
a=0;// 
a=0;//     #v10=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v9, v10, p1}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v9=(Reference,Lorg/apache/http/message/BasicNameValuePair;);
a=0;//     invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 94
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     .line 97
a=0;//     .local v3, "httpConnect":Ljava/net/HttpURLConnection;
a=0;//     :try_start_0
a=0;//     #v3=(Null);
a=0;//     new-instance v5, Lorg/apache/http/client/entity/UrlEncodedFormEntity;
a=0;// 
a=0;//     #v5=(UninitRef,Lorg/apache/http/client/entity/UrlEncodedFormEntity;);
a=0;//     const-string v9, "utf-8"
a=0;// 
a=0;//     invoke-direct {v5, v6, v9}, Lorg/apache/http/client/entity/UrlEncodedFormEntity;-><init>(Ljava/util/List;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 98
a=0;//     .local v5, "p_entity":Lorg/apache/http/client/entity/UrlEncodedFormEntity;
a=0;//     #v5=(Reference,Lorg/apache/http/client/entity/UrlEncodedFormEntity;);
a=0;//     new-instance v8, Ljava/net/URL;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/net/URL;);
a=0;//     invoke-direct {v8, p2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 100
a=0;//     .local v8, "url":Ljava/net/URL;
a=0;//     #v8=(Reference,Ljava/net/URL;);
a=0;//     iget-object v9, p0, Lcom/twocloo/base/alipay/NetworkManager;->mProxy:Ljava/net/Proxy;
a=0;// 
a=0;//     if-eqz v9, :cond_0
a=0;// 
a=0;//     .line 101
a=0;//     iget-object v9, p0, Lcom/twocloo/base/alipay/NetworkManager;->mProxy:Ljava/net/Proxy;
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/net/URL;->openConnection(Ljava/net/Proxy;)Ljava/net/URLConnection;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     move-object v0, v9
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/URLConnection;);
a=0;//     check-cast v0, Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     move-object v3, v0
a=0;// 
a=0;//     .line 105
a=0;//     :goto_0
a=0;//     #v3=(Reference,Ljava/net/HttpURLConnection;);
a=0;//     iget v9, p0, Lcom/twocloo/base/alipay/NetworkManager;->connectTimeout:I
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual {v3, v9}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V
a=0;// 
a=0;//     .line 106
a=0;//     iget v9, p0, Lcom/twocloo/base/alipay/NetworkManager;->readTimeout:I
a=0;// 
a=0;//     invoke-virtual {v3, v9}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V
a=0;// 
a=0;//     .line 107
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     invoke-virtual {v3, v9}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V
a=0;// 
a=0;//     .line 108
a=0;//     const-string v9, "Content-type"
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/String;);
a=0;//     const-string v10, "application/x-www-form-urlencoded;charset=utf-8"
a=0;// 
a=0;//     invoke-virtual {v3, v9, v10}, Ljava/net/HttpURLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 110
a=0;//     invoke-virtual {v3}, Ljava/net/HttpURLConnection;->connect()V
a=0;// 
a=0;//     .line 112
a=0;//     invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     .line 113
a=0;//     .local v4, "os":Ljava/io/OutputStream;
a=0;//     #v4=(Reference,Ljava/io/OutputStream;);
a=0;//     invoke-virtual {v5, v4}, Lorg/apache/http/client/entity/UrlEncodedFormEntity;->writeTo(Ljava/io/OutputStream;)V
a=0;// 
a=0;//     .line 114
a=0;//     invoke-virtual {v4}, Ljava/io/OutputStream;->flush()V
a=0;// 
a=0;//     .line 116
a=0;//     invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 117
a=0;//     .local v1, "content":Ljava/io/InputStream;
a=0;//     #v1=(Reference,Ljava/io/InputStream;);
a=0;//     invoke-static {v1}, Lcom/twocloo/base/alipay/BaseHelper;->convertStreamToString(Ljava/io/InputStream;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v7
a=0;// 
a=0;//     .line 118
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     new-instance v9, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v9=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v10, "\u5f97\u5230\u652f\u4ed8\u5b9d\u5b89\u5168\u652f\u4ed8\u670d\u52a1\u7248\u672c\u4fe1\u606f|"
a=0;// 
a=0;//     invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v9=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     invoke-static {v9}, Lcom/twocloo/base/util/LogUtils;->info(Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     .line 122
a=0;//     invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V
a=0;// 
a=0;//     .line 125
a=0;//     .end local v1    # "content":Ljava/io/InputStream;
a=0;//     .end local v4    # "os":Ljava/io/OutputStream;
a=0;//     .end local v5    # "p_entity":Lorg/apache/http/client/entity/UrlEncodedFormEntity;
a=0;//     .end local v8    # "url":Ljava/net/URL;
a=0;//     :goto_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Conflicted);v4=(Conflicted);v5=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     return-object v7
a=0;// 
a=0;//     .line 103
a=0;//     .restart local v5    # "p_entity":Lorg/apache/http/client/entity/UrlEncodedFormEntity;
a=0;//     .restart local v8    # "url":Ljava/net/URL;
a=0;//     :cond_0
a=0;//     :try_start_1
a=0;//     #v0=(Uninit);v1=(Uninit);v2=(Uninit);v3=(Null);v4=(Uninit);v5=(Reference,Lorg/apache/http/client/entity/UrlEncodedFormEntity;);v7=(Null);v8=(Reference,Ljava/net/URL;);v9=(Reference,Ljava/net/Proxy;);
a=0;//     invoke-virtual {v8}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
a=0;// 
a=0;//     move-result-object v9
a=0;// 
a=0;//     move-object v0, v9
a=0;// 
a=0;//     #v0=(Reference,Ljava/net/URLConnection;);
a=0;//     check-cast v0, Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     move-object v3, v0
a=0;//     :try_end_1
a=0;//     .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     #v3=(Reference,Ljava/net/HttpURLConnection;);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 119
a=0;//     .end local v5    # "p_entity":Lorg/apache/http/client/entity/UrlEncodedFormEntity;
a=0;//     .end local v8    # "url":Ljava/net/URL;
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Conflicted);v4=(Conflicted);v5=(Conflicted);v7=(Reference,Ljava/lang/String;);v8=(Conflicted);v9=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 120
a=0;//     .local v2, "e":Ljava/io/IOException;
a=0;//     :try_start_2
a=0;//     #v2=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V
a=0;//     :try_end_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_0
a=0;// 
a=0;//     .line 122
a=0;//     invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 121
a=0;//     .end local v2    # "e":Ljava/io/IOException;
a=0;//     :catchall_0
a=0;//     #v2=(Conflicted);
a=0;//     move-exception v9
a=0;// 
a=0;//     .line 122
a=0;//     #v9=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V
a=0;// 
a=0;//     .line 123
a=0;//     throw v9
a=0;// .end method
a=0;// 
a=0;// .method public urlDownloadToFile(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Z
a=0;//     .locals 10
a=0;//     .param p1, "context"    # Landroid/content/Context;
a=0;//     .param p2, "strurl"    # Ljava/lang/String;
a=0;//     .param p3, "path"    # Ljava/lang/String;
a=0;// 
a=0;//     .prologue
a=0;//     .line 140
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 143
a=0;//     .local v0, "bRet":Z
a=0;//     #v0=(Null);
a=0;//     invoke-direct {p0}, Lcom/twocloo/base/alipay/NetworkManager;->detectProxy()V
a=0;// 
a=0;//     .line 146
a=0;//     :try_start_0
a=0;//     new-instance v8, Ljava/net/URL;
a=0;// 
a=0;//     #v8=(UninitRef,Ljava/net/URL;);
a=0;//     invoke-direct {v8, p2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 147
a=0;//     .local v8, "url":Ljava/net/URL;
a=0;//     #v8=(Reference,Ljava/net/URL;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 148
a=0;//     .local v1, "conn":Ljava/net/HttpURLConnection;
a=0;//     #v1=(Null);
a=0;//     iget-object v9, p0, Lcom/twocloo/base/alipay/NetworkManager;->mProxy:Ljava/net/Proxy;
a=0;// 
a=0;//     #v9=(Reference,Ljava/net/Proxy;);
a=0;//     if-eqz v9, :cond_0
a=0;// 
a=0;//     .line 149
a=0;//     iget-object v9, p0, Lcom/twocloo/base/alipay/NetworkManager;->mProxy:Ljava/net/Proxy;
a=0;// 
a=0;//     invoke-virtual {v8, v9}, Ljava/net/URL;->openConnection(Ljava/net/Proxy;)Ljava/net/URLConnection;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .end local v1    # "conn":Ljava/net/HttpURLConnection;
a=0;//     #v1=(Reference,Ljava/net/URLConnection;);
a=0;//     check-cast v1, Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     .line 153
a=0;//     .restart local v1    # "conn":Ljava/net/HttpURLConnection;
a=0;//     :goto_0
a=0;//     iget v9, p0, Lcom/twocloo/base/alipay/NetworkManager;->connectTimeout:I
a=0;// 
a=0;//     #v9=(Integer);
a=0;//     invoke-virtual {v1, v9}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V
a=0;// 
a=0;//     .line 154
a=0;//     iget v9, p0, Lcom/twocloo/base/alipay/NetworkManager;->readTimeout:I
a=0;// 
a=0;//     invoke-virtual {v1, v9}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V
a=0;// 
a=0;//     .line 155
a=0;//     const/4 v9, 0x1
a=0;// 
a=0;//     #v9=(One);
a=0;//     invoke-virtual {v1, v9}, Ljava/net/HttpURLConnection;->setDoInput(Z)V
a=0;// 
a=0;//     .line 157
a=0;//     invoke-virtual {v1}, Ljava/net/HttpURLConnection;->connect()V
a=0;// 
a=0;//     .line 158
a=0;//     invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     .line 160
a=0;//     .local v6, "is":Ljava/io/InputStream;
a=0;//     #v6=(Reference,Ljava/io/InputStream;);
a=0;//     new-instance v3, Ljava/io/File;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/File;);
a=0;//     invoke-direct {v3, p3}, Ljava/io/File;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     .line 161
a=0;//     .local v3, "file":Ljava/io/File;
a=0;//     #v3=(Reference,Ljava/io/File;);
a=0;//     invoke-virtual {v3}, Ljava/io/File;->createNewFile()Z
a=0;// 
a=0;//     .line 162
a=0;//     new-instance v4, Ljava/io/FileOutputStream;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/FileOutputStream;);
a=0;//     invoke-direct {v4, v3}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
a=0;// 
a=0;//     .line 164
a=0;//     .local v4, "fos":Ljava/io/FileOutputStream;
a=0;//     #v4=(Reference,Ljava/io/FileOutputStream;);
a=0;//     const/16 v9, 0x400
a=0;// 
a=0;//     #v9=(PosShort);
a=0;//     new-array v7, v9, [B
a=0;// 
a=0;//     .line 165
a=0;//     .local v7, "temp":[B
a=0;//     #v7=(Reference,[B);
a=0;//     const/4 v5, 0x0
a=0;// 
a=0;//     .line 166
a=0;//     .local v5, "i":I
a=0;//     :goto_1
a=0;//     #v5=(Integer);
a=0;//     invoke-virtual {v6, v7}, Ljava/io/InputStream;->read([B)I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     if-gtz v5, :cond_1
a=0;// 
a=0;//     .line 170
a=0;//     invoke-virtual {v4}, Ljava/io/FileOutputStream;->close()V
a=0;// 
a=0;//     .line 171
a=0;//     invoke-virtual {v6}, Ljava/io/InputStream;->close()V
a=0;// 
a=0;//     .line 173
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     .line 179
a=0;//     .end local v1    # "conn":Ljava/net/HttpURLConnection;
a=0;//     .end local v3    # "file":Ljava/io/File;
a=0;//     .end local v4    # "fos":Ljava/io/FileOutputStream;
a=0;//     .end local v5    # "i":I
a=0;//     .end local v6    # "is":Ljava/io/InputStream;
a=0;//     .end local v7    # "temp":[B
a=0;//     .end local v8    # "url":Ljava/net/URL;
a=0;//     :goto_2
a=0;//     #v0=(Boolean);v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     return v0
a=0;// 
a=0;//     .line 151
a=0;//     .restart local v1    # "conn":Ljava/net/HttpURLConnection;
a=0;//     .restart local v8    # "url":Ljava/net/URL;
a=0;//     :cond_0
a=0;//     #v0=(Null);v1=(Null);v2=(Uninit);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);v7=(Uninit);v8=(Reference,Ljava/net/URL;);v9=(Reference,Ljava/net/Proxy;);
a=0;//     invoke-virtual {v8}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .end local v1    # "conn":Ljava/net/HttpURLConnection;
a=0;//     #v1=(Reference,Ljava/net/URLConnection;);
a=0;//     check-cast v1, Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     .restart local v1    # "conn":Ljava/net/HttpURLConnection;
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 167
a=0;//     .restart local v3    # "file":Ljava/io/File;
a=0;//     .restart local v4    # "fos":Ljava/io/FileOutputStream;
a=0;//     .restart local v5    # "i":I
a=0;//     .restart local v6    # "is":Ljava/io/InputStream;
a=0;//     .restart local v7    # "temp":[B
a=0;//     :cond_1
a=0;//     #v3=(Reference,Ljava/io/File;);v4=(Reference,Ljava/io/FileOutputStream;);v5=(Integer);v6=(Reference,Ljava/io/InputStream;);v7=(Reference,[B);v9=(PosShort);
a=0;//     const/4 v9, 0x0
a=0;// 
a=0;//     #v9=(Null);
a=0;//     invoke-virtual {v4, v7, v9, v5}, Ljava/io/FileOutputStream;->write([BII)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 175
a=0;//     .end local v1    # "conn":Ljava/net/HttpURLConnection;
a=0;//     .end local v3    # "file":Ljava/io/File;
a=0;//     .end local v4    # "fos":Ljava/io/FileOutputStream;
a=0;//     .end local v5    # "i":I
a=0;//     .end local v6    # "is":Ljava/io/InputStream;
a=0;//     .end local v7    # "temp":[B
a=0;//     .end local v8    # "url":Ljava/net/URL;
a=0;//     :catch_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);v8=(Conflicted);v9=(Conflicted);
a=0;//     move-exception v2
a=0;// 
a=0;//     .line 176
a=0;//     .local v2, "e":Ljava/io/IOException;
a=0;//     #v2=(Reference,Ljava/io/IOException;);
a=0;//     invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_2
a=0;// .end method
}}
