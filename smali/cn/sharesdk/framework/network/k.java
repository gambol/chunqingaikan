package cn.sharesdk.framework.network; class k { void a() { int a;
a=0;// .class public Lcn/sharesdk/framework/network/k;
a=0;// .super Lorg/apache/http/conn/ssl/SSLSocketFactory;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field a:Ljavax/net/ssl/SSLContext;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>(Ljava/security/KeyStore;)V
a=0;//     .locals 5
a=0;// 
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-direct {p0, p1}, Lorg/apache/http/conn/ssl/SSLSocketFactory;-><init>(Ljava/security/KeyStore;)V
a=0;// 
a=0;//     #p0=(Reference,Lcn/sharesdk/framework/network/k;);
a=0;//     const-string v0, "TLS"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Ljavax/net/ssl/SSLContext;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/SSLContext;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iput-object v0, p0, Lcn/sharesdk/framework/network/k;->a:Ljavax/net/ssl/SSLContext;
a=0;// 
a=0;//     new-instance v0, Lcn/sharesdk/framework/network/l;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/sharesdk/framework/network/l;);
a=0;//     invoke-direct {v0, p0}, Lcn/sharesdk/framework/network/l;-><init>(Lcn/sharesdk/framework/network/k;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/framework/network/l;);
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/network/k;->a:Ljavax/net/ssl/SSLContext;
a=0;// 
a=0;//     #v1=(Reference,Ljavax/net/ssl/SSLContext;);
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
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public createSocket()Ljava/net/Socket;
a=0;//     .locals 1
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/network/k;->a:Ljavax/net/ssl/SSLContext;
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
a=0;// 
a=0;//     iget-object v0, p0, Lcn/sharesdk/framework/network/k;->a:Ljavax/net/ssl/SSLContext;
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
