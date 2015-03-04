package com.tencent.utils; class HttpUtils$MyX509TrustManager { void a() { int a;
a=0;// .class public Lcom/tencent/utils/HttpUtils$MyX509TrustManager;
a=0;// .super Ljava/lang/Object;
a=0;// .source "ProGuard"
a=0;// 
a=0;// # interfaces
a=0;// .implements Ljavax/net/ssl/X509TrustManager;
a=0;// 
a=0;// 
a=0;// # annotations
a=0;// .annotation system Ldalvik/annotation/EnclosingClass;
a=0;//     value = Lcom/tencent/utils/HttpUtils;
a=0;// .end annotation
a=0;// 
a=0;// .annotation system Ldalvik/annotation/InnerClass;
a=0;//     accessFlags = 0x9
a=0;//     name = "MyX509TrustManager"
a=0;// .end annotation
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field a:Ljavax/net/ssl/X509TrustManager;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>()V
a=0;//     .locals 4
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/lang/Exception;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     .line 1037
a=0;//     #v2=(Null);
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     .line 1041
a=0;//     :try_start_0
a=0;//     #p0=(Reference,Lcom/tencent/utils/HttpUtils$MyX509TrustManager;);
a=0;//     const-string v1, "JKS"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1}, Ljava/security/KeyStore;->getInstance(Ljava/lang/String;)Ljava/security/KeyStore;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1045
a=0;//     :goto_0
a=0;//     new-array v3, v2, [Ljavax/net/ssl/TrustManager;
a=0;// 
a=0;//     .line 1046
a=0;//     #v3=(Reference,[Ljavax/net/ssl/TrustManager;);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 1048
a=0;//     new-instance v0, Ljava/io/FileInputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/FileInputStream;);
a=0;//     const-string v3, "trustedCerts"
a=0;// 
a=0;//     invoke-direct {v0, v3}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/io/FileInputStream;);
a=0;//     const-string v3, "passphrase"
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/String;->toCharArray()[C
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v1, v0, v3}, Ljava/security/KeyStore;->load(Ljava/io/InputStream;[C)V
a=0;// 
a=0;//     .line 1049
a=0;//     const-string v0, "SunX509"
a=0;// 
a=0;//     const-string v3, "SunJSSE"
a=0;// 
a=0;//     invoke-static {v0, v3}, Ljavax/net/ssl/TrustManagerFactory;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljavax/net/ssl/TrustManagerFactory;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 1050
a=0;//     invoke-virtual {v0, v1}, Ljavax/net/ssl/TrustManagerFactory;->init(Ljava/security/KeyStore;)V
a=0;// 
a=0;//     .line 1051
a=0;//     invoke-virtual {v0}, Ljavax/net/ssl/TrustManagerFactory;->getTrustManagers()[Ljavax/net/ssl/TrustManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_1
a=0;//     move v1, v2
a=0;// 
a=0;//     .line 1060
a=0;//     :goto_2
a=0;//     #v1=(Integer);v2=(Boolean);
a=0;//     array-length v2, v0
a=0;// 
a=0;//     #v2=(Integer);
a=0;//     if-ge v1, v2, :cond_2
a=0;// 
a=0;//     .line 1061
a=0;//     aget-object v2, v0, v1
a=0;// 
a=0;//     #v2=(Null);
a=0;//     instance-of v2, v2, Ljavax/net/ssl/X509TrustManager;
a=0;// 
a=0;//     #v2=(Boolean);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     .line 1062
a=0;//     aget-object v0, v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     check-cast v0, Ljavax/net/ssl/X509TrustManager;
a=0;// 
a=0;//     #v0=(Reference,Ljavax/net/ssl/X509TrustManager;);
a=0;//     iput-object v0, p0, Lcom/tencent/utils/HttpUtils$MyX509TrustManager;->a:Ljavax/net/ssl/X509TrustManager;
a=0;// 
a=0;//     .line 1063
a=0;//     return-void
a=0;// 
a=0;//     .line 1042
a=0;//     :catch_0
a=0;//     #v0=(Null);v1=(Conflicted);v2=(Null);v3=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 1054
a=0;//     :cond_0
a=0;//     #v1=(Reference,Ljava/security/KeyStore;);v3=(Reference,[Ljavax/net/ssl/TrustManager;);
a=0;//     invoke-static {}, Ljavax/net/ssl/TrustManagerFactory;->getDefaultAlgorithm()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Ljavax/net/ssl/TrustManagerFactory;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/TrustManagerFactory;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 1056
a=0;//     check-cast v0, Ljava/security/KeyStore;
a=0;// 
a=0;//     #v0=(Reference,Ljava/security/KeyStore;);
a=0;//     invoke-virtual {v1, v0}, Ljavax/net/ssl/TrustManagerFactory;->init(Ljava/security/KeyStore;)V
a=0;// 
a=0;//     .line 1057
a=0;//     invoke-virtual {v1}, Ljavax/net/ssl/TrustManagerFactory;->getTrustManagers()[Ljavax/net/ssl/TrustManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     .line 1060
a=0;//     :cond_1
a=0;//     #v1=(Integer);v2=(Boolean);
a=0;//     add-int/lit8 v1, v1, 0x1
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 1066
a=0;//     :cond_2
a=0;//     #v2=(Integer);
a=0;//     new-instance v0, Ljava/lang/Exception;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/Exception;);
a=0;//     const-string v1, "Couldn\'t initialize"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public checkClientTrusted([Ljava/security/cert/X509Certificate;Ljava/lang/String;)V
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/security/cert/CertificateException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 1072
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/tencent/utils/HttpUtils$MyX509TrustManager;->a:Ljavax/net/ssl/X509TrustManager;
a=0;// 
a=0;//     #v0=(Reference,Ljavax/net/ssl/X509TrustManager;);
a=0;//     invoke-interface {v0, p1, p2}, Ljavax/net/ssl/X509TrustManager;->checkClientTrusted([Ljava/security/cert/X509Certificate;Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/security/cert/CertificateException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 1075
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 1073
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/security/cert/CertificateException;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public checkServerTrusted([Ljava/security/cert/X509Certificate;Ljava/lang/String;)V
a=0;//     .locals 1
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Ljava/security/cert/CertificateException;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 1080
a=0;//     :try_start_0
a=0;//     iget-object v0, p0, Lcom/tencent/utils/HttpUtils$MyX509TrustManager;->a:Ljavax/net/ssl/X509TrustManager;
a=0;// 
a=0;//     #v0=(Reference,Ljavax/net/ssl/X509TrustManager;);
a=0;//     invoke-interface {v0, p1, p2}, Ljavax/net/ssl/X509TrustManager;->checkServerTrusted([Ljava/security/cert/X509Certificate;Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/security/cert/CertificateException; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 1083
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     .line 1081
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/security/cert/CertificateException;);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public getAcceptedIssuers()[Ljava/security/cert/X509Certificate;
a=0;//     .locals 1
a=0;// 
a=0;//     .prologue
a=0;//     .line 1086
a=0;//     iget-object v0, p0, Lcom/tencent/utils/HttpUtils$MyX509TrustManager;->a:Ljavax/net/ssl/X509TrustManager;
a=0;// 
a=0;//     #v0=(Reference,Ljavax/net/ssl/X509TrustManager;);
a=0;//     invoke-interface {v0}, Ljavax/net/ssl/X509TrustManager;->getAcceptedIssuers()[Ljava/security/cert/X509Certificate;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
