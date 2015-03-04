package com.weibo.sdk.android.net; class HttpManager$MySSLSocketFactory { void a() { int a;
a=0;// .class Lcom/weibo/sdk/android/net/HttpManager$MySSLSocketFactory;
a=0;// .super Lorg/apache/http/conn/ssl/SSLSocketFactory;
a=0;// .source "HttpManager.java"
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/weibo/sdk/android/net/HttpManager;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0xa
a=0;//     name = "MySSLSocketFactory"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field sslContext:Ljavax/net/ssl/SSLContext;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Ljava/security/KeyStore;)V
a=0;//     .locals 5
a=0;//     .param p1, "truststore"    # Ljava/security/KeyStore;
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
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 181
a=0;//     #v4=(Null);
a=0;//     invoke-direct {p0, p1}, Lorg/apache/http/conn/ssl/SSLSocketFactory;-><init>(Ljava/security/KeyStore;)V
a=0;// 
a=0;//     .line 177
a=0;//     #p0=(Reference,Lcom/weibo/sdk/android/net/HttpManager$MySSLSocketFactory;);
a=0;//     const-string v1, "TLS"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lcom/weibo/sdk/android/net/HttpManager$MySSLSocketFactory;->sslContext:Ljavax/net/ssl/SSLContext;
a=0;// 
a=0;//     .line 183
a=0;//     new-instance v0, Lcom/weibo/sdk/android/net/HttpManager$MySSLSocketFactory$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/weibo/sdk/android/net/HttpManager$MySSLSocketFactory$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/weibo/sdk/android/net/HttpManager$MySSLSocketFactory$1;-><init>(Lcom/weibo/sdk/android/net/HttpManager$MySSLSocketFactory;)V
a=0;// 
a=0;//     .line 197
a=0;//     .local v0, "tm":Ljavax/net/ssl/TrustManager;
a=0;//     #v0=(Reference,Lcom/weibo/sdk/android/net/HttpManager$MySSLSocketFactory$1;);
a=0;//     iget-object v1, p0, Lcom/weibo/sdk/android/net/HttpManager$MySSLSocketFactory;->sslContext:Ljavax/net/ssl/SSLContext;
a=0;// 
a=0;//     const/4 v2, 0x1
a=0;// 
a=0;//     #v2=(One);
a=0;//     new-array v2, v2, [Ljavax/net/ssl/TrustManager;
a=0;// 
a=0;//     #v2=(Reference,[Ljavax/net/ssl/TrustManager;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     aput-object v0, v2, v3
a=0;// 
a=0;//     invoke-virtual {v1, v4, v2, v4}, Ljavax/net/ssl/SSLContext;->init([Ljavax/net/ssl/KeyManager;[Ljavax/net/ssl/TrustManager;Ljava/security/SecureRandom;)V
a=0;// 
a=0;//     .line 198
a=0;//     return-void
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
a=0;//     .line 208
a=0;//     iget-object v0, p0, Lcom/weibo/sdk/android/net/HttpManager$MySSLSocketFactory;->sslContext:Ljavax/net/ssl/SSLContext;
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
a=0;//     .param p1, "socket"    # Ljava/net/Socket;
a=0;//     .param p2, "host"    # Ljava/lang/String;
a=0;//     .param p3, "port"    # I
a=0;//     .param p4, "autoClose"    # Z
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/io/IOException;,
a=0;//             Ljava/net/UnknownHostException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 203
a=0;//     iget-object v0, p0, Lcom/weibo/sdk/android/net/HttpManager$MySSLSocketFactory;->sslContext:Ljavax/net/ssl/SSLContext;
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
