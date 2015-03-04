package com.tencent.utils; class HttpUtils$CustomSSLSocketFactory { void a() { int a;
a=0;// .class public Lcom/tencent/utils/HttpUtils$CustomSSLSocketFactory;
a=0;// .super Lorg/apache/http/conn/ssl/SSLSocketFactory;
a=0;// .source "ProGuard"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/tencent/utils/HttpUtils;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x9
a=0;//     name = "CustomSSLSocketFactory"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private a:Ljavax/net/ssl/SSLContext;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Ljava/security/KeyStore;)V
a=0;//     .locals 5
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/security/NoSuchAlgorithmException;,
a=0;//             Ljava/security/KeyManagementException;,
a=0;//             Ljava/security/KeyStoreException;,
a=0;//             Ljava/security/UnrecoverableKeyException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 1010
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0, p1}, Lorg/apache/http/conn/ssl/SSLSocketFactory;-><init>(Ljava/security/KeyStore;)V
a=0;// 
a=0;//     .line 1004
a=0;//     #p0=(Reference,Lcom/tencent/utils/HttpUtils$CustomSSLSocketFactory;);
a=0;//     const-string v0, "TLS"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcom/tencent/utils/HttpUtils$CustomSSLSocketFactory;->a:Ljavax/net/ssl/SSLContext;
a=0;// 
a=0;//     .line 1014
a=0;//     :try_start_0
a=0;//     new-instance v0, Lcom/tencent/utils/HttpUtils$MyX509TrustManager;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/tencent/utils/HttpUtils$MyX509TrustManager;);
a=0;//     invoke-direct {v0}, Lcom/tencent/utils/HttpUtils$MyX509TrustManager;-><init>()V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 1018
a=0;//     :goto_0
a=0;//     #v0=(Reference,Lcom/tencent/utils/HttpUtils$MyX509TrustManager;);
a=0;//     iget-object v2, p0, Lcom/tencent/utils/HttpUtils$CustomSSLSocketFactory;->a:Ljavax/net/ssl/SSLContext;
a=0;// 
a=0;//     #v2=(Reference,Ljavax/net/ssl/SSLContext;);
a=0;//     const/4 v3, 0x1
a=0;// 
a=0;//     #v3=(One);
a=0;//     new-array v3, v3, [Ljavax/net/ssl/TrustManager;
a=0;// 
a=0;//     #v3=(Reference,[Ljavax/net/ssl/TrustManager;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     aput-object v0, v3, v4
a=0;// 
a=0;//     invoke-virtual {v2, v1, v3, v1}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V
a=0;// 
a=0;//     .line 1020
a=0;//     return-void
a=0;// 
a=0;//     .line 1015
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v2=(Uninit);v3=(Uninit);v4=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public createSocket()Ljava/net/Socket;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 1030
a=0;//     iget-object v0, p0, Lcom/tencent/utils/HttpUtils$CustomSSLSocketFactory;->a:Ljavax/net/ssl/SSLContext;
a=0;// 
a=0;//     #v0=(Reference,Ljavax/net/ssl/SSLContext;);
a=0;//     invoke-virtual {v0}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljavax/net/ssl/SSLSocketFactory;->createSocket()Ljava/net/Socket;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
a=0;// 
a=0;// .method public createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;,
a=0;//             Ljava/net/UnknownHostException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 1025
a=0;//     iget-object v0, p0, Lcom/tencent/utils/HttpUtils$CustomSSLSocketFactory;->a:Ljavax/net/ssl/SSLContext;
a=0;// 
a=0;//     #v0=(Reference,Ljavax/net/ssl/SSLContext;);
a=0;//     invoke-virtual {v0}, Ljavax/net/ssl/SSLContext;->getSocketFactory()Ljavax/net/ssl/SSLSocketFactory;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0, p1, p2, p3, p4}, Ljavax/net/ssl/SSLSocketFactory;->createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
