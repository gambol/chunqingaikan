package cn.waps; class ag { void a() { int a;
a=0;// .class public Lcn/waps/ag;
a=0;// .super Ljava/lang/Object;
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field public static a:Ljava/lang/String;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field private b:Lcn/waps/SDKUtils;
a=0;// 
a=0;// .field private c:Landroid/content/Context;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method static constructor <clinit>()V
a=0;//     .locals 1
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     sput-object v0, Lcn/waps/ag;->a:Ljava/lang/String;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/waps/ag;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method public constructor <init>(Landroid/content/Context;)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/waps/ag;);
a=0;//     iget-object v0, p0, Lcn/waps/ag;->b:Lcn/waps/SDKUtils;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/SDKUtils;);
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Lcn/waps/SDKUtils;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/waps/SDKUtils;);
a=0;//     invoke-direct {v0, p1}, Lcn/waps/SDKUtils;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/SDKUtils;);
a=0;//     iput-object v0, p0, Lcn/waps/ag;->b:Lcn/waps/SDKUtils;
a=0;// 
a=0;//     :cond_0
a=0;//     iput-object p1, p0, Lcn/waps/ag;->c:Landroid/content/Context;
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method private a()Ljava/lang/String;
a=0;//     .locals 6
a=0;// 
a=0;//     const-string v1, ""
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     iget-object v0, p0, Lcn/waps/ag;->b:Lcn/waps/SDKUtils;
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/SDKUtils;);
a=0;//     invoke-virtual {v0}, Lcn/waps/SDKUtils;->getUdid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcn/waps/cs;->b(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v2, "mac"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     iget-object v2, p0, Lcn/waps/ag;->b:Lcn/waps/SDKUtils;
a=0;// 
a=0;//     invoke-virtual {v2}, Lcn/waps/SDKUtils;->getMac_Address()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, ":"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, ""
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3, v4}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcn/waps/cs;->b(Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     const-string v1, "EMULATOR"
a=0;// 
a=0;//     :cond_0
a=0;//     #v2=(Conflicted);v3=(Conflicted);v4=(Conflicted);
a=0;//     new-instance v0, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v2, "kingxiaoguang@gmail.com"
a=0;// 
a=0;//     invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v0}, Lcn/waps/AppConnect;->a([B)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);v5=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v5=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v5, v0
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     move-object v1, v5
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 8
a=0;// 
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     #v1=(Null);
a=0;//     invoke-direct {p0}, Lcn/waps/ag;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "&"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "at"
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, "="
a=0;// 
a=0;//     invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v3
a=0;// 
a=0;//     #v3=(LongLo);v4=(LongHi);
a=0;//     invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     const-string v3, " "
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "%20"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v2, v3, v4}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     new-instance v2, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "Udid;"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     new-instance v0, Lcn/waps/cs;
a=0;// 
a=0;//     #v0=(UninitRef,Lcn/waps/cs;);
a=0;//     iget-object v4, p0, Lcn/waps/ag;->c:Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {v0, v4}, Lcn/waps/cs;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v0=(Reference,Lcn/waps/cs;);
a=0;//     const/4 v4, 0x0
a=0;// 
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v0, v3, v2, v4}, Lcn/waps/cs;->a(Ljava/lang/String;Ljava/util/List;[B)Ljava/net/HttpURLConnection;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     :try_start_1
a=0;//     invoke-virtual {v2}, Ljava/net/HttpURLConnection;->connect()V
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getResponseCode()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     const/16 v4, 0xc8
a=0;// 
a=0;//     #v4=(PosShort);
a=0;//     if-ne v0, v4, :cond_3
a=0;// 
a=0;//     new-instance v0, Lorg/apache/http/entity/InputStreamEntity;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/apache/http/entity/InputStreamEntity;);
a=0;//     invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/InputStream;);
a=0;//     invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getContentLength()I
a=0;// 
a=0;//     move-result v5
a=0;// 
a=0;//     #v5=(Integer);
a=0;//     int-to-long v5, v5
a=0;// 
a=0;//     #v5=(LongLo);v6=(LongHi);
a=0;//     invoke-direct {v0, v4, v5, v6}, Lorg/apache/http/entity/InputStreamEntity;-><init>(Ljava/io/InputStream;J)V
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/entity/InputStreamEntity;);
a=0;//     invoke-static {v0}, Lorg/apache/http/util/EntityUtils;->toByteArray(Lorg/apache/http/HttpEntity;)[B
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     new-instance v0, Ljava/lang/String;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v4}, Ljava/lang/String;-><init>([B)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     :goto_0
a=0;//     :try_start_2
a=0;//     #v0=(Reference,Ljava/lang/String;);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);
a=0;//     invoke-static {}, Lcn/waps/al;->x()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     const-string v1, "APP_SDK"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "An app is installed."
a=0;// 
a=0;//     invoke-static {v1, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I
a=0;//     :try_end_2
a=0;//     .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
a=0;//     .catchall {:try_start_2 .. :try_end_2} :catchall_1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_1
a=0;//     #v3=(Conflicted);v7=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Null);v2=(Conflicted);v6=(Uninit);v7=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v2, v1
a=0;// 
a=0;//     #v2=(Null);
a=0;//     move-object v7, v0
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move-object v1, v7
a=0;// 
a=0;//     :goto_2
a=0;//     :try_start_3
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Reference,Ljava/lang/Exception;);v2=(Reference,Ljava/net/HttpURLConnection;);v6=(Conflicted);v7=(Conflicted);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_3
a=0;//     .catchall {:try_start_3 .. :try_end_3} :catchall_1
a=0;// 
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V
a=0;// 
a=0;//     goto :goto_1
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Null);v2=(Conflicted);v6=(Uninit);v7=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     :goto_3
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);v1=(Reference,Ljava/net/HttpURLConnection;);v6=(Conflicted);v7=(Conflicted);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V
a=0;// 
a=0;//     :cond_2
a=0;//     throw v0
a=0;// 
a=0;//     :catchall_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);v2=(Reference,Ljava/net/HttpURLConnection;);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v1, v2
a=0;// 
a=0;//     #v1=(Reference,Ljava/net/HttpURLConnection;);
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catch_1
a=0;//     #v0=(Conflicted);v1=(Null);v3=(Reference,Ljava/lang/String;);v7=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v7, v0
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move-object v1, v7
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catch_2
a=0;//     #v0=(Reference,Ljava/lang/String;);v1=(Conflicted);v7=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     :cond_3
a=0;//     #v0=(Integer);v1=(Null);v4=(PosShort);v5=(Reference,Ljava/lang/String;);v6=(Uninit);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public a([BLjava/lang/String;)Ljava/lang/String;
a=0;//     .locals 6
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     const/4 v2, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v2=(Null);
a=0;//     const-string v1, " "
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "%20"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p2, v1, v3}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     new-instance v3, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     #v3=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v5, "Udid;"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-direct {p0}, Lcn/waps/ag;->a()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     const-string v4, "Accept-Encoding;gzip"
a=0;// 
a=0;//     invoke-interface {v3, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     new-instance v4, Lcn/waps/cs;
a=0;// 
a=0;//     #v4=(UninitRef,Lcn/waps/cs;);
a=0;//     iget-object v5, p0, Lcn/waps/ag;->c:Landroid/content/Context;
a=0;// 
a=0;//     invoke-direct {v4, v5}, Lcn/waps/cs;-><init>(Landroid/content/Context;)V
a=0;// 
a=0;//     #v4=(Reference,Lcn/waps/cs;);
a=0;//     invoke-virtual {v4, v1, v3, p1}, Lcn/waps/cs;->a(Ljava/lang/String;Ljava/util/List;[B)Ljava/net/HttpURLConnection;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     #v2=(Reference,Ljava/net/HttpURLConnection;);
a=0;//     invoke-virtual {v2}, Ljava/net/HttpURLConnection;->connect()V
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getResponseCode()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     const/16 v3, 0xc8
a=0;// 
a=0;//     #v3=(PosShort);
a=0;//     if-ne v1, v3, :cond_0
a=0;// 
a=0;//     new-instance v1, Lorg/apache/http/entity/InputStreamEntity;
a=0;// 
a=0;//     #v1=(UninitRef,Lorg/apache/http/entity/InputStreamEntity;);
a=0;//     invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/InputStream;);
a=0;//     invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getContentLength()I
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     int-to-long v4, v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-direct {v1, v3, v4, v5}, Lorg/apache/http/entity/InputStreamEntity;-><init>(Ljava/io/InputStream;J)V
a=0;// 
a=0;//     #v1=(Reference,Lorg/apache/http/entity/InputStreamEntity;);
a=0;//     invoke-static {v1}, Lorg/apache/http/util/EntityUtils;->toByteArray(Lorg/apache/http/HttpEntity;)[B
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     new-instance v1, Ljava/lang/String;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v3}, Ljava/lang/String;-><init>([B)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);v4=(Conflicted);v5=(Conflicted);
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_0
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     move-exception v1
a=0;// 
a=0;//     :try_start_1
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
a=0;//     :try_end_1
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_0
a=0;// 
a=0;//     if-eqz v2, :cond_1
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     if-eqz v2, :cond_2
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V
a=0;// 
a=0;//     :cond_2
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method public a(Ljava/lang/String;)[B
a=0;//     .locals 6
a=0;// 
a=0;//     new-instance v2, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     #v2=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     new-instance v3, Ljava/io/DataOutputStream;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/io/DataOutputStream;);
a=0;//     invoke-direct {v3, v2}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/io/DataOutputStream;);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     new-instance v0, Ljava/util/zip/GZIPOutputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/zip/GZIPOutputStream;);
a=0;//     new-instance v4, Ljava/io/BufferedOutputStream;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/io/BufferedOutputStream;);
a=0;//     invoke-direct {v4, v3}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V
a=0;// 
a=0;//     #v4=(Reference,Ljava/io/BufferedOutputStream;);
a=0;//     invoke-direct {v0, v4}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;//     .catchall {:try_start_0 .. :try_end_0} :catchall_0
a=0;// 
a=0;//     :try_start_1
a=0;//     #v0=(Reference,Ljava/util/zip/GZIPOutputStream;);
a=0;//     invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,[B);
a=0;//     invoke-virtual {v0, v1}, Ljava/util/zip/GZIPOutputStream;->write([B)V
a=0;//     :try_end_1
a=0;//     .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_4
a=0;//     .catchall {:try_start_1 .. :try_end_1} :catchall_1
a=0;// 
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     :try_start_2
a=0;//     invoke-virtual {v0}, Ljava/util/zip/GZIPOutputStream;->close()V
a=0;//     :try_end_2
a=0;//     .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v4=(Conflicted);
a=0;//     invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v1=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     :goto_1
a=0;//     #v1=(Reference,Ljava/lang/Exception;);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     :try_start_3
a=0;//     invoke-virtual {v0}, Ljava/util/zip/GZIPOutputStream;->close()V
a=0;//     :try_end_3
a=0;//     .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_1
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catchall_0
a=0;//     #v0=(Conflicted);v1=(Null);
a=0;//     move-exception v0
a=0;// 
a=0;//     :goto_2
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);v1=(Reference,Ljava/util/zip/GZIPOutputStream;);v5=(Conflicted);
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     :try_start_4
a=0;//     invoke-virtual {v1}, Ljava/util/zip/GZIPOutputStream;->close()V
a=0;//     :try_end_4
a=0;//     .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_3
a=0;// 
a=0;//     :cond_1
a=0;//     :goto_3
a=0;//     throw v0
a=0;// 
a=0;//     :catch_2
a=0;//     #v4=(Reference,Ljava/io/BufferedOutputStream;);v5=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     :catch_3
a=0;//     #v4=(Conflicted);v5=(Conflicted);
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     :catchall_1
a=0;//     #v4=(Reference,Ljava/io/BufferedOutputStream;);v5=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     move-object v5, v1
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/Throwable;);
a=0;//     move-object v1, v0
a=0;// 
a=0;//     move-object v0, v5
a=0;// 
a=0;//     goto :goto_2
a=0;// 
a=0;//     :catch_4
a=0;//     #v5=(Uninit);
a=0;//     move-exception v1
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public b(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-virtual {p0, p2}, Lcn/waps/ag;->a(Ljava/lang/String;)[B
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,[B);
a=0;//     invoke-virtual {p0, v0, p1}, Lcn/waps/ag;->a([BLjava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     return-object v0
a=0;// .end method
}}
