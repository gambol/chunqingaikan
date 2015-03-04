package com.lidroid.xutils.http.client; class DefaultSSLSocketFactory { void a() { int a;
a=0;// .class public Lcom/lidroid/xutils/http/client/DefaultSSLSocketFactory;
a=0;// .super Lorg/apache/http/conn/ssl/SSLSocketFactory;
a=0;// .source "DefaultSSLSocketFactory.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static instance:Lcom/lidroid/xutils/http/client/DefaultSSLSocketFactory;
a=0;// 
a=0;// .field private static trustStore:Ljava/security/KeyStore;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private sslContext:Ljavax/net/ssl/SSLContext;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 24
a=0;//     :try_start_0
a=0;//     invoke-static {}, Ljava/security/KeyStore;->getDefaultType()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Ljava/security/KeyStore;->getInstance(Ljava/lang/String;)Ljava/security/KeyStore;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     sput-object v1, Lcom/lidroid/xutils/http/client/DefaultSSLSocketFactory;->trustStore:Ljava/security/KeyStore;
a=0;// 
a=0;//     .line 25
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/client/DefaultSSLSocketFactory;->trustStore:Ljava/security/KeyStore;
a=0;// 
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     #v2=(Null);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     invoke-virtual {v1, v2, v3}, Ljava/security/KeyStore;->load(Ljava/io/InputStream;[C)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 16
a=0;//     .local v0, "e":Ljava/lang/Throwable;
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-void
a=0;// 
a=0;//     .line 26
a=0;//     .end local v0    # "e":Ljava/lang/Throwable;
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 27
a=0;//     .restart local v0    # "e":Ljava/lang/Throwable;
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v0}, Lcom/lidroid/xutils/util/LogUtils;->e(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private constructor <init>()V
a=0;//     .locals 5
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/security/UnrecoverableKeyException;,
a=0;//             Ljava/security/NoSuchAlgorithmException;,
a=0;//             Ljava/security/KeyStoreException;,
a=0;//             Ljava/security/KeyManagementException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     .line 49
a=0;//     #v4=(Null);
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/client/DefaultSSLSocketFactory;->trustStore:Ljava/security/KeyStore;
a=0;// 
a=0;//     #v1=(Reference,Ljava/security/KeyStore;);
a=0;//     invoke-direct {p0, v1}, Lorg/apache/http/conn/ssl/SSLSocketFactory;-><init>(Ljava/security/KeyStore;)V
a=0;// 
a=0;//     .line 18
a=0;//     #p0=(Reference,Lcom/lidroid/xutils/http/client/DefaultSSLSocketFactory;);
a=0;//     const-string v1, "TLS"
a=0;// 
a=0;//     invoke-static {v1}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, p0, Lcom/lidroid/xutils/http/client/DefaultSSLSocketFactory;->sslContext:Ljavax/net/ssl/SSLContext;
a=0;// 
a=0;//     .line 51
a=0;//     new-instance v0, Lcom/lidroid/xutils/http/client/DefaultSSLSocketFactory$1;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/lidroid/xutils/http/client/DefaultSSLSocketFactory$1;);
a=0;//     invoke-direct {v0, p0}, Lcom/lidroid/xutils/http/client/DefaultSSLSocketFactory$1;-><init>(Lcom/lidroid/xutils/http/client/DefaultSSLSocketFactory;)V
a=0;// 
a=0;//     .line 68
a=0;//     .local v0, "trustAllCerts":Ljavax/net/ssl/TrustManager;
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/client/DefaultSSLSocketFactory$1;);
a=0;//     iget-object v1, p0, Lcom/lidroid/xutils/http/client/DefaultSSLSocketFactory;->sslContext:Ljavax/net/ssl/SSLContext;
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
a=0;//     .line 70
a=0;//     sget-object v1, Lorg/apache/http/conn/ssl/SSLSocketFactory;->ALLOW_ALL_HOSTNAME_VERIFIER:Lorg/apache/http/conn/ssl/X509HostnameVerifier;
a=0;// 
a=0;//     invoke-virtual {p0, v1}, Lcom/lidroid/xutils/http/client/DefaultSSLSocketFactory;->setHostnameVerifier(Lorg/apache/http/conn/ssl/X509HostnameVerifier;)V
a=0;// 
a=0;//     .line 71
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public static getSocketFactory()Lcom/lidroid/xutils/http/client/DefaultSSLSocketFactory;
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 34
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/client/DefaultSSLSocketFactory;->instance:Lcom/lidroid/xutils/http/client/DefaultSSLSocketFactory;
a=0;// 
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/http/client/DefaultSSLSocketFactory;);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 36
a=0;//     :try_start_0
a=0;//     new-instance v1, Lcom/lidroid/xutils/http/client/DefaultSSLSocketFactory;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/lidroid/xutils/http/client/DefaultSSLSocketFactory;);
a=0;//     invoke-direct {v1}, Lcom/lidroid/xutils/http/client/DefaultSSLSocketFactory;-><init>()V
a=0;// 
a=0;//     #v1=(Reference,Lcom/lidroid/xutils/http/client/DefaultSSLSocketFactory;);
a=0;//     sput-object v1, Lcom/lidroid/xutils/http/client/DefaultSSLSocketFactory;->instance:Lcom/lidroid/xutils/http/client/DefaultSSLSocketFactory;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 41
a=0;//     .local v0, "e":Ljava/lang/Throwable;
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v0=(Conflicted);
a=0;//     sget-object v1, Lcom/lidroid/xutils/http/client/DefaultSSLSocketFactory;->instance:Lcom/lidroid/xutils/http/client/DefaultSSLSocketFactory;
a=0;// 
a=0;//     return-object v1
a=0;// 
a=0;//     .line 37
a=0;//     .end local v0    # "e":Ljava/lang/Throwable;
a=0;//     :catch_0
a=0;//     #v0=(Uninit);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 38
a=0;//     .restart local v0    # "e":Ljava/lang/Throwable;
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v0}, Lcom/lidroid/xutils/util/LogUtils;->e(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public static bridge synthetic getSocketFactory()Lorg/apache/http/conn/ssl/SSLSocketFactory;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1
a=0;//     invoke-static {}, Lcom/lidroid/xutils/http/client/DefaultSSLSocketFactory;->getSocketFactory()Lcom/lidroid/xutils/http/client/DefaultSSLSocketFactory;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcom/lidroid/xutils/http/client/DefaultSSLSocketFactory;);
a=0;//     return-object v0
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
a=0;//     .line 80
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/client/DefaultSSLSocketFactory;->sslContext:Ljavax/net/ssl/SSLContext;
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
a=0;//             Ljava/io/IOException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 75
a=0;//     iget-object v0, p0, Lcom/lidroid/xutils/http/client/DefaultSSLSocketFactory;->sslContext:Ljavax/net/ssl/SSLContext;
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
