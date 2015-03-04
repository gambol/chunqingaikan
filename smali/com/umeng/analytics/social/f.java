package com.umeng.analytics.social; class f { void a() { int a;
a=0;// .class public abstract Lcom/umeng/analytics/social/f;
a=0;// .super Ljava/lang/Object;
a=0;// .source "UMUtils.java"
a=0;// 
a=0;// 
a=0;// # static fields
a=0;// .field private static a:Ljava/util/Map;
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// .end field
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     .prologue
a=0;//     .line 28
a=0;//     invoke-direct {p0}, Ljava/lang/Object;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcom/umeng/analytics/social/f;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected static a(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 3
a=0;// 
a=0;//     .prologue
a=0;//     .line 216
a=0;//     sget-object v0, Lcom/umeng/analytics/social/e;->d:Ljava/lang/String;
a=0;// 
a=0;//     .line 218
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 219
a=0;//     const-string v1, "MobclickAgent"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "use usefully appkey from constant field."
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2}, Lcom/umeng/analytics/social/b;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 241
a=0;//     :goto_0
a=0;//     #v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 224
a=0;//     :cond_0
a=0;//     :try_start_0
a=0;//     #v1=(Boolean);v2=(Uninit);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 225
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const/16 v2, 0x80
a=0;// 
a=0;//     #v2=(PosShort);
a=0;//     invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 227
a=0;//     if-eqz v0, :cond_2
a=0;// 
a=0;//     .line 228
a=0;//     iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->metaData:Landroid/os/Bundle;
a=0;// 
a=0;//     const-string v1, "UMENG_APPKEY"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 229
a=0;//     if-eqz v0, :cond_1
a=0;// 
a=0;//     .line 231
a=0;//     invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 233
a=0;//     :cond_1
a=0;//     const-string v0, "MobclickAgent"
a=0;// 
a=0;//     const-string v1, "Could not read UMENG_APPKEY meta-data from AndroidManifest.xml."
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcom/umeng/analytics/social/b;->b(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 241
a=0;//     :cond_2
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 238
a=0;//     :catch_0
a=0;//     #v0=(Reference,Ujava/lang/Object;);v1=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 239
a=0;//     const-string v1, "MobclickAgent"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v2, "Could not read UMENG_APPKEY meta-data from AndroidManifest.xml."
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v2, v0}, Lcom/umeng/analytics/social/b;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method private static a(Ljava/util/List;)Ljava/lang/String;
a=0;//     .locals 3
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lorg/apache/http/NameValuePair;",
a=0;//             ">;)",
a=0;//             "Ljava/lang/String;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 93
a=0;//     :try_start_0
a=0;//     new-instance v0, Ljava/io/ByteArrayOutputStream;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/io/ByteArrayOutputStream;);
a=0;//     invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V
a=0;// 
a=0;//     .line 94
a=0;//     #v0=(Reference,Ljava/io/ByteArrayOutputStream;);
a=0;//     new-instance v1, Lorg/apache/http/client/entity/UrlEncodedFormEntity;
a=0;// 
a=0;//     #v1=(UninitRef,Lorg/apache/http/client/entity/UrlEncodedFormEntity;);
a=0;//     const-string v2, "UTF-8"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, p0, v2}, Lorg/apache/http/client/entity/UrlEncodedFormEntity;-><init>(Ljava/util/List;Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lorg/apache/http/client/entity/UrlEncodedFormEntity;);
a=0;//     invoke-virtual {v1, v0}, Lorg/apache/http/client/entity/UrlEncodedFormEntity;->writeTo(Ljava/io/OutputStream;)V
a=0;// 
a=0;//     .line 95
a=0;//     invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toString()Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 100
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 96
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 97
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
a=0;// 
a=0;//     .line 100
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static varargs a([Lcom/umeng/analytics/social/UMPlatformData;)Ljava/util/List;
a=0;//     .locals 8
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "([",
a=0;//             "Lcom/umeng/analytics/social/UMPlatformData;",
a=0;//             ")",
a=0;//             "Ljava/util/List",
a=0;//             "<",
a=0;//             "Lorg/apache/http/NameValuePair;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     const/16 v7, 0x2c
a=0;// 
a=0;//     .line 104
a=0;//     #v7=(PosByte);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 105
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 106
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 108
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     array-length v4, p0
a=0;// 
a=0;//     #v4=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v5=(Conflicted);v6=(Conflicted);
a=0;//     if-lt v0, v4, :cond_2
a=0;// 
a=0;//     .line 119
a=0;//     array-length v0, p0
a=0;// 
a=0;//     if-lez v0, :cond_0
a=0;// 
a=0;//     .line 120
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 121
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 122
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 125
a=0;//     :cond_0
a=0;//     new-instance v0, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v0=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 127
a=0;//     #v0=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v4, Lorg/apache/http/message/BasicNameValuePair;
a=0;// 
a=0;//     #v4=(UninitRef,Lorg/apache/http/message/BasicNameValuePair;);
a=0;//     const-string v5, "platform"
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-direct {v4, v5, v1}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v4=(Reference,Lorg/apache/http/message/BasicNameValuePair;);
a=0;//     invoke-interface {v0, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 128
a=0;//     new-instance v1, Lorg/apache/http/message/BasicNameValuePair;
a=0;// 
a=0;//     #v1=(UninitRef,Lorg/apache/http/message/BasicNameValuePair;);
a=0;//     const-string v4, "usid"
a=0;// 
a=0;//     invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-direct {v1, v4, v2}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lorg/apache/http/message/BasicNameValuePair;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 130
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Integer);
a=0;//     if-lez v1, :cond_1
a=0;// 
a=0;//     .line 132
a=0;//     new-instance v1, Lorg/apache/http/message/BasicNameValuePair;
a=0;// 
a=0;//     #v1=(UninitRef,Lorg/apache/http/message/BasicNameValuePair;);
a=0;//     const-string v2, "weiboid"
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v1, v2, v3}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Lorg/apache/http/message/BasicNameValuePair;);
a=0;//     invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 135
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 108
a=0;//     :cond_2
a=0;//     #v0=(Integer);v1=(Reference,Ljava/lang/StringBuilder;);v4=(Integer);v5=(Conflicted);
a=0;//     aget-object v5, p0, v0
a=0;// 
a=0;//     .line 109
a=0;//     #v5=(Null);
a=0;//     invoke-virtual {v5}, Lcom/umeng/analytics/social/UMPlatformData;->getMeida()Lcom/umeng/analytics/social/UMPlatformData$UMedia;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     #v6=(Reference,Lcom/umeng/analytics/social/UMPlatformData$UMedia;);
a=0;//     invoke-virtual {v6}, Lcom/umeng/analytics/social/UMPlatformData$UMedia;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 110
a=0;//     invoke-virtual {v1, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 112
a=0;//     invoke-virtual {v5}, Lcom/umeng/analytics/social/UMPlatformData;->getUsid()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v6
a=0;// 
a=0;//     invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 113
a=0;//     invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 115
a=0;//     invoke-virtual {v5}, Lcom/umeng/analytics/social/UMPlatformData;->getWeiboId()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 116
a=0;//     invoke-virtual {v3, v7}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 108
a=0;//     add-int/lit8 v0, v0, 0x1
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static a(Landroid/content/Context;Ljava/lang/String;)Z
a=0;//     .locals 2
a=0;// 
a=0;//     .prologue
a=0;//     .line 287
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 288
a=0;//     #v0=(Reference,Landroid/content/pm/PackageManager;);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-eqz v0, :cond_0
a=0;// 
a=0;//     .line 289
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 291
a=0;//     :goto_0
a=0;//     #v0=(Boolean);
a=0;//     return v0
a=0;// 
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     const/4 v0, 0x1
a=0;// 
a=0;//     #v0=(One);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method protected static varargs a(Landroid/content/Context;Ljava/lang/String;[Lcom/umeng/analytics/social/UMPlatformData;)[Ljava/lang/String;
a=0;//     .locals 6
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lcom/umeng/analytics/social/a;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 41
a=0;//     if-eqz p2, :cond_0
a=0;// 
a=0;//     array-length v0, p2
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     .line 42
a=0;//     :cond_0
a=0;//     #v0=(Conflicted);
a=0;//     new-instance v0, Lcom/umeng/analytics/social/a;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/umeng/analytics/social/a;);
a=0;//     const-string v1, "platform data is null"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Lcom/umeng/analytics/social/a;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/umeng/analytics/social/a;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 44
a=0;//     :cond_1
a=0;//     #v0=(Integer);v1=(Uninit);
a=0;//     invoke-static {p0}, Lcom/umeng/analytics/social/f;->a(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 45
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_2
a=0;// 
a=0;//     .line 46
a=0;//     new-instance v0, Lcom/umeng/analytics/social/a;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/umeng/analytics/social/a;);
a=0;//     const-string v1, "can`t get appkey."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Lcom/umeng/analytics/social/a;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/umeng/analytics/social/a;);
a=0;//     throw v0
a=0;// 
a=0;//     .line 49
a=0;//     :cond_2
a=0;//     #v1=(Boolean);
a=0;//     new-instance v2, Ljava/util/ArrayList;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/ArrayList;);
a=0;//     invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V
a=0;// 
a=0;//     .line 51
a=0;//     #v2=(Reference,Ljava/util/ArrayList;);
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "http://log.umsns.com/share/api/"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, "/"
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 53
a=0;//     sget-object v0, Lcom/umeng/analytics/social/f;->a:Ljava/util/Map;
a=0;// 
a=0;//     if-eqz v0, :cond_3
a=0;// 
a=0;//     sget-object v0, Lcom/umeng/analytics/social/f;->a:Ljava/util/Map;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     .line 55
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);
a=0;//     invoke-static {p0}, Lcom/umeng/analytics/social/f;->c(Landroid/content/Context;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     sput-object v0, Lcom/umeng/analytics/social/f;->a:Ljava/util/Map;
a=0;// 
a=0;//     .line 58
a=0;//     :cond_4
a=0;//     #v0=(Conflicted);
a=0;//     sget-object v0, Lcom/umeng/analytics/social/f;->a:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     if-eqz v0, :cond_5
a=0;// 
a=0;//     sget-object v0, Lcom/umeng/analytics/social/f;->a:Ljava/util/Map;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_5
a=0;// 
a=0;//     .line 59
a=0;//     sget-object v0, Lcom/umeng/analytics/social/f;->a:Ljava/util/Map;
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     :goto_0
a=0;//     #v4=(Reference,Ljava/util/Iterator;);v5=(Conflicted);
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_8
a=0;// 
a=0;//     .line 64
a=0;//     :cond_5
a=0;//     #v0=(Conflicted);v4=(Conflicted);
a=0;//     new-instance v0, Lorg/apache/http/message/BasicNameValuePair;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/apache/http/message/BasicNameValuePair;);
a=0;//     const-string v1, "date"
a=0;// 
a=0;//     invoke-static {}, Ljava/lang/System;->currentTimeMillis()J
a=0;// 
a=0;//     move-result-wide v4
a=0;// 
a=0;//     #v4=(LongLo);v5=(LongHi);
a=0;//     invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v4
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1, v4}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/message/BasicNameValuePair;);
a=0;//     invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 65
a=0;//     new-instance v0, Lorg/apache/http/message/BasicNameValuePair;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/apache/http/message/BasicNameValuePair;);
a=0;//     const-string v1, "channel"
a=0;// 
a=0;//     sget-object v4, Lcom/umeng/analytics/social/e;->e:Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v0, v1, v4}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/message/BasicNameValuePair;);
a=0;//     invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 67
a=0;//     invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_6
a=0;// 
a=0;//     .line 69
a=0;//     new-instance v0, Lorg/apache/http/message/BasicNameValuePair;
a=0;// 
a=0;//     #v0=(UninitRef,Lorg/apache/http/message/BasicNameValuePair;);
a=0;//     const-string v1, "topic"
a=0;// 
a=0;//     invoke-direct {v0, v1, p1}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lorg/apache/http/message/BasicNameValuePair;);
a=0;//     invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     .line 72
a=0;//     :cond_6
a=0;//     #v0=(Conflicted);
a=0;//     invoke-static {p2}, Lcom/umeng/analytics/social/f;->a([Lcom/umeng/analytics/social/UMPlatformData;)Ljava/util/List;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/util/List;);
a=0;//     invoke-interface {v2, v0}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z
a=0;// 
a=0;//     .line 74
a=0;//     invoke-static {p2}, Lcom/umeng/analytics/social/f;->b([Lcom/umeng/analytics/social/UMPlatformData;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 76
a=0;//     if-nez v0, :cond_7
a=0;// 
a=0;//     .line 77
a=0;//     const-string v0, "null"
a=0;// 
a=0;//     .line 80
a=0;//     :cond_7
a=0;//     new-instance v1, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v1=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "?"
a=0;// 
a=0;//     invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v2}, Lcom/umeng/analytics/social/f;->a(Ljava/util/List;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v2
a=0;// 
a=0;//     invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 81
a=0;//     const-string v2, "MobclickAgent"
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "URL:"
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v2, v3}, Lcom/umeng/analytics/social/b;->c(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 82
a=0;//     const-string v2, "MobclickAgent"
a=0;// 
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v4, "BODY:"
a=0;// 
a=0;//     invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     invoke-static {v2, v3}, Lcom/umeng/analytics/social/b;->c(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 84
a=0;//     const/4 v2, 0x2
a=0;// 
a=0;//     #v2=(PosByte);
a=0;//     new-array v2, v2, [Ljava/lang/String;
a=0;// 
a=0;//     .line 85
a=0;//     #v2=(Reference,[Ljava/lang/String;);
a=0;//     const/4 v3, 0x0
a=0;// 
a=0;//     #v3=(Null);
a=0;//     aput-object v1, v2, v3
a=0;// 
a=0;//     .line 86
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     aput-object v0, v2, v1
a=0;// 
a=0;//     .line 88
a=0;//     return-object v2
a=0;// 
a=0;//     .line 59
a=0;//     :cond_8
a=0;//     #v0=(Boolean);v1=(Reference,Ljava/lang/String;);v3=(Reference,Ljava/lang/String;);v5=(Conflicted);
a=0;//     invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/util/Map$Entry;
a=0;// 
a=0;//     .line 60
a=0;//     new-instance v5, Lorg/apache/http/message/BasicNameValuePair;
a=0;// 
a=0;//     #v5=(UninitRef,Lorg/apache/http/message/BasicNameValuePair;);
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     check-cast v1, Ljava/lang/String;
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-direct {v5, v1, v0}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     #v5=(Reference,Lorg/apache/http/message/BasicNameValuePair;);
a=0;//     invoke-interface {v2, v5}, Ljava/util/List;->add(Ljava/lang/Object;)Z
a=0;// 
a=0;//     goto/16 :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static varargs b([Lcom/umeng/analytics/social/UMPlatformData;)Ljava/lang/String;
a=0;//     .locals 8
a=0;// 
a=0;//     .prologue
a=0;//     .line 139
a=0;//     new-instance v2, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v2=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V
a=0;// 
a=0;//     .line 141
a=0;//     #v2=(Reference,Lorg/json/JSONObject;);
a=0;//     array-length v3, p0
a=0;// 
a=0;//     #v3=(Integer);
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     #v0=(Null);
a=0;//     move v1, v0
a=0;// 
a=0;//     :goto_0
a=0;//     #v0=(Integer);v1=(Integer);v4=(Conflicted);v5=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     if-lt v1, v3, :cond_0
a=0;// 
a=0;//     .line 162
a=0;//     invoke-virtual {v2}, Lorg/json/JSONObject;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     if-nez v0, :cond_5
a=0;// 
a=0;//     .line 163
a=0;//     const/4 v0, 0x0
a=0;// 
a=0;//     .line 165
a=0;//     :goto_1
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 141
a=0;//     :cond_0
a=0;//     #v0=(Integer);
a=0;//     aget-object v4, p0, v1
a=0;// 
a=0;//     .line 143
a=0;//     #v4=(Null);
a=0;//     invoke-virtual {v4}, Lcom/umeng/analytics/social/UMPlatformData;->getGender()Lcom/umeng/analytics/social/UMPlatformData$GENDER;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 144
a=0;//     #v0=(Reference,Lcom/umeng/analytics/social/UMPlatformData$GENDER;);
a=0;//     invoke-virtual {v4}, Lcom/umeng/analytics/social/UMPlatformData;->getName()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     .line 147
a=0;//     #v5=(Reference,Ljava/lang/String;);
a=0;//     if-nez v0, :cond_1
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v6
a=0;// 
a=0;//     #v6=(Boolean);
a=0;//     if-nez v6, :cond_2
a=0;// 
a=0;//     .line 149
a=0;//     :cond_1
a=0;//     #v6=(Conflicted);
a=0;//     new-instance v6, Lorg/json/JSONObject;
a=0;// 
a=0;//     #v6=(UninitRef,Lorg/json/JSONObject;);
a=0;//     invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V
a=0;// 
a=0;//     .line 151
a=0;//     #v6=(Reference,Lorg/json/JSONObject;);
a=0;//     const-string v7, "gender"
a=0;// 
a=0;//     #v7=(Reference,Ljava/lang/String;);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     :goto_2
a=0;//     invoke-virtual {v6, v7, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     .line 152
a=0;//     const-string v7, "name"
a=0;// 
a=0;//     if-nez v5, :cond_4
a=0;// 
a=0;//     const-string v0, ""
a=0;// 
a=0;//     :goto_3
a=0;//     invoke-virtual {v6, v7, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     .line 154
a=0;//     invoke-virtual {v4}, Lcom/umeng/analytics/social/UMPlatformData;->getMeida()Lcom/umeng/analytics/social/UMPlatformData$UMedia;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Lcom/umeng/analytics/social/UMPlatformData$UMedia;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v2, v0, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
a=0;// 
a=0;//     .line 141
a=0;//     :cond_2
a=0;//     #v6=(Conflicted);v7=(Conflicted);
a=0;//     add-int/lit8 v0, v1, 0x1
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     move v1, v0
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 151
a=0;//     :cond_3
a=0;//     #v0=(Reference,Lcom/umeng/analytics/social/UMPlatformData$GENDER;);v6=(Reference,Lorg/json/JSONObject;);v7=(Reference,Ljava/lang/String;);
a=0;//     iget v0, v0, Lcom/umeng/analytics/social/UMPlatformData$GENDER;->value:I
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_2
a=0;// 
a=0;//     .line 152
a=0;//     :cond_4
a=0;//     invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     goto :goto_3
a=0;// 
a=0;//     .line 157
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);v6=(Conflicted);v7=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 158
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     new-instance v1, Lcom/umeng/analytics/social/a;
a=0;// 
a=0;//     #v1=(UninitRef,Lcom/umeng/analytics/social/a;);
a=0;//     const-string v2, "build body exception"
a=0;// 
a=0;//     invoke-direct {v1, v2, v0}, Lcom/umeng/analytics/social/a;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V
a=0;// 
a=0;//     #v1=(Reference,Lcom/umeng/analytics/social/a;);
a=0;//     throw v1
a=0;// 
a=0;//     .line 165
a=0;//     :cond_5
a=0;//     #v0=(Integer);v1=(Integer);v4=(Conflicted);v5=(Conflicted);
a=0;//     invoke-virtual {v2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     goto :goto_1
a=0;// .end method
a=0;// 
a=0;// .method public static b(Landroid/content/Context;)Ljava/util/Map;
a=0;//     .locals 5
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/content/Context;",
a=0;//             ")",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 252
a=0;//     new-instance v2, Ljava/util/HashMap;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v2}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     .line 253
a=0;//     #v2=(Reference,Ljava/util/HashMap;);
a=0;//     const-string v0, "phone"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/telephony/TelephonyManager;
a=0;// 
a=0;//     .line 254
a=0;//     if-nez v0, :cond_0
a=0;// 
a=0;//     .line 255
a=0;//     const-string v1, "MobclickAgent"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     const-string v3, "No IMEI."
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v1, v3}, Lcom/umeng/analytics/social/b;->e(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     .line 258
a=0;//     :cond_0
a=0;//     #v1=(Conflicted);v3=(Conflicted);
a=0;//     const/4 v1, 0x0
a=0;// 
a=0;//     .line 260
a=0;//     :try_start_0
a=0;//     #v1=(Null);
a=0;//     const-string v3, "android.permission.READ_PHONE_STATE"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v3}, Lcom/umeng/analytics/social/f;->a(Landroid/content/Context;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v3
a=0;// 
a=0;//     #v3=(Boolean);
a=0;//     if-eqz v3, :cond_4
a=0;// 
a=0;//     .line 261
a=0;//     invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 268
a=0;//     :goto_0
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     invoke-static {p0}, Lcom/umeng/analytics/social/f;->d(Landroid/content/Context;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     .line 269
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     #v3=(Reference,Landroid/content/ContentResolver;);
a=0;//     const-string v4, "android_id"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v4}, Landroid/provider/Settings$Secure;->getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v3
a=0;// 
a=0;//     .line 271
a=0;//     invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v4
a=0;// 
a=0;//     #v4=(Boolean);
a=0;//     if-nez v4, :cond_1
a=0;// 
a=0;//     const-string v4, "mac"
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v2, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 272
a=0;//     :cond_1
a=0;//     #v4=(Conflicted);
a=0;//     invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_2
a=0;// 
a=0;//     const-string v1, "imei"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 273
a=0;//     :cond_2
a=0;//     #v1=(Conflicted);
a=0;//     invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     const-string v0, "android_id"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v2, v0, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 275
a=0;//     :cond_3
a=0;//     #v0=(Conflicted);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 264
a=0;//     :catch_0
a=0;//     #v0=(Reference,Landroid/telephony/TelephonyManager;);v1=(Null);v3=(Conflicted);v4=(Uninit);
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 265
a=0;//     const-string v3, "MobclickAgent"
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     const-string v4, "No IMEI."
a=0;// 
a=0;//     #v4=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v3, v4, v0}, Lcom/umeng/analytics/social/b;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V
a=0;// 
a=0;//     :cond_4
a=0;//     #v3=(Conflicted);v4=(Conflicted);
a=0;//     move-object v0, v1
a=0;// 
a=0;//     #v0=(Null);
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method private static c(Landroid/content/Context;)Ljava/util/Map;
a=0;//     .locals 7
a=0;//     .annotation system Ldalvik/annotation/Signature;
a=0;//         value = {
a=0;//             "(",
a=0;//             "Landroid/content/Context;",
a=0;//             ")",
a=0;//             "Ljava/util/Map",
a=0;//             "<",
a=0;//             "Ljava/lang/String;",
a=0;//             "Ljava/lang/String;",
a=0;//             ">;"
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .annotation system Ldalvik/annotation/Throws;
a=0;//         value = {
a=0;//             Lcom/umeng/analytics/social/a;
a=0;//         }
a=0;//     .end annotation
a=0;// 
a=0;//     .prologue
a=0;//     .line 180
a=0;//     new-instance v2, Ljava/util/HashMap;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/util/HashMap;);
a=0;//     invoke-direct {v2}, Ljava/util/HashMap;-><init>()V
a=0;// 
a=0;//     .line 182
a=0;//     #v2=(Reference,Ljava/util/HashMap;);
a=0;//     invoke-static {p0}, Lcom/umeng/analytics/social/f;->b(Landroid/content/Context;)Ljava/util/Map;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 183
a=0;//     #v0=(Reference,Ljava/util/Map;);
a=0;//     if-eqz v0, :cond_4
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_4
a=0;// 
a=0;//     .line 184
a=0;//     new-instance v3, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v3=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 185
a=0;//     #v3=(Reference,Ljava/lang/StringBuilder;);
a=0;//     new-instance v4, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v4=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V
a=0;// 
a=0;//     .line 187
a=0;//     #v4=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;
a=0;// 
a=0;//     move-result-object v5
a=0;// 
a=0;//     :cond_0
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v5=(Reference,Ljava/util/Iterator;);v6=(Conflicted);
a=0;//     invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Boolean);
a=0;//     if-nez v0, :cond_3
a=0;// 
a=0;//     .line 194
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_1
a=0;// 
a=0;//     .line 195
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 196
a=0;//     const-string v0, "deviceid"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 198
a=0;//     :cond_1
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     if-lez v0, :cond_2
a=0;// 
a=0;//     .line 199
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->length()I
a=0;// 
a=0;//     move-result v0
a=0;// 
a=0;//     add-int/lit8 v0, v0, -0x1
a=0;// 
a=0;//     invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->deleteCharAt(I)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 200
a=0;//     const-string v0, "idtype"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
a=0;// 
a=0;//     .line 206
a=0;//     :cond_2
a=0;//     #v0=(Conflicted);v1=(Conflicted);
a=0;//     return-object v2
a=0;// 
a=0;//     .line 187
a=0;//     :cond_3
a=0;//     #v0=(Boolean);
a=0;//     invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v0, Ljava/util/Map$Entry;
a=0;// 
a=0;//     .line 188
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Ljava/lang/CharSequence;
a=0;// 
a=0;//     invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-nez v1, :cond_0
a=0;// 
a=0;//     .line 189
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/Object;);
a=0;//     check-cast v1, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v6, ","
a=0;// 
a=0;//     #v6=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     .line 190
a=0;//     invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Ljava/lang/String;
a=0;// 
a=0;//     invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     const-string v1, ","
a=0;// 
a=0;//     invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 203
a=0;//     :cond_4
a=0;//     #v1=(Conflicted);v3=(Uninit);v4=(Uninit);v5=(Uninit);v6=(Uninit);
a=0;//     new-instance v0, Lcom/umeng/analytics/social/a;
a=0;// 
a=0;//     #v0=(UninitRef,Lcom/umeng/analytics/social/a;);
a=0;//     const-string v1, "can`t get device id."
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v0, v1}, Lcom/umeng/analytics/social/a;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v0=(Reference,Lcom/umeng/analytics/social/a;);
a=0;//     throw v0
a=0;// .end method
a=0;// 
a=0;// .method private static d(Landroid/content/Context;)Ljava/lang/String;
a=0;//     .locals 4
a=0;// 
a=0;//     .prologue
a=0;//     .line 303
a=0;//     :try_start_0
a=0;//     const-string v0, "wifi"
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     check-cast v0, Landroid/net/wifi/WifiManager;
a=0;// 
a=0;//     .line 304
a=0;//     const-string v1, "android.permission.ACCESS_WIFI_STATE"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {p0, v1}, Lcom/umeng/analytics/social/f;->a(Landroid/content/Context;Ljava/lang/String;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     .line 305
a=0;//     invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 306
a=0;//     invoke-virtual {v0}, Landroid/net/wifi/WifiInfo;->getMacAddress()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     .line 315
a=0;//     :goto_0
a=0;//     #v1=(Conflicted);v2=(Conflicted);v3=(Conflicted);
a=0;//     return-object v0
a=0;// 
a=0;//     .line 308
a=0;//     :cond_0
a=0;//     #v1=(Boolean);v2=(Uninit);v3=(Uninit);
a=0;//     const-string v0, "MobclickAgent"
a=0;// 
a=0;//     .line 309
a=0;//     const-string v1, "Could not get mac address.[no permission android.permission.ACCESS_WIFI_STATE"
a=0;// 
a=0;//     .line 308
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     invoke-static {v0, v1}, Lcom/umeng/analytics/social/b;->e(Ljava/lang/String;Ljava/lang/String;)V
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     .line 315
a=0;//     :goto_1
a=0;//     #v2=(Conflicted);v3=(Conflicted);
a=0;//     const-string v0, ""
a=0;// 
a=0;//     goto :goto_0
a=0;// 
a=0;//     .line 312
a=0;//     :catch_0
a=0;//     move-exception v0
a=0;// 
a=0;//     .line 313
a=0;//     #v0=(Reference,Ljava/lang/Exception;);
a=0;//     const-string v1, "MobclickAgent"
a=0;// 
a=0;//     #v1=(Reference,Ljava/lang/String;);
a=0;//     new-instance v2, Ljava/lang/StringBuilder;
a=0;// 
a=0;//     #v2=(UninitRef,Ljava/lang/StringBuilder;);
a=0;//     const-string v3, "Could not get mac address."
a=0;// 
a=0;//     #v3=(Reference,Ljava/lang/String;);
a=0;//     invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/StringBuilder;);
a=0;//     invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     invoke-static {v1, v0}, Lcom/umeng/analytics/social/b;->e(Ljava/lang/String;Ljava/lang/String;)V
a=0;// 
a=0;//     goto :goto_1
a=0;// .end method
}}
